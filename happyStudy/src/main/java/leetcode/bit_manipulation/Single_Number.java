package leetcode.bit_manipulation;

/**
 * Created by zhangwenqiang on 2017/6/24.
 */
public class Single_Number {
    public static void main(String[] args) {
        int[] num={4,3,2,1,1,2,3,4,0};
        System.out.println(single_Number(num));
    }

    public static int single_Number(int[] num){
        int result = 0;
        for (int i = 0; i<num.length; i++)
        {
            result =result^num[i];
        }
        return result;
    }
}
