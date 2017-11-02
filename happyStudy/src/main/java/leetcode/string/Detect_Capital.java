package leetcode.string;

/**
 * Created by zhangwenqiang on 2017/6/7.
 */
public class Detect_Capital {
    public static void main(String[] args) {
        String str="Abcdefg";
        System.out.println(isCapital(str));
    }

    public static boolean isCapital(String str){
        if(str!=null){
            char[] string=str.toCharArray();
            if(str.toLowerCase().equals(str)){
                return true;
            }
            if(str.toUpperCase().equals(str)){
                return true;
            }
            if(str.length()>1 && str.charAt(0)>='A' && str.charAt(0)<='Z'
                    && str.substring(1,str.length()).toLowerCase().equals(str.substring(1,str.length()))){
                System.out.println(str.substring(1,str.length()).toLowerCase());
                return true;
            }
        }
        return false;
    }

}
