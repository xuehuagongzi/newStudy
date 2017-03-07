package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangwenqiang on 2017/3/7.
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all
 * unique triplets in the array which gives the sum of zero.
 * Note: Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c) The solution set
 * must not contain duplicate triplets.
 * 题目翻译：
 * 给定一个整型数组num， 找出这个数组中满足这个条件的所有数字： num[i]+num[j]+num[k] = 0. 并且所有
 * 的答案是要和其他不同的， 也就是说两个相同的答案是不被接受的
 * 题目的两点要求：
 *    1. 每个答案组里面的三个数字是要从大到小排列起来的。
 *    2. 每个答案不可以和其他的答案相同
 */
public class ThreeSumSolution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listList=new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j=i+1;
            int m=nums.length-1;
            //要做好控制边界的量，否则会抛出数组越界异常
            while (j<m){
                if(nums[i]+nums[j]+nums[m] == 0) {
                    List childList = new ArrayList<Integer>();
                    childList.add(nums[i]);
                    childList.add(nums[j]);
                    childList.add(nums[m]);
                    listList.add(childList);
                    j++;
                    //满足结果中没有重复数据
                    //要做好控制边界的量，否则会抛出数组越界异常
                    while (j < m && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    m--;
                    //满足结果中没有重复数据
                    //要做好控制边界的量，否则会抛出数组越界异常
                    while (j < m && nums[m] == nums[m + 1]) {
                        m--;
                    }
                }else if(nums[i]+nums[j]+nums[m] < 0){
                    j++;
                }else {
                    m--;
                }
            }
            //满足结果中没有重复数据
            //要做好控制边界的量，否则会抛出数组越界异常
            while (i < nums.length-1&&nums[i+1]==nums[i]){
                i++;
            }
        }
        return listList;
    }

    public static void main(String[] args) {
        int sum[]={-1,0,1,2,-1,-4};
        List<List<Integer>> listList=threeSum(sum);
        for (int i = 0; i < listList.size(); i++) {
            for (int j = 0; j < listList.get(i).size(); j++) {
                System.out.printf(listList.get(i).get(j).toString()+"  ");
            }
            System.out.println();
        }
    }
}
/*
总结：
三个数的和不用通过三层循环来遍历和计算，可以减少一次。那么需要先排序，
后两个数一个（j）比第一个数（i）大1，一个（m）是数组的最后一个数，来进行计算。
这就需要控制好j和m的边界（j<m）和i小于数组长度
 */