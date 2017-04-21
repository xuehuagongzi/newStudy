package leetcode.string;

/**
 * Created by zhangwenqiang on 2017/4/19.
 */
public class Implement_strStr {

//    public static int strStr(String needle, String haystack) {
//        char ch1[]=needle.toCharArray();
//        char ch2[]=haystack.toCharArray();
//        int result=-1;
//        if(ch1.length==0 && ch2.length==0){
//            return 0;
//        }
//        if(ch1.length!=0 && ch2.length==0){
//            return 0;
//        }
//        for (int i = 0; i < ch1.length; i++) {
//            for (int j = 0; j < ch2.length; j++) {
//                if(i>=ch1.length||j>=ch2.length){
//                    return -1;
//                }
//                if(ch1[i]==ch2[j]){
//                    if(j==ch2.length-1){
//                        return i-j;
//                    }
//                    i++;
//                }else {
//                    i=i-j+1;
//                    j=-1;
//                }
//            }
//
//        }
//        return -1;
//    }

    public static String strStr(String haystack, String needle) {
        //KMP algorithms
        if(needle.equals("")) return haystack;
        if(haystack.equals("")) return null;
        char[] arr = needle.toCharArray();
        int[] next = makeNext(arr);

        for(int i = 0, j = 0, end = haystack.length(); i < end;){
            if(j == -1 || haystack.charAt(i) == arr[j]){
                j++;
                i++;
                if(j == arr.length) return haystack.substring(i - arr.length);
            }
            if(i < end && haystack.charAt(i) != arr[j]) j = next[j];
        }
        return null;
    }

    private static int[] makeNext(char[] arr){
        int len = arr.length;
        int[] next = new int[len];

        next[0] = -1;
        for(int i = 0, j = -1; i + 1 < len;){
            if(j == -1 || arr[i] == arr[j]){
                next[i+1] = j+1;
                if(arr[i+1] == arr[j+1]) next[i+1] = next[j+1];
                i++;
                j++;
            }
            if(arr[i] != arr[j]) j = next[j];
        }

        return next;
    }

    public static void main(String[] args) {
        String str1="asssfdfbg";
        String str2="asssfdf";
        System.out.println(strStr(str1,str2));
    }

}
