package Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by zhangwenqiang on 2017/1/2.
 */
//public class ThreadTest2 {
//    public static void main(String[] args) {
//        BlockingQueue<String> bq = new ArrayBlockingQueue<>(3);
//        new Producer(bq).start();
//        new Consumer(bq).start();
//    }
//}
//
//class Producer extends Thread {
//    private BlockingQueue<String> bq;
//
//    public Producer(BlockingQueue<String> bqa) {
//        bq = bqa;
//    }
//
//    public void run() {
//        for (int i = 0; i < 30; i++) {
//            try {
//                Thread.sleep(100);
//                if(bq.size()<=3) {
//                    bq.put("java");
//                    System.out.println("存车一个");
//                    System.out.println(bq.size());
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//class Consumer extends Thread {
//    private BlockingQueue<String> bq;
//
//    public Consumer(BlockingQueue<String> bqa) {
//        bq = bqa;
//    }
//
//    public void run() {
//        for (int i = 0; i < 30; i++) {
//            try {
////                Thread.sleep(1000);
//                if(bq.size()>0) {
//                    bq.take();
//                    System.out.println("取车一个");
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}