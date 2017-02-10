package greedyAlgorythm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by zhangwenqiang on 2017/1/11.
 */
public class SummerAc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        while(n!=0){
            k++;
            List<TvShow> tvShowList=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TvShow tvShow=new TvShow();
                tvShow.setA(sc.nextInt());
                tvShow.setB(sc.nextInt());
                tvShowList.add(tvShow);
            }
            Collections.sort(tvShowList,(a,b)->{
                return a.getB()-b.getB();
            });
            int count=1;
            int end=tvShowList.get(0).getB();
//            tvShowList.forEach((a)->{
//                if(a.getA()>end) {
//                    end = a.getB();
//                    count++;
//                }
//            });
            for (int i = 1; i < tvShowList.size(); i++) {
                if(tvShowList.get(i).getA()>=end) {
                    end = tvShowList.get(i).getB();
                    count++;
                }
            }
            System.out.println(count);
            count=1;
            if(k>0) {
                n = sc.nextInt();
            }

        }
    }
}
class TvShow{
    private int a;
    private int b;

    public int getA() {

        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

}