package Thread;

/**
 * Created by zhangwenqiang on 2016/12/31.
 */
public class FirstThread extends Thread{
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
                new FirstThread().start();
                new FirstThread().start();
                new FirstThread().start();

            }

        }
    }
}
