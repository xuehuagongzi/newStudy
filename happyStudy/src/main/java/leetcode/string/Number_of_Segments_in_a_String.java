package leetcode.string;

/**
 * Created by zhangwenqiang on 2017/6/18.
 */
public class Number_of_Segments_in_a_String {
    public static void main(String[] args) {
        String string=",          ,";
        System.out.println(countSegments(string));
    }

    public static int countSegments(String s) {
        int res=0;
        for(int i=0; i<s.length(); i++)
            if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' '))
                res++;
        return res;
    }

}
