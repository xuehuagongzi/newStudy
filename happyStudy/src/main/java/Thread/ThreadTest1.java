package Thread;

/**
 * Created by zhangwenqiang on 2017/1/2.
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        Entity entity=new Entity();
        Thread thread1 = new Thread(new Thread1(entity));
        thread1.start();
        Thread thread2 = new Thread(new Thread2(entity));
        thread2.start();
    }
}

class Thread1 implements Runnable {
    private Entity entity;
    Thread1(Entity entity1){
        entity=entity1;
    }
    @Override
    public void run() {
//        int j = 0;
//        String  s="";
        for (int i = 1; i <= 51; i++) {
//            if (j < 2) {
//                s+=i;
//                j++;
//                    if (j == 2) {
//                        j = 0;
                        entity.printNumber();
//                        s="";
//                    }
            }
//        }
    }
}
class Thread2 implements Runnable {
    private Entity entity;
    Thread2(Entity entity2){
        entity=entity2;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 51; i++) {
            entity.printChar();
        }
    }
}
