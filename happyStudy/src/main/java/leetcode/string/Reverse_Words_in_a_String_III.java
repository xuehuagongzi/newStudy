package leetcode.string;

/**
 * Created by zhangwenqiang on 2017/4/19.
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 很简单就不作分析了，哈哈哈哈,一次就accept了
 Example 1:
 Input: "Let's take LeetCode contest"
 Output: "s'teL ekat edoCteeL tsetnoc"
 Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class Reverse_Words_in_a_String_III {

    //第一种解决办法，利用自己写的reverse方法
    public static String everse_Words_in_a_String_III(String string){
        if(string!=null) {
            String splitStr[] = string.split(" ");
            StringBuffer stringBuffer = new StringBuffer("");
            for (int i = 0; i < splitStr.length; i++) {
                String tmp = " ";
                stringBuffer.append(reverse(splitStr[i]) + tmp);
            }
            stringBuffer.setLength(stringBuffer.length()-1);
            return stringBuffer.toString();
        }else {
            return null;
        }
    }

    public static String reverse(String string){
        char str[]=string.toCharArray();
        for (int i = 0; i < str.length/2; i++) {
            char tmp=str[i];
            str[i]=str[str.length-1-i];
            str[str.length-1-i]=tmp;
        }
        return new String(str);
    }

    //第二种，利用StringBuffer的reverse()方法和将数组length-1
    public static String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String str: strs){
            StringBuffer temp = new StringBuffer(str);
            sb.append(temp.reverse());
            sb.append(" ");
        }
        sb.setLength(sb.length()-1);
        return sb.toString();
    }

    public static void main(String[] args) {
        String string="Let's take LeetCode contest";
        System.out.println(everse_Words_in_a_String_III(string));
    }
}
