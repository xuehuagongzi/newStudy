package leetcode.array;

/**
 * Created by zhangwenqiang on 2017/3/22.
 */
public class PalindromeNumber {
    private static boolean isPalindromeNumber(int num){
        int critera=num;
        int palNumber=0;
        while(num!=0){
            palNumber=palNumber*10;
            palNumber+=num%10;
            num=num/10;
        }
        if(palNumber==critera){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num=234565432;
        if(isPalindromeNumber(num)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
