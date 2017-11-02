package dp;

/**
 * Created by zhangwenqiang on 2017/8/1.
 */
public class Maximum_Subarray {
    public static void main(String[] args) {
//        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int[] nums={1};
        System.out.println(getMax(nums));
    }

    public static int getMax(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        int res=nums[0];
        int[] fi=new int[nums.length];
        fi[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            fi[i]=Math.max((fi[i-1]+nums[i]),nums[i]);
            if(fi[i]>res) {
                res = fi[i];
            }
        }
        return res;
    }
}
