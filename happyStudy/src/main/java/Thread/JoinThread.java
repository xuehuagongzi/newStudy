package Thread;

/**
 * Created by zhangwenqiang on 2017/1/1.
 */
public class JoinThread {
    public static void main(String[] args) {
        Thread thread1=new Thread(()->{
            for (int j = 0; j < 100; j++) {
                System.out.println(Thread.currentThread().getName()+" "+j);
            }
        });
        thread1.start();
        for (int i = 0; i < 100; i++) {
            if(i==20){
                Thread thread=new Thread(()->{
                    for (int j = 0; j < 100; j++) {
                        System.out.println(Thread.currentThread().getName()+" "+j);
                    }
                },"被join的线程");
                thread.start();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
