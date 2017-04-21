package leetcode.string;

/**
 * Created by zhangwenqiang on 2017/4/20.
 */
public class Student_Attendance_Record_I {

    public static boolean is_Rewarded(String str){
        int aNum=0;
        int continuousNum=0;
        boolean isContinuous=false;
        if(str!=null) {
            for (int i = 0; i < str.toCharArray().length; i++) {
                if (str.charAt(i) == 'A') {
                    aNum++;
                    if (aNum > 1) {
                        return false;
                    }
                }
                if (str.charAt(i) != 'L') {
                    isContinuous = false;
                    continuousNum = 0;
                }
                if (str.charAt(i) == 'L') {
                    isContinuous = true;
                    continuousNum++;
                    if (isContinuous && continuousNum > 2) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="PPALLL";
        System.out.println(is_Rewarded(str));
    }
}
