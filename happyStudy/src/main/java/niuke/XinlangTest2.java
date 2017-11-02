package niuke;

import java.util.Scanner;

/**
 * Created by zhangwenqiang on 2017/9/17.
 */
public class XinlangTest2 {
    public static void main(String[] args) {
        int a[]=new int[10];
        a[0]=1;a[1]=3;a[2]=5;
        int b[]={2,4,6};
        merge(a,b);
    }

    public static void merge(int [] a,int[] b){
        int i=0,j=0,k=0;
        //a数组加入元素数i，b数组加入元素数j
        while (j<b.length){
            if(a[i]>b[j]){
                a[a.length-1-i-j]=b[j];
                j++;
            }else {
                a[a.length-1-i-j]=a[i];
                i++;
            }
        }
        while (i<a.length-b.length){
            a[a.length-1-i-j]=a[i];
            i++;
        }
    }
}
