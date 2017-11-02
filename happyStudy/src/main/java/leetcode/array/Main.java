package leetcode.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String string=sc.nextLine();
//        String[] split=string.split(" ");
//        int length=split.length;
//        int[] intArray=new int[length];
//        for(int i=0;i<length;i++){
//            intArray[i]=Integer.parseInt(split[i]);
//        }
        List nums=new ArrayList<>();
        while (sc.hasNextInt()) {                                       // 判断输入的是否是整数
            int a = sc.nextInt();
            if(a==0){
                break;
            }
            nums.add(a);

        }
        System.out.println(nums);

    }
    public static int maxsequence3(int a[])
    {
        int len=a.length;
        int maxsum, maxhere;
        maxsum = maxhere = a[0];   //初始化最大和为a【0】
        for (int i=1; i<len; i++) {
            if (maxhere <= 0)
                maxhere = a[i];  //如果前面位置最大连续子序列和小于等于0，则以当前位置i结尾的最大连续子序列和为a[i]
            else
                maxhere += a[i]; //如果前面位置最大连续子序列和大于0，则以当前位置i结尾的最大连续子序列和为它们两者之和
            if (maxhere > maxsum) {
                maxsum = maxhere;  //更新最大连续子序列和
            }
        }
        return maxsum;
    }
}