    package leetcode.array;

    /**
     * Created by zhangwenqiang on 2017/4/29.
     */
    public class Maximum_Product_Subarray {

        public static void main(String[] args) {
            int[] array={-4,-3,-2};
            int result=get_Maximum_Product_Subarray(array);
            System.out.println(result);
        }

    //这个是求最大连续子数组之和
//    private static int get_Maximum_Product_Subarray(int[] A) {
//        int fi=A[0];
//        int max=0;
//        for (int i = 1; i < A.length; i++) {
//            //fi表示的是以i为结尾的子最大子数组（即A[i]元素一定要加入）
//            //i前面的最大子数组之和是正数
//            if(A[i]+fi>A[i]){
//                fi=A[i]+fi;
//            }else {
//                fi=A[i];
//            }
//            if(fi>max){
//                max=fi;
//            }
//        }
//        return max;
//    }

    //这个是求最大连续子数组之积
    //int[] array={-2,3,2,-4};
    private static int get_Maximum_Product_Subarray(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int[] f = new int[A.length];
        int[] g = new int[A.length];
        f[0] = A[0];
        g[0] = A[0];
        int res = A[0];
        for (int i = 1; i < A.length; i++) {
            f[i] = Math.max(Math.max(f[i - 1] * A[i], g[i - 1] * A[i]), A[i]);
            g[i] = Math.min(Math.min(f[i - 1] * A[i], g[i - 1] * A[i]), A[i]);
            res = Math.max(res, f[i]);
        }
        return res;
    }
}
//        f[i] means maximum product that can be achieved ending with i(代表包含fi且连续的最大值)
//        g[i] means minimum product that can be achieved ending with i