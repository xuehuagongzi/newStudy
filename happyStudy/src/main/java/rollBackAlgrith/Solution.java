package rollBackAlgrith;

/**
 * Created by zhangwenqiang on 2016/12/10.
 */
public class Solution {

    // 如果存在就输出true，不存在就输出false
    public static int exist(char[][] board, String word) {
        if (word.length() == 0)
            System.out.println("false");
        //寻找出发点
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                if (word.charAt(0) == board[i][j]
                        && find(board, word, 0, i, j, new boolean[board.length][board[0].length], 0)) {
                    System.out.println("true");
                    return 1;
                }
        System.out.println("false");
        return 0;
    }

    //参数from的取值1、2、3、4分别表示从上方、左边、下方、右边来到当前位置，这样在寻找下一个位置的时候
    private static boolean find(char[][] board, String word, int pos, int i, int j, boolean[][] used, int from) {

        if (pos == word.length())
            return true;
        //此方向上不满足条件，就返回false，准备回退
        if (used[i][j] || board[i][j] != word.charAt(pos))
            return false;

//        if (pos == word.length() - 1)
//            return true;

        used[i][j] = true;
        boolean temp;

        // up
        //如果不是从上方来的，就往上走
        if (i > 0 && from != 1) {
            temp = used[i - 1][j];
            if (find(board, word, pos + 1, i - 1, j, used, 3))
                return true;
            used[i - 1][j] = temp;
        }

        // left
        //向上走不通就往左走
        if (j > 0 && from != 2) {
            temp = used[i][j - 1];
            if (find(board, word, pos + 1, i, j - 1, used, 4))
                return true;
            used[i][j - 1] = temp;
        }

        // down
        if (i < board.length - 1 && from != 3) {
            temp = used[i + 1][j];
            if (find(board, word, pos + 1, i + 1, j, used, 1))
                return true;
            used[i + 1][j] = temp;
        }

        // right
        if (j < board[0].length - 1 && from != 4) {
            temp = used[i][j + 1];
            if (find(board, word, pos + 1, i, j + 1, used, 2))
                return true;
            used[i][j + 1] = temp;
        }

        return false;
    }

    public static void main(String[] args) {
        char[][] board = new char[][] { //
                { 'A', 'B', 'A', 'E' }, //
                { 'D', 'F', 'G', 'E' }, //
                { 'A', 'F', 'C', 'E' }, //
                { 'N', 'C', 'D', 'E' }, //
        };
        exist(board, "ABFGCDEE");
        exist(board, "ABFGCDEEEEA");
        exist(board, "ADFGEEEDCN");
        exist(board, "ABFGCHN");
        exist(board, "ABFGCZV");
    }
}
