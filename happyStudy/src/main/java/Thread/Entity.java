package Thread;

/**
 * Created by zhangwenqiang on 2017/1/2.
 */
public class Entity {
    boolean flag = true;
    int i=1;
    int j=2;
    char k='a';

    public synchronized void printNumber() {
        if (flag == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            String s="";
            s+=i;
            s+=j;
            i+=2;
            j+=2;
            System.out.print(s);
            flag=false;
            notifyAll();
        }
    }

    public synchronized void printChar() {
        if (flag == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.print(k++);
            flag = true;
            notifyAll();
        }
    }

}
