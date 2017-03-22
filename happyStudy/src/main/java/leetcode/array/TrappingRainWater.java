package leetcode.array;

/**
 * Created by zhangwenqiang on 2017/3/20.
 */
public class TrappingRainWater {
    public static int trap(int[] height) {
        if(height.length<=2){
            return 0;
        }
        int leftMax[]=new int[height.length];
        int rightMax[]=new int[height.length];
        int leftTempMax=height[0];
        for (int i = 1; i < height.length; i++) {
            if(height[i-1]>leftTempMax){
                leftTempMax=height[i-1];
            }
            leftMax[i]=leftTempMax;
        }

        rightMax[height.length-2]=height[height.length-1];
        int rightTempMax=rightMax[height.length-2];
        for (int j = height.length-3; j >=1; j--) {
            if(height[j+1]>rightTempMax){
                rightTempMax=height[j+1];
            }
            rightMax[j]=rightTempMax;
        }
        int sum=0;
        for (int i = 1; i < height.length-1; i++) {
            int tempHeight=leftMax[i]>rightMax[i]? rightMax[i]:leftMax[i];
            if(tempHeight-height[i]>0) {
                sum += tempHeight - height[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
