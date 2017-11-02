package Thread;

/**
 * Created by zhangwenqiang on 2017/5/7.
 */
public class Valuablaplusplus {

    public static void main(String[] args) throws InterruptedException {
        Obj obj=new Obj(10);
        Thread thread1=new Add(obj);
        thread1.start();
        thread1.join();
        Thread thread2=new Add(obj);
        thread2.start();
        thread2.join();
        Thread thread3=new Sub(obj);
        thread3.start();
        thread3.join();
        Thread thread4=new Sub(obj);
        thread4.start();
        thread4.join();
        Thread thread5=new Thread(){
          public void run(){
              System.out.println("111111111111111111");
          }
        };
        thread5.start();
    }
}

class Obj{
    public int a;
    public Obj(int a){
        this.a=a;
    }
}

class Add extends Thread{
    public Obj obj;
    public Add(Obj obj){
        this.obj=obj;
    }
    public void run(){
        synchronized(obj) {
            obj.a++;
            System.out.println(obj.a);
        }
    }
}

class Sub extends Thread{
    public Obj obj;
    public Sub(Obj obj){
        this.obj=obj;
    }
    public void run(){
        synchronized(obj) {
            obj.a--;
            System.out.println(obj.a);
        }
    }
}