package Thread;

/**
 * Created by zhangwenqiang on 2017/1/1.
 */
public class DaemonThread {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);

            }
        });
        thread.setDaemon(true);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
