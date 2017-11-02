package niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by zhangwenqiang on 2017/9/10.
 */
public class Toutiao2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //总人数
        int personNums=sc.nextInt();
        //最初的人注册序列，12345
//        List persons=new ArrayList<Integer>();
        //最后的输出结果
        List result=new ArrayList<Integer>();
        int personscopy[]=new int[personNums];
        for (int i = 0; i < personNums; i++) {
//            persons.add(sc.nextInt());
            personscopy[i]=sc.nextInt();
        }
        int testGroup=sc.nextInt();
        if(testGroup>0) {
            for (int i = 0; i < testGroup; i++) {
                int[] nums = new int[3];
                int j = 0;
                for (j = 0; j < 3; j++) {
                    nums[j] = sc.nextInt();
                }
                //nums里面是1 2 1
                int eachCount = 0;
                for (int k = nums[0] - 1; k <= nums[1] - 1; k++) {
                    if(personscopy[k]>Integer.valueOf(nums[2])){
                        break;
                    }
                    if (personscopy[k] == Integer.valueOf(nums[2])) {
                        eachCount++;
                    }
                }
                result.add(eachCount);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
