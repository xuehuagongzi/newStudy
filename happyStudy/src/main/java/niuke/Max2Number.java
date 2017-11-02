package niuke;

import java.util.Scanner;

/**
 * Created by zhangwenqiang on 2017/8/30.
 */
public class Max2Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] strNums=str.split(" ");
        int[] nums=new int[strNums.length];
        for (int i = 0; i < strNums.length; i++) {
            nums[i]=Integer.valueOf(strNums[i]);
        }
        int firstMax=Integer.MIN_VALUE;
        int secondMax=firstMax;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>firstMax){
                secondMax=firstMax;
                firstMax=nums[i];
            }else if(nums[i]>secondMax){
                secondMax=nums[i];
            }
        }
        System.out.println(secondMax);
    }
}
