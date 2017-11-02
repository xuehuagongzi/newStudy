package leetcode.stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by zhangwenqiang on 2017/7/17.
 */
public class Next_Greater_Element_I {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,2,4};
        int[] nums2 = {6,5,4,3,2,1,7};
        nextGreaterElement(nums1, nums2);
    }

//    public static int[] next_greater(int[] nums1, int[] nums2) {
//        HashMap map = new HashMap<Integer, Integer>();
//        ArrayList arrayList = new ArrayList<Integer>();
//        for (int i = 0; i < nums2.length; i++) {
//            map.put(nums2[i], i);
//        }
//        for (int i = 0; i < nums1.length; i++) {
//            int index = (int) map.get(nums1[i]);
//            if (index + 1 < nums2.length) {
//                for (int j = index + 1; j < nums2.length; j++) {
//                    if (nums2[j] > nums1[i]) {
//                        arrayList.add(nums2[j]);
//                        break;
//                    }
//                    if(j==nums2.length-1) {
//                        arrayList.add(-1);
//                        break;
//                    }
//                }
//            } else {
//                arrayList.add(-1);
//            }
//        }
//        int[] result=new int[nums1.length];
//        for (int i = 0; i < arrayList.size(); i++) {
//            result[i]= (int) arrayList.get(i);
//        }
//        return result;
//    }

    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            //只要栈里边的元素比当前元素大，就一直入栈，不出栈
            //把栈顶元素小于当前元素大数全部出栈，把放到map中，当前元素入栈
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
}
