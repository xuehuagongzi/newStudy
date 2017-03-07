package leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangwenqiang on 2017/3/6.
 * Given an array of intergers, find two numbers such that they add up to a specific target number. The
 * function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2 Please note that your returned answers (both index1 and
 * index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 * 题目翻译： 这道题目的意思是给定一个数组和一个值， 让求出这个数组中两个值的和等于这个给定值的坐
 * 标。 输出是有要求的， 1， 坐标较小的放在前面， 较大的放在后面。 2， 这俩坐标不能为零。
 **/
public class TwoSumSolution {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            //避免了[3,3]  6,map中key重复的问题
            if (map.containsKey(target - numbers[i])) {
                //同时保证了result[1]存放的是较大的值
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[]={3,3};
        int res[]=twoSum(nums,6);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
/*
总结：
两个数的和可以通过map来计算，key是值，value是数组下标，复杂度是n。若要是两次循环的话复杂度是n*n
 */