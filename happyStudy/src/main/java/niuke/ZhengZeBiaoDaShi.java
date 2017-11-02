package niuke;

import java.util.Objects;
import java.util.regex.Pattern;

public class ZhengZeBiaoDaShi {
    public static void main(String[] args) {

//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();
//        test7();
//          test8();
//        test9();
        test10();
    }

    //字符串中\代表转义，在正则表达式中\\相当于字符串中的一个\
    public static void test1(){
        String str="\\";
//        String patternStr="^x\\w*@tal\\w*\\.\\w*";
        String patternStr="\\\\";
        boolean result = Pattern.matches(patternStr, str);
        if (result) {
            System.out.println("字符串"+str+"匹配模式"+patternStr+"成功");
        }
        else{
            System.out.println("字符串"+str+"匹配模式"+patternStr+"失败");
        }
    }


    //正则式是最简单的能准确匹配一个给定String的模式,
    // 模式与要匹配的文本是等价的.静态的Pattern.matches方法
    // 用于比较一个String是否匹配一个给定模式.例程如下:
    public static void test2(){
        String str="java";
        String patternStr="java";
        boolean result = Pattern.matches(patternStr, str);
        if (result) {
            System.out.println("字符串"+str+"匹配模式"+patternStr+"成功");
        }
        else{
            System.out.println("字符串"+str+"匹配模式"+patternStr+"失败");
        }
    }


    //匹配连续多个字符
    public static void test3(){
        String str="jaaav";
        String patternStr="ja*v";
        boolean result = Pattern.matches(patternStr, str);
        if (result) {
            System.out.println("字符串"+str+"匹配模式"+patternStr+"成功");
        }
        else{
            System.out.println("字符串"+str+"匹配模式"+patternStr+"失败");
        }
    }

    //方括号中只允许的单个字符,模式“b[aeiou]n”指定,
    // 只有以b开头,n结尾,中间是a,e,i,o,u中任意一个的才能匹配上,
    // 所以数组的前五个可以匹配,后两个元素无法匹配.
    //方括号[]表示只有其中指定的字符才能匹配.
    public static void test4(){
        String[] dataArr = { "ban", "ben", "bin", "bon" ,"bun","byn","baen"};
        for (String str : dataArr) {
            String patternStr="b([aeiou])n";
            boolean result = Pattern.matches(patternStr, str);
            if (result) {
                System.out.println("字符串"+str+"匹配模式"+patternStr+"成功");
            }
            else{
                System.out.println("字符串"+str+"匹配模式"+patternStr+"失败");
            }
        }
    }

    //如果需要匹配多个字符,那么[]就不能用上了,
    // 这里我们可以用()加上|来代替,()表示一组,|表示或的关系,
    // 模式b(ee|ea|oo)n就能匹配been,bean,boon等.
    //    因此前三个能匹配上,而后两个不能.
    public static void test5(){
        String[] dataArr = { "been", "bean", "boon", "buin" ,"bynn"};
        for (String str : dataArr) {
            String patternStr="b(ee|ea|oo)n";
            boolean result = Pattern.matches(patternStr, str);
            if (result) {
                System.out.println("字符串"+str+"匹配模式"+patternStr+"成功");
            }
            else{
                System.out.println("字符串"+str+"匹配模式"+patternStr+"失败");
            }
        }
    }

    //String类的split函数支持正则表达式,上例中模式能匹配”,”,
    // 单个空格,”;”中的一个,split函数能把它们中任意一个当作分隔符,
    // 将一个字符串劈分成字符串数组.
    public static void test6(){
        String str="薪水,职位 姓名;年龄 性别";
        String[] dataArr =str.split("[,\\s;]");
        for (String strTmp : dataArr) {
            System.out.println(strTmp);
        }
    }

    public static void test7(){
        String[] dataArr = { "google", "gooogle", "gooooogle", "goooooogle","ggle"};
        for (String str : dataArr) {
            String patternStr = "go{2,5}gle";
            boolean result = Pattern.matches(patternStr, str);
            if (result) {
                System.out.println("字符串" + str + "匹配模式" + patternStr + "成功");
            } else {
                System.out.println("字符串" + str + "匹配模式" + patternStr + "失败");
            }
        }
    }


    public static void test8(){
        String[] dataArr = { "Tan", "Tbn", "Tcn", "Ton","Twn"};
        for (String str : dataArr) {
            String regex = "T[a-c]n";
            boolean result = Pattern.matches(regex, str);
            if (result) {
                System.out.println("字符串" + str + "匹配模式" + regex + "成功");
            } else {
                System.out.println("字符串" + str + "匹配模式" + regex + "失败");
            }
        }
    }

    //匹配以x开头包含@tal和.的字符串
    public static void test9(){
        String str="xzz@tal.com";
        String patternStr="^x\\w*(@tal)\\w*\\.\\w*";
        boolean result = Pattern.matches(patternStr, str);
        if (result) {
            System.out.println("字符串"+str+"匹配模式"+patternStr+"成功");
        }
        else{
            System.out.println("字符串"+str+"匹配模式"+patternStr+"失败");
        }
    }

    //匹配以x开头包含@tal和.的字符串
    public static void test10(){
        Object object=new Object();
    }

}