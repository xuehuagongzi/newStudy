package niuke;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by zhangwenqiang on 2017/10/25.
 */
public class GuaZiChe02 {
    public static void main(String[] args) {
        System.out.println(get(9999));
        trevelQueue();
    }

    public static int get(int x){
        int count=0;
        while(x!=0){
            count++;
            x=x&(x-1);
        }
        return count;
    }

    public static void trevelStack(){
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < 10; i++) {
            s.push(i);
        }
        //集合遍历方式
        for (Integer x : s) {
            System.out.println(x);
        }
        for (Integer x : s) {
            System.out.println(x);
        }
        System.out.println("-----------2------");
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }


    public static void trevelQueue(){
        Queue<Integer> q = new LinkedBlockingQueue<Integer>();
        //初始化队列
        for (int i = 0; i < 5; i++) {
            q.offer(i);
        }
        System.out.println("-------1-----");
        //集合方式遍历，元素不会被移除
        for (Integer x : q) {
            System.out.println(x);
        }
        System.out.println("-------2-----");
        //队列方式遍历，元素逐个被移除
        while (q.peek() != null) {
            System.out.println(q.poll());
        }
    }
}
