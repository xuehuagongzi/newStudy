package leetcode.array;

import java.util.Stack;

/**
 * Created by zhangwenqiang on 2017/3/20.
 */
public class LargestRectangleinHistogram {

    public static int largestRectangleArea(int[] height) {
        int len = height.length;
        Stack<Integer> s = new Stack<Integer>();
        int maxArea = 0;
        for(int i = 0; i <= len; i++){
            int h = (i == len ? 0 : height[i]);
            if(s.isEmpty() || h >= height[s.peek()]){
                s.push(i);
            }else{
                int tp = s.pop();
                maxArea = Math.max(maxArea, height[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
                i--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height={2,1,5,6,3,3,4};
        largestRectangleArea(height);
    }
}
