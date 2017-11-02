package leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DeZhoupuke {

    public static List<Puke> getLargestList(List<Puke> pukeList){
        List<Puke> lastResult=new ArrayList<>();
        Puke puke1=new Puke(0,0);
        Puke puke2=new Puke(0,0);
        Puke puke3=new Puke(0,0);
        Puke puke4=new Puke(0,0);
        Puke puke5=new Puke(0,0);
        lastResult.add(puke1);
        lastResult.add(puke2);
        lastResult.add(puke3);
        lastResult.add(puke4);
        lastResult.add(puke5);
        int stat=9;
        for (int i = 0; i < pukeList.size(); i++) {
            for (int j = 0; j < pukeList.size() ; j++) {
                for (int k = 0; k < pukeList.size(); k++) {
                    for (int l = 0; l < pukeList.size(); l++) {
                        for (int m = 0; m < pukeList.size(); m++) {
                            if(i!=j && i!=k && i!=l && i!=m && j!=k && j!=l && j!=m && k!=l && k!=m && l!=m) {
                                List<Puke> resultList=new ArrayList<>();
                                resultList.add(pukeList.get(i));
                                resultList.add(pukeList.get(j));
                                resultList.add(pukeList.get(k));
                                resultList.add(pukeList.get(l));
                                resultList.add(pukeList.get(m));
                                //排序
                                Collections.sort(resultList,(a,b)->{
                                    return b.num-a.num;
                                });

                                //颜色一样
                                if (pukeList.get(i).tag==pukeList.get(j).tag && pukeList.get(i).tag==pukeList.get(k).tag
                                        && pukeList.get(i).tag==pukeList.get(l).tag && pukeList.get(i).tag==pukeList.get(m).tag){

                                    //1同花顺
                                    if(resultList.get(0).num-resultList.get(4).num==4) {
                                        if(stat>1){
                                            stat = 1;
//                                            lastResult.clear();
//                                            lastResult.addAll(resultList);
                                            lastResult=resultList;
                                            continue;
                                        }
                                        if (stat == 1) {
                                            if (resultList.get(0).num > lastResult.get(0).num || resultList.get(1).num > lastResult.get(1).num
                                                    || resultList.get(2).num > lastResult.get(2).num || resultList.get(3).num > lastResult.get(3).num
                                                    || resultList.get(4).num > lastResult.get(4).num) {
//                                                lastResult.clear();
//                                                lastResult.addAll(resultList);
                                                lastResult=resultList;
                                            }
                                            continue;
                                        }
                                    }
                                }

                                //四条 四个一样的
                                if(resultList.get(0).num-resultList.get(3).num==0 || resultList.get(1).num-resultList.get(4).num==0){
                                    if(stat>2){
                                        stat = 2;
//                                        lastResult.clear();
//                                        lastResult.addAll(resultList);
                                        lastResult=resultList;
                                        continue;
                                    }
                                    if(stat==2) {
                                        if (resultList.get(0).num > lastResult.get(0).num || resultList.get(1).num > lastResult.get(1).num
                                                || resultList.get(2).num > lastResult.get(2).num || resultList.get(3).num > lastResult.get(3).num
                                                || resultList.get(4).num > lastResult.get(4).num) {
//                                            lastResult.clear();
//                                            lastResult.addAll(resultList);
                                            lastResult=resultList;
                                        }
                                        continue;
                                    }
                                }

                                //葫芦  3+2
                                if ((resultList.get(0).num-resultList.get(2).num==0 && resultList.get(3).num==resultList.get(4).num) ||
                                        (resultList.get(2).num-resultList.get(4).num==0 && resultList.get(0).num==resultList.get(1).num)){
                                    if(stat>3){
                                        stat = 3;
//                                        lastResult.clear();
//                                        lastResult.addAll(resultList);
                                        lastResult=resultList;
                                        continue;
                                    }
                                    if(stat==3) {
                                        if (resultList.get(0).num > lastResult.get(0).num || resultList.get(1).num > lastResult.get(1).num
                                                || resultList.get(2).num > lastResult.get(2).num || resultList.get(3).num > lastResult.get(3).num
                                                || resultList.get(4).num > lastResult.get(4).num) {
//                                            lastResult.clear();
//                                            lastResult.addAll(resultList);
                                            lastResult=resultList;
                                        }
                                        continue;
                                    }
                                }

                                //同花  但不是顺
                                if (pukeList.get(i).tag==pukeList.get(j).tag && pukeList.get(i).tag==pukeList.get(k).tag
                                        && pukeList.get(i).tag==pukeList.get(l).tag && pukeList.get(i).tag==pukeList.get(m).tag){
                                    if(stat>4){
                                        stat = 4;
//                                        lastResult.clear();
//                                        lastResult.addAll(resultList);
                                        lastResult=resultList;
                                        continue;
                                    }
                                    if(stat==4) {
                                        if (resultList.get(0).num > lastResult.get(0).num || resultList.get(1).num > lastResult.get(1).num
                                                || resultList.get(2).num > lastResult.get(2).num || resultList.get(3).num > lastResult.get(3).num
                                                || resultList.get(4).num > lastResult.get(4).num) {
//                                            lastResult.clear();
//                                            lastResult.addAll(resultList);
                                            lastResult=resultList;
                                        }
                                        continue;
                                    }
                                }

                                //顺子
                                if(resultList.get(0).num-resultList.get(1).num==1 && resultList.get(1).num-resultList.get(2).num==1
                                        && resultList.get(2).num-resultList.get(3).num==1 && resultList.get(3).num-resultList.get(4).num==1){
                                    if(stat>5){
                                        stat = 5;
//                                        lastResult.clear();
//                                        lastResult.addAll(resultList);
                                        lastResult=resultList;
                                        continue;
                                    }
                                    if(stat==5) {
                                        if (resultList.get(0).num > lastResult.get(0).num || resultList.get(1).num > lastResult.get(1).num
                                                || resultList.get(2).num > lastResult.get(2).num || resultList.get(3).num > lastResult.get(3).num
                                                || resultList.get(4).num > lastResult.get(4).num) {
//                                            lastResult.clear();
//                                            lastResult.addAll(resultList);
                                            lastResult=resultList;
                                        }
                                        continue;
                                    }
                                }

                                //三条
                                if (resultList.get(0).num-resultList.get(2).num==0 ||
                                        resultList.get(2).num-resultList.get(4).num==0  ||
                                        resultList.get(1).num-resultList.get(3).num==0 ){
                                    if(stat>6){
                                        stat = 6;
//                                        lastResult.clear();
//                                        lastResult.addAll(resultList);
                                        lastResult=resultList;
                                        continue;
                                    }
                                    if(stat == 6) {
                                        if (resultList.get(0).num > lastResult.get(0).num || resultList.get(1).num > lastResult.get(1).num
                                                || resultList.get(2).num > lastResult.get(2).num || resultList.get(3).num > lastResult.get(3).num
                                                || resultList.get(4).num > lastResult.get(4).num) {
//                                            lastResult.clear();
//                                            lastResult.addAll(resultList);
                                            lastResult=resultList;
                                        }
                                        continue;
                                    }
                                }

                                //两对
//                                if((resultList.get(0).num==resultList.get(1).num && resultList.get(2).num==resultList.get(3).num && resultList.get(4).num<resultList.get(3).num )
//                                        || (resultList.get(1).num==resultList.get(2).num && resultList.get(3).num==resultList.get(4).num && resultList.get(0).num>resultList.get(1).num )){
                                if((resultList.get(0).num==resultList.get(1).num && resultList.get(2).num==resultList.get(3).num && resultList.get(1).num>resultList.get(2).num && resultList.get(3).num>resultList.get(4).num)
                                        || (resultList.get(1).num==resultList.get(2).num) && resultList.get(3).num==resultList.get(4).num && resultList.get(0).num>resultList.get(1).num && resultList.get(2).num>resultList.get(3).num){
                                    if(stat>7){
                                        stat = 7;
//                                        lastResult.clear();
//                                        lastResult.addAll(resultList);
                                        lastResult=resultList;
                                        continue;
                                    }
                                    if(stat==7) {
                                        if (resultList.get(0).num > lastResult.get(0).num || resultList.get(1).num > lastResult.get(1).num
                                                || resultList.get(2).num > lastResult.get(2).num || resultList.get(3).num > lastResult.get(3).num
                                                || resultList.get(4).num > lastResult.get(4).num) {
//                                            lastResult.clear();
//                                            lastResult.addAll(resultList);
                                            lastResult=resultList;
                                        }
                                        continue;
                                    }
                                }

                                //一对
                                if((resultList.get(0).num==resultList.get(1).num && resultList.get(1).num>resultList.get(2).num && resultList.get(2).num>resultList.get(3).num && resultList.get(3).num>resultList.get(4).num)
                                || (resultList.get(1).num==resultList.get(2).num && resultList.get(0).num>resultList.get(1).num && resultList.get(2).num>resultList.get(3).num && resultList.get(3).num>resultList.get(4).num)
                                        || (resultList.get(2).num==resultList.get(3).num && resultList.get(0).num>resultList.get(1).num && resultList.get(1).num>resultList.get(2).num && resultList.get(3).num>resultList.get(4).num)
                                        || (resultList.get(3).num==resultList.get(4).num && resultList.get(0).num>resultList.get(1).num && resultList.get(1).num>resultList.get(2).num && resultList.get(2).num>resultList.get(3).num)){
                                    if(stat>8){
                                        stat = 8;
//                                        lastResult.clear();
//                                        lastResult.addAll(resultList);
                                        lastResult=resultList;
                                        continue;
                                    }
                                    if(stat==8) {
                                        if (resultList.get(0).num > lastResult.get(0).num || resultList.get(1).num > lastResult.get(1).num
                                                || resultList.get(2).num > lastResult.get(2).num || resultList.get(3).num > lastResult.get(3).num
                                                || resultList.get(4).num > lastResult.get(4).num) {
//                                            lastResult.clear();
//                                            lastResult.addAll(resultList);
                                            lastResult=resultList;
                                        }
                                        continue;
                                    }
                                }

                                if(stat==9) {
                                    if (resultList.get(0).num > lastResult.get(0).num || resultList.get(1).num > lastResult.get(1).num
                                            || resultList.get(2).num > lastResult.get(2).num || resultList.get(3).num > lastResult.get(3).num
                                            || resultList.get(4).num > lastResult.get(4).num) {
//                                        lastResult.clear();
//                                        lastResult.addAll(resultList);
                                        lastResult=resultList;
                                        continue;
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < lastResult.size(); i++) {
            System.out.println(lastResult.get(i).toString());
        }
        return lastResult;
    }

    public static void main(String[] args) {
        List<Puke> pukeList=new ArrayList<>();
        List<Puke> lastResult=new ArrayList<>();
//        Scanner sc=new Scanner(System.in);
//        int m=0,n=0;
//        for (int i = 0; i < 7; i++) {
//            m=sc.nextInt();
//            n=sc.nextInt();
//            Puke puke=new Puke(m,n);
//            pukeList.add(puke);
//        }
        Puke puke1=new Puke(1,5);
        Puke puke2=new Puke(2,5);
        Puke puke3=new Puke(3,13);
        Puke puke4=new Puke(2,2);
        Puke puke5=new Puke(3,9);
        Puke puke6=new Puke(4,6);
        Puke puke7=new Puke(1,12);
        pukeList.add(puke1);
        pukeList.add(puke2);
        pukeList.add(puke3);
        pukeList.add(puke4);
        pukeList.add(puke5);
        pukeList.add(puke6);
        pukeList.add(puke7);
        lastResult=getLargestList(pukeList);
        lastResult.size();
    }
}
