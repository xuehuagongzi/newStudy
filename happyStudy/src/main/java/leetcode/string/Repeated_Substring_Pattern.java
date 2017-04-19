package leetcode.string;

/**
 * Created by zhangwenqiang on 2017/3/27.
 */
public class Repeated_Substring_Pattern {
//    public static boolean repeatedSubstringPattern(String str) {
//        int l = str.length();
//        for(int i=l/2;i>=1;i--) {
//            if(l%i==0) {
//                int m = l/i;
//                String subS = str.substring(0,i);
//                StringBuilder sb = new StringBuilder();
//                for(int j=0;j<m;j++) {
//                    sb.append(subS);
//                }
//                if(sb.toString().equals(str)) return true;
//            }
//        }
//        return false;
//    }


    public static boolean repeatedSubstringPattern(String str) {
        //This is the kmp issue
        int[] prefix = kmp(str);
        int len = prefix[str.length()-1];
        int n = str.length();
        return (len > 0 && n%(n-len) == 0);
    }
    private static int[] kmp(String s){
        int len = s.length();
        int[] res = new int[len];
        char[] ch = s.toCharArray();
        int i = 0, j = 1;
        res[0] = 0;
        while(i < ch.length && j < ch.length){
            if(ch[j] == ch[i]){
                res[j] = i+1;
                i++;
                j++;
            }else{
                if(i == 0){
                    res[j] = 0;
                    j++;
                }else{
                    i = res[i-1];
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str="aaacaaac";
        System.out.println(repeatedSubstringPattern(str));
    }
}
