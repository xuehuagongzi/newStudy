package leetcode.string;

/**
 * Created by zhangwenqiang on 2017/4/19.
 * Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string.
 * If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters,
 * then reverse the first k characters and left the other as original.
 *
 * 大概意思是字符串隔k个再reverse，最后不足k个全部翻转
 */
public class Reverse_String_II {
    public static String reverseWords(String string,int k) {
        if(string!=null) {
            char str[] = string.toCharArray();
            int start = 0;
            while (k <= string.length() - start) {
                reverseCharArray(str, start, k);
                start += k * 2;
            }
            if (string.length() - start > 0) {
                reverseCharArray(str, start, string.length() - start);
            }
            return new String(str);
        }else {
            return null;
        }
    }

    //str字符串从start位置开始算起，reverse  k个字符
    public static char[] reverseCharArray(char str[],int start,int k){
        int endIdx=start+k-1;
        for (int i = start; i <start+k/2; i++) {
            char tmp=str[i];
            str[i]=str[endIdx];
            str[endIdx]=tmp;
            endIdx--;
        }
        return str;
    }

    public static void main(String[] args) {
        String string="asdfghjkyuixzz";
        System.out.println(reverseWords(string,2));
    }
}
