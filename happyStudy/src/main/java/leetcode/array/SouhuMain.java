package leetcode.array;

import java.util.Scanner;

/**
 * Created by zhangwenqiang on 2017/8/28.
 */
public class SouhuMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string="";
        while((string=sc.nextLine())!=null) {
//            String string = sc.nextLine();
            String[] split = string.split(" ");
            int length = split.length;
            int[] intArray = new int[length];
            for (int i = 0; i < length; i++) {
                intArray[i] = Integer.parseInt(split[i]);
            }
            int index=0;
            for (int i = 0; i < length; i++) {
                if(intArray[i]==0){
                    index++;
                }
                if(index==6){
                    return;
                }
            }
            int sum=0;
            for (int i = length-1; i >=0; i--) {
                sum+=(i+1)*(i+1)*intArray[i];
            }
            System.out.println(sum/36);
        }
    }
}
