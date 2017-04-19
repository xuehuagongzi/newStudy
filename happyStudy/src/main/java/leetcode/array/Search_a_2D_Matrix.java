package leetcode.array;

/**
 * Created by zhangwenqiang on 2017/3/22.
 */
public class Search_a_2D_Matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length<=0){
            return false;
        }
        int row=0;
        int col=matrix[0].length-1;
        while (row<=matrix.length-1 && col>=0){
            if(target==matrix[row][col]){
                return true;
            } else if(target>matrix[row][col]){
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix=new int[][]{
                {1,   3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        System.out.println(searchMatrix(matrix,20));
    }
}
