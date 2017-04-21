package leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhangwenqiang on 2017/4/20.
 *
 * Given a positive 32-bit integer n, you need to find the smallest 32-bit integer which has exactly the same digits existing in the integer n and is greater in value than n. If no such positive 32-bit integer exists, you need to return -1.

 Example 1:
 Input: 12
 Output: 21
 Example 2:
 Input: 21
 Output: -1

 这道题给了我们一个数字，让我们对各个位数重新排序，求出刚好比给定数字大的一种排序，如果不存在就返回-1。
 这道题给的例子的数字都比较简单，我们来看一个复杂的，比如12443322，这个数字的重排序结果应该为13222344，
 如果我们仔细观察的话会发现数字变大的原因是左数第二位的2变成了3，细心的童鞋会更进一步的发现后面的数字由降序变为了升序，
 这也不难理解，因为我们要求刚好比给定数字大的排序方式。
 */
public class Next_Greater_Element_III {

    public static void main(String[] args) {
        int a = 101;
        int b = greter_element(a);
        System.out.println(b);
    }

    private static int greter_element(int a) {
        String str = String.valueOf(a);
        char ch[] = str.toCharArray();
        int num=0;
        //本身如果是降序排列，则直接返回-1，表示没有比他大的数了
        for (int i = 0; i < ch.length-1; i++) {
            if(ch[i]>=ch[i+1]){
                num++;
            }
        }
        //没有比他大的数就返回-1
       if(ch.length<=1 || num==ch.length-1){
            return -1;
       }
        List<Long> resultList = new ArrayList<>();
        for (int i = ch.length - 1; i > 0; i--) {
            int tmp = i;
            int tmp2 = i - 1;
            while (ch[tmp] <= ch[tmp2] && tmp2>0) {
                tmp2--;
            }
            char[] sortedch=str.toCharArray();
            swap(sortedch,tmp,tmp2);
            //对数组排序从  fromIndex 到  endIndex  排序方法的使用
            Arrays.sort(sortedch, tmp2+1, str.length());
            long val = Long.parseLong(new String(sortedch));
            //字符串011 最后转成整形变成了11，所以加了以下判断   测试用例为101
            if(val>a) {
                resultList.add(val);
            }
        }
        Collections.sort(resultList);
        try {//整数越界就返回-1
            return Math.toIntExact(resultList.get(0));
        }catch (Exception e){
            return -1;
        }
    }

    private static void swap(char[] ch,int a, int b) {
        char tmp = ' ';
        tmp = ch[a];
        ch[a] = ch[b];
        ch[b] = tmp;
    }
}
