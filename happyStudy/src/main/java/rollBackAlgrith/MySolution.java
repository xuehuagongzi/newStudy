package rollBackAlgrith;

/**
 * Created by zhangwenqiang on 2017/1/4.
 */
public class MySolution {
    public static void main(String[] args) {
        char[][] board = new char[][]{ //
                {'A', 'B', 'A', 'E'}, //
                {'D', 'F', 'G', 'E'}, //
                {'A', 'F', 'C', 'E'}, //
                {'N', 'C', 'D', 'E'}, //
        };

        if (exist(board, "ABFGCHN")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
//        exist(board, "ABFGCDEEEEA");
//        exist(board, "ADFGEEEDCN");
//        exist(board, "ABFGCHN");
//        exist(board, "ABFGCZV");
    }

    public static boolean exist(char[][] c, String str) {
        //一、初始化，判断路径中字母是否走过**********************************************
        boolean[][] used = new boolean[c.length][c[0].length];
        //判断走到该位置是从什么方向走过来的，存储 1,2,3,4
        int[][] from = new int[c.length][c.length];
        int k = 0;//向下走的方向1,2,3,4
        int i = 0;
        int j = 0;
        //第一个不在循环的初始值c[0][0]
        used[i][j] = true;
        from[i][j] = 0;
        int s = 0;//字符串的中待比较字符的位置
        int m = i;//回溯回来跳出条件的原点的值保存为m，n
        int n = j;
        s++;
        //二、跳出循环条件******************************************************
        while (i != m || j != n || k < 5) {
            //保留这次的c[i][j]，当前准备往下走的位置
            int p = i;
            int q = j;
            // 三、一进入循环中方向自动增加（回溯法必须有这一步）************************************************
            //方向1,2,3,4，为了会退时
            k++;
            //向上走
            if (k == 1) {
                if (i > 0&&used[i-1][j]==false) {
                    //未增加时候的i和j
                    //if c[i][j] ！= str.charAt(s)，就不在赋值为true了，因为只有往下走的时候才会回溯，才会再次赋值为false
                    if(c[i][j] == str.charAt(s)) {
                        used[i][j] = true;
                    }
                    i--;
                }
            } else if (k == 2) {
                //向右走
                if (j < 3&&used[i][j+1]==false) {
                    if(c[i][j] == str.charAt(s)) {
                        used[i][j] = true;
                    }
                    j++;
                }
            } else if (k == 3) {
                //向下走
                if (i < 3&&used[i+1][j]==false) {
                    if(c[i][j] == str.charAt(s)) {
                        used[i][j] = true;
                    }
                    i++;
                }
            } else if(k==4){
                //向左走
                if (j > 0&&used[i][j-1]==false) {
                    if(c[i][j] == str.charAt(s)) {
                        used[i][j] = true;
                    }
                    j--;
                }
            }else {
                break;
            }
            //四、修剪枝叶****************************************************
            while (c[i][j] != str.charAt(s)) {
                i = p;
                j = q;
                k++;
                //向上走
                if (k == 1) {
                    if (i > 0&&used[i-1][j]==false) {
                        //未增加时候的i和j
                        if(c[i][j] == str.charAt(s)) {
                            used[i][j] = true;
                        }
                        i--;
                    }
                } else if (k == 2) {
                    //向右走
                    if (j < 3&&used[i][j+1]==false) {
                        if(c[i][j] == str.charAt(s)) {
                            used[i][j] = true;
                        }
                        j++;
                    }
                } else if (k == 3) {
                    //向下走
                    if (i < 3&&used[i+1][j]==false) {
                        if(c[i][j] == str.charAt(s)) {
                            used[i][j] = true;
                        }
                        i++;
                    }
                } else if(k==4){
                    //向左走
                    if (j > 0&&used[i][j-1]==false) {
                        if(c[i][j] == str.charAt(s)) {
                            used[i][j] = true;
                        }
                        j--;
                    }
                }else {
                    break;
                }
            }
            //七、此位置替换上一位置，继续往下搜索***************************************************
            if (s < str.length() - 1) {
                s++;
                k = 0;
            }
            //五、成功找到了，不再循环********************************************************************
            // success
            if (c[i][j] == str.charAt(s) && used[i][j] == false && k <= 4&&s == str.length() - 1) {
                from[i][j] = k;
                return true;
            }
            //六、查找失败，回溯**************************************************************
            if (k > 4 && (s < str.length() - 1)) {
                //返回
                if (from[p][q] == 1) {
                    if (i < 3) {
                        used[i][j] = false;
                        i++;
                    }
                } else if (from[p][q] == 2) {
                    if (j > 0) {
                        used[i][j] = false;
                        j--;
                    }
                } else if (from[p][q] == 3) {
                    used[i][j] = false;
                    i--;
                } else if (from[p][q] == 4) {
                    if (j < 3) {
                        used[i][j] = false;
                        j++;
                    }
                } else {
                    break;
                }
                s--;
            }


        }
        //修改
        return false;
    }
}