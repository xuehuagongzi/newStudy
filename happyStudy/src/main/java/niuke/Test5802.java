package niuke;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zhangwenqiang on 2017/9/23.
 */
public class Test5802 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n=sr.nextInt();
        if(n<3){
            System.out.println(0);
        }
        Double f[]=new Double[n];
        for(int i=0;i<n;i++){
            f[i]=sr.nextDouble();
        }
        int count=0;
        for (int i = 0; i < f.length; i++) {
            for (int j=f.length-1;j>i+1;j--){
                if(f[j]-f[i]<180){
                    count = count+j-i-1;
                    break;
                }
            }
        }
        System.out.println(count);
    }


    public static int findMaxDivision(int[]A,int n){
        int maxnum=A[0];
        int minnum=A[0];
        for(int i=0;i<A.length;i++){
            if(maxnum<A[i])
                maxnum=A[i];
            if(minnum>A[i])
                minnum=A[i];
        }
        int[]arr=new int[maxnum-minnum+1]; // 生成桶
        for(int i=0;i<A.length;i++){
            arr[A[i]-minnum]++; // 填桶
        }
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){ // 桶为空
                count++;   //记录连续空桶数
            }else{
                if(max<count)
                    max=count;
                count=0;
            }
        }
        return max+1;  //如最大值为9，最小值为3，中间有5个空桶，但差值应为6
    }

}
