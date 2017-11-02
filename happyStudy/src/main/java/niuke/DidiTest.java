package niuke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DidiTest{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        String str=sc.nextLine();
        int k=sc.nextInt();
        int[] result=new int[24];
        for (int i = 0; i < str.length(); i++) {
            result[Integer.valueOf(str.charAt(i))-97]++;
        }
        for (int i = 0; i < 24; i++) {
            if(result[i]>0){
                list.add(result[i]);
            }
        }
        for (int i = 0; i < k; i++) {
            int max=result[0];
            int tempIndex=0;
            for (int j = 1; j <result.length; j++) {
                if(result[j]>max){
                    max=result[j];
                    tempIndex=j;
                }
            }
            result[tempIndex]--;
        }
        int sum=0;
        for (int i = 0; i < result.length; i++) {
            sum+=Math.pow(result[i],2);
        }
        System.out.println(sum);
    }
}