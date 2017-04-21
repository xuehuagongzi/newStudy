package leetcode.string;


/**
 * Created by zhangwenqiang on 2017/4/19.
 */
public class Longest_Uncommon_Subsequence_I {

    public static int uncommenSubsequence(String str1,String str2){
        return str1.equals(str2)? -1: Math.max(str1.length(),str2.length());
    }

    public static void main(String[] args) {
        String str1="abc";
        String str2="ll";
        System.out.println(uncommenSubsequence(str1,str2));
    }
}
