package greedyAlgorythm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by zhangwenqiang on 2017/1/12.
 */
public class IntervalCoverage {
    static int height=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while(n!=0){
            List<DeviceLocation> deviceLocationList=new ArrayList<>();
            int weight=sc.nextInt();
            height=sc.nextInt();
            for (int i = 0; i < n; i++) {
                DeviceLocation deviceLocation=new DeviceLocation();
                int index=sc.nextInt();
                int radius=sc.nextInt();
                int start=0;
                if(index-radius>=0) {
                    start = index - radius;
                }
                int end=weight;
                if(index+radius<=weight){
                    end=index+radius;
                }
                deviceLocation.setIndex(index);
                deviceLocation.setRadius(radius);
                deviceLocation.setStart(start);
                deviceLocation.setEnd(end);
                deviceLocationList.add(deviceLocation);
            }
            List<DeviceLocation> newDeviceList=new ArrayList<>();

            for (int i = 0; i < deviceLocationList.size(); i++) {
                if(deviceLocationList.get(i).getRadius()>Math.sqrt(((height/2)*(height/2))/2)){
                    newDeviceList.add(deviceLocationList.get(i));
                }
            }
            Collections.sort(newDeviceList,(a,b)->{
                return a.getStart()-b.getStart();
            });
            int count=0;
            int curZhong=0;
            for (int i = 0; i < newDeviceList.size(); i++) {
                int curIndexTemp=curZhong;
                if(zhongxinDistance(newDeviceList, i)>=newDeviceList.get(i).getIndex()-curZhong){
                    curIndexTemp=newDeviceList.get(i).getIndex();
                    if(zhongxinDistance(newDeviceList,i)>=weight-newDeviceList.get(i).getIndex()){
                        count++;
                        break;
                    }
                }else {
                    continue;
                }
                for (int j = i; j < newDeviceList.size(); j++) {
                    if(zhongxinDistance(newDeviceList,i)>=newDeviceList.get(i).getIndex()-curZhong
                            &&(newDeviceList.get(j).getEnd()>newDeviceList.get(i).getEnd())){
                        curIndexTemp=newDeviceList.get(j).getIndex();
                    }
                }
                curZhong=curIndexTemp;
                count++;
            }
            System.out.println(count);
            n=sc.nextInt();
        }
    }

    public static double zhongxinDistance(List<DeviceLocation> newDeviceList,int i){
        return Math.sqrt((newDeviceList.get(i).getRadius() * newDeviceList.get(i).getRadius()) - ((height / 2) * (height / 2)));
    }

}


class DeviceLocation{
    private int index;
    private int radius;
    private int start;
    private int end;

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    private boolean used;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

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
}