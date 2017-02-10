package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by zhangwenqiang on 2016/12/31.
 */
public class ThirdThread {
    public static void main(String[] args) {
        FutureTask<Integer> task=new FutureTask<Integer>(()->{
            int j=0;
            for (j = 0; j <100 ; j++) {
                System.out.println(Thread.currentThread().getName()+"   的循环变量的  "+j);
            }
            return j;
        });

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"   的循环变量的  "+i);
            if(i==20){
                new Thread(task,"有返回值的线程").start();
//            new Thread(()->{
//                int j=0;
//                for (j = 0; j <100 ; j++) {
//                    System.out.println(Thread.currentThread().getName()+"   的循环变量的  "+j);
//                }
//            },"线程一").start();
            }
        }
        try {
            System.out.println("子线程的返回值： "+task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
