package leetcode.binary_search;

import java.util.Scanner;

/**
 * Created by zhangwenqiang on 2017/5/31.
 */
public class guess_number_higher_or_lower {
    public static void main(String[] args) {
        int n=10;int guess=4;
        System.out.println(guessNumber(n,guess));
    }

    public static int guessNumber(int n,int guess) {
        int low=1;int high=n;
        int result=0;
        while (low<=high){
            int mid=(low+high)/2;
            if(mid==guess){
                result=mid;
                return  result;
            }
            if(mid<guess){
                low=mid+1;
            }
            if(mid>guess){
                high=mid-1;
            }
        }
        return result;
    }
}
