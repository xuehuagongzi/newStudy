package greedyAlgorythm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by zhangwenqiang on 2017/1/12.
 */
public class WisersGreedyAlgorythm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n!=0){
            List<BetweenDist> betweenDistList=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                BetweenDist betweenDist=new BetweenDist();
                betweenDist.setStart(sc.nextInt());
                betweenDist.setEnd(sc.nextInt());
                betweenDist.setDestroy(false);
                betweenDistList.add(betweenDist);
            }
            Collections.sort(betweenDistList,(a,b)->{
                return a.getEnd()-b.getEnd();
            });
            int count=0;
            for (int i = 0; i < betweenDistList.size(); i++) {
                if(!betweenDistList.get(i).isDestroy()) {
                    BetweenDist betweenDist = betweenDistList.get(i);
                    betweenDist.setDestroy(true);
                    for (int j = i + 1; j < betweenDistList.size(); j++) {
                        if (betweenDistList.get(j).getStart() <= betweenDist.getEnd() && (!betweenDistList.get(j).isDestroy())) {
                            betweenDistList.get(j).setDestroy(true);
                        }
                    }
                    betweenDistList.get(i).setDestroy(true);
                    count++;
                }
            }
            System.out.println(count);
            n=sc.nextInt();
        }
    }
}

class BetweenDist{
    private int start;
    private int end;
    private boolean isDestroy;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public boolean isDestroy() {
        return isDestroy;
    }

    public void setDestroy(boolean isDestroy) {
        this.isDestroy = isDestroy;
    }
}
