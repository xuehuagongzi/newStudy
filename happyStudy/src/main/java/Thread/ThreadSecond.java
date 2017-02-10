package Thread;

/**
 * Created by zhangwenqiang on 2016/12/31.
 */
public class ThreadSecond implements Runnable{
    private int i;
    @Override
    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i==20){
                ThreadSecond threadSecond=new ThreadSecond();
                new Thread(threadSecond,"新线程1").start();
                new Thread(threadSecond,"新线程2").start();
//                new Thread(threadSecond,"新线程3").start();

            }

        }
    }
}
