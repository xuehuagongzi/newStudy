package leetcode.array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by zhangwenqiang on 2017/3/6.
 * Given an array of intergers, find two numbers such that they add up to a specific target number. The
 function twoSum should return indices of the two numbers such that they add up to the target,
 where index1 must be less than index2 Please note that your returned answers (both index1 and
 index2) are not zero-based.
 You may assume that each input would have exactly one solution.
 Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 题目翻译： 这道题目的意思是给定一个数组和一个值， 让求出这个数组中两个值的和等于这个给定值的坐
 标。 输出是有要求的， 1， 坐标较小的放在前面， 较大的放在后面。 2， 这俩坐标不能为零。
 */
public class TwoSumSolution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        if(nums.length<1){
            return result;
        }
        int i=0;
        for(int key:map.keySet()){
          if(map.containsKey(target - key)){
                int index = map.get(target -key);
                if (index == i) {
                    continue;
                } else {
                    if (index > i) {
                        result[0] = i+1;
                        result[1] = index+1;
                        break;
                    } else {
                        result[1] = i+1;
                        result[0] = index+1;
                        break;
                    }
                }
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[]={10,3,5,0,16,9,15};
        int res[]=twoSum(nums,19);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
