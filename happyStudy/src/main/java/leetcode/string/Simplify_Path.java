package leetcode.string;

import java.util.Stack;

/**
 * Created by zhangwenqiang on 2017/4/21.
 * 思路：这是Linux内核中较常见的一个操作，就是对一个输入的文件路径进行简化。我们先来了解一下这些符号在Unix路径中代表的意义：
 “/.” 表示本级目录，可以忽略
 “/..” 表示返回上一级目录，即若上一级目录存在，连同“/..”一并删除，否则只删除“/..”
 若去除冗余后路径为空，返回“/”
 若包含多个连续“/”, 删除多余的“/”
 */
public class Simplify_Path {

    public static void main(String[] args) {
        String str = "/a/./b///../c/../././../d/..//../e/./f/./g/././//.//h///././/..///";
        String result = simplify(str);
        System.out.println(result);
    }

    private static String simplify(String str) {
        String[] strings = str.split("/");
        int i = 0;
        Stack stack = new Stack();
//        stack.push("/");
        //三种情况：
        //第一：为"",则什么都不做   为"."什么都不做
        //第二：".."则pop
        //第三：其他，则push，push的时候一定要  "/" + strings[i]  这样，
        // 否则比如说/a/b遇到 .. 的时候不能从b直接到a层目录了，就会出现问题
        while (i < strings.length) {
            if (!"".equals(strings[i]) && !"..".equals(strings[i]) && !".".equals(strings[i])) {
                stack.push("/" + strings[i]);
            } else if (!stack.isEmpty() && "..".equals(strings[i])) {
                stack.pop();
            } else {}
            i++;
        }
        int num = stack.size();
        if (num == 0) {
            return "/";
        }
        String[] tmp = new String[num];
        for (int j = 0; j < num; j++) {
            tmp[num - 1 - j] = (String) stack.pop();
        }
        String rr = "";
        for (int j = 0; j < num; j++) {
            rr += tmp[j];
        }
        return rr;
    }
}
