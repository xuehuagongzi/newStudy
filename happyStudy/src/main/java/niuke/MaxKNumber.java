package niuke;

import java.util.Scanner;

/**
 * Created by zhangwenqiang on 2017/8/30.
 */
public class MaxKNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] numStr=str.split(" ");
        int[] nums=new int[numStr.length];
        for (int i = 0; i < numStr.length; i++) {
            nums[i]=Integer.valueOf(numStr[i]);
        }
        int[] input=new int[100];
        for (int i = 0; i < nums.length; i++) {
            input[nums[i]]++;
        }
        int index=0;
        int k=sc.nextInt();
        for (int i = input.length-1; i >=0 ; i--) {
            if(index<k) {
                index += input[i];
                if(index>=k){
                    System.out.println(i);
                }
            }
        }
    }
}
