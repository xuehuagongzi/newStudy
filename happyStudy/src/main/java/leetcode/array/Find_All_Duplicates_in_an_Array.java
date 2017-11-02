package leetcode.array;

import java.util.*;

/**
 * Created by zhangwenqiang on 2017/5/4.
 */
public class Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {
        int[] n={4,3,2,7,8,2,3,1};
        find_All_Duplicates_in_an_Array(n);
    }

    public static List<Integer> find_All_Duplicates_in_an_Array(int[] n) {
        List<Integer> integerList=new ArrayList<>();
        Map map=new HashMap<Integer,Integer>();
        for(int i=0;i<n.length;i++){
            if(map.get(n[i])==null){
                map.put(n[i],1);
            }else {
                map.put(n[i], (int)map.get(n[i])+1);
            }
        }

        Set<Integer> keySet=map.keySet();
        for (Integer key:keySet){
            if((int)map.get(key)==2){
                integerList.add(key);
                System.out.println(key);
            }
        }
        Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();
        for(Map.Entry entry:entrySet){
            if((int)entry.getValue()==2){
                System.out.println(entry.getKey());
            }
        }
        return integerList;
    }
}
