package niuke;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangwenqiang on 2017/10/25.
 */
public class JinriTouTiao1 {
    public static void main(String[] args) {
        String str="aabbbaa";
//        getMaxSequnceSameChar(str);
        reverse(str,3);
    }

    public static void reverse(String str,int k){
        int max=0;
        for (int i = 0; i < str.length(); i++) {
            String temp=new String(str);
            if(temp.charAt(i)=='a'){
                temp=temp.substring(0,i)+'b'+temp.substring(i+1);
            }else {
                temp=temp.substring(0,i)+'a'+temp.substring(i+1);
            }
            if(k==1){
                if(getMaxSequnceSameChar(temp)>max){
                    max=getMaxSequnceSameChar(temp);
                }
            }
            if(k>0) {
                reverse(temp, k - 1);
            }
        }
        System.out.println(max);
    }

    public static int getMaxSequnceSameChar(String str){
        if(str==null){
            return 0;
        }
        int[] fi=new int[str.length()];
        int max=1;
        fi[0]=1;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1)==str.charAt(i)){
                fi[i]=fi[i-1]+1;
            }else {
                fi[i]=1;
            }
            if(fi[i]>max){
                max=fi[i];
            }
        }
        System.out.println(max);
        return max;
    }
}
