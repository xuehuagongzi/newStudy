package niuke;

/**
 * Created by zhangwenqiang on 2017/10/25.
 */

import java.util.*;

public class TestUtils {

    public static void main(String[] args) throws Exception {
        aaaa("abcabc");
    }
    public static int aaaa(String s) throws Exception {
        Map map=new HashMap();
        int result=0;
        for(char i='a';i<='z';i++){
            map.put(i,0);
        }
        for(int j=0;j<s.length();j++){
            if((int)map.get(s.charAt(j))==0){
                map.put(s.charAt(j),1);
            }
        }
        for(char i='a';i<='z';i++){
            result=result + (int)map.get(i);
        }

        return result;
    }

}
