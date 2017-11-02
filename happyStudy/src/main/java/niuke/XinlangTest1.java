package niuke;

import java.util.Scanner;

/**
 * Created by zhangwenqiang on 2017/9/17.
 */
public class XinlangTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        String[] strNums = str.split(" ");
        int[] nums = new int[strNums.length];
        for (int i = 0; i < strNums.length; i++) {
            nums[i] = Integer.valueOf(strNums[i]);
        }



    }
}
