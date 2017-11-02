package leetcode.array;

import java.util.HashMap;

/**
 * Created by zhangwenqiang on 2017/4/24.
 */
public class First_Missing_Positive {
    public static void main(String[] args) {
        int[] n={-9,1,2,0,-1,-3,5,6,3};
        int[] m={0,2,2,1,1};
        System.out.println(first_Missing_Positive(m));
    }

    private static int first_Missing_Positive(int[] n) {
        if(n.length==0){
            return 1;
        }
        int k=0;
        int[] m=new int[n.length];
        for (int i = 0; i < n.length; i++) {
            if(n[i]>0){
                m[k]=n[i];
                k++;
            }
        }
        if(k==0){
            return 1;
        }
        int tmp=m[0];
        for (int i = 1; i < k; i++) {
            if(m[i]<tmp){
                tmp=m[i];
            }
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < k; i++) {
            if (!map.containsKey(m[i])) {
                int left = map.containsKey(m[i] - 1) ? map.get(m[i] - 1) : 0;
                int right = map.containsKey(m[i] + 1) ? map.get(m[i] + 1) : 0;
                int sum = left + right + 1;
                map.put(m[i], sum);

                map.put(m[i] - left, sum);
                map.put(m[i] + right, sum);

            } else {
                continue;
            }
        }
        int constuous=1;
        if(tmp==1) {
            constuous = 1+map.get(tmp);
        }
        return constuous;

    }
}
