package dp;

/**
 * Created by zhangwenqiang on 2017/8/3.
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed, the only constraint
 * stopping you from robbing each of them is that adjacent houses
 * have security system connected and it will automatically contact the police
 * if two adjacent houses were broken into on the same night.

 Given a list of non-negative integers representing the amount of money of each house,
 determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class House_obber {
    public static void main(String[] args) {
        int[] nums={1,3,7,8,0};
        System.out.println(robHouse(nums));
    }

    public static int robHouse(int[] nums){
        int res = 0;
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0], nums[1]);
        }
        if(nums.length>2) {
            int fi[] = new int[nums.length];
            fi[0] = nums[0];
            fi[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < nums.length; i++) {
                fi[i] = Math.max((nums[i] + fi[i - 2]), fi[i - 1]);
            }
            res = fi[nums.length - 1];
        }else {
            res=0;
        }
        return res;
    }
}
