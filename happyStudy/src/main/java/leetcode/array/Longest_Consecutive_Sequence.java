package leetcode.array;

import java.util.HashMap;

/**
 * Created by zhangwenqiang on 2017/4/24.
 */
public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] num={1,2,5,6,7,3,0};
        System.out.println(longestConsecutive(num));
    }

    public static int longestConsecutive(int[] num) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : num) {
            if (!map.containsKey(n)) {
                int left = (map.containsKey(n - 1)) ? map.get(n - 1) : 0;
                int right = (map.containsKey(n + 1)) ? map.get(n + 1) : 0;
                // sum: length of the sequence n is in
                int sum = left + right + 1;
                map.put(n, sum);

                // keep track of the max length
                res = Math.max(res, sum);

                // extend the length to the boundary(s)
                // of the sequence
                // will do nothing if n has no neighbors
                //包括这个数字的最长子串的长度是sum
                map.put(n - left, sum);
                map.put(n + right, sum);
            }
            else {
                // duplicates
                continue;
            }
        }
        return res;
    }
}
