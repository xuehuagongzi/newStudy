package leetcode.string;

/**
 * Created by zhangwenqiang on 2017/4/20.
 */
public class MySelf_KMP {


    public static void main(String[] args) {
        String str="ababaabcac";
        String strPattern="abaabcac";
        int next[]=getNext(strPattern);
        int kmp=myself_kmp(str,strPattern,next);
        System.out.println(kmp);
    }

    public static int myself_kmp(String s,String t,int next[]){
        char strs[]=s.toCharArray();
        char strt[]=t.toCharArray();
        int i=0,j=0;
        int result=-1;
        while(i<strs.length && j<strt.length){
            if(j==-1 || strs[i]==strt[j]){
                i++;
                j++;
                if(j==strt.length){
                    result=i-j;
                }
            }else {
                j=next[j];
            }
        }
        return result;
    }


    //kmp 与普通的字符串模式匹配就是保证了字符串指针i 不回退。从而将复杂度从o(m*n)--->o(m+n)
    //这样不会有问题么？不会的。字符串指针i不回退，但是模式字符串会根据next[]也可能不回退到原点。
    //next[]就是表示当模式字符串匹配到T[j]失败时，在模式串需要重新与主串准备开始匹配的位置
    // 所以相当于省略了两个指针都回退到原点再遍历的过程。
    //下面看next数组怎么得到

    //问题0
    // 为什么next[0]初始化为-1？？
    //    答：next[]就是表示当模式字符串匹配到T[j]失败时，在模式串需要重新与主串准备开始匹配的位置.
    //    当T[0]都失败了，说明第一个字符都不一样，那么直接前进就好了，就不存在重新与主串准备开始匹配的位置.
    //问题1
    // 为什么next[1]一定等于0？？
    //      next[]就是表示当模式字符串匹配到T[j]失败时，在模式串需要重新与主串准备开始匹配的位置.
    //问题2
    //strPattern.charAt(i)和strPattern.charAt(j)分别代表什么？？
    //答：因为在求解next[j]时，需要根据s[j-1]和s[next[j-1]]进行比较
    //所以当第2次循环时，i=1，j=next[1]

    private static int[] getNext(String strPattern) {
        int next[]=new int[strPattern.length()];
        next[0]=-1;
        int i=1;
        int j=-1;//j是next(j-1)或者next(next())的值
        while(i<strPattern.length()-1){
            if(j==-1 || strPattern.charAt(i)==strPattern.charAt(j)){
                i++;
                j++;
                next[i]=j;
            }else {
                j=next[j];
            }
        }
        return next;
    }
}
