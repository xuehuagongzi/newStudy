package niuke;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zhangwenqiang on 2017/9/23.
 */
public class Test58 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n=sr.nextInt();
        Double f[]=new Double[n];
        for(int i=0;i<n;i++){
            f[i]=sr.nextDouble();
        }
        int count=0;
        for(int i=0;i<n;i++){
            double min =f[i];
            double max =f[i];
            for(int j=i+1;j<n;j++){
                for (int k =j+1; k < n; k++) {
                    if(f[j]>f[i]){
                        max=f[j];
                    }else {
                        min=f[j];
                    }
                    if(f[k]>f[j]){
                        max=f[k];
                    }else {
                        min=f[k];
                    }
                    if(max-min<180){
                        count++;
                    }
                }
            }
        }
        //max即为最大距离，用String的format方法转成小数点后保留8位输出。
        System.out.println(count);
    }
}
