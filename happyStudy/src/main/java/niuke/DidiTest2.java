package niuke;
/**
 * Created by zhangwenqiang on 2017/9/10.
 */
public class DidiTest2 {
    int j=0;

    public static void main(String[] args) {
        DidiTest2 test2 = new DidiTest2();
        new Thread(test2.new AddThread()).start();
        new Thread(test2.new AddThread()).start();
        new Thread(test2.new DesThread()).start();
        new Thread(test2.new DesThread()).start();
    }

    class AddThread implements Runnable{
        public synchronized void run(){
                j++;
                System.out.println(j);
        }
    }

    class DesThread implements Runnable{
        public synchronized void run(){
                j--;
                System.out.println(j);
        }
    }
}