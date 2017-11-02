package niuke;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhangwenqiang on 2017/5/7.
 */
public class ListRemoveTest {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        stringList.add("aa");
        stringList.add("bb");
        stringList.add("cc");
        stringList.add("dd");
        stringList.add("ee");
        stringList.add("ff");
        Iterator iterator=stringList.iterator();
//        while (iterator.hasNext()){
//            String a= (String) iterator.next();
//            if(a.equals("cc")) {
//                iterator.remove();
//            }
//        }
        for (int i = 0; i < stringList.size(); i++) {
            if(stringList.get(i).equals("cc")){
                stringList.remove(stringList.get(i));
            }
        }
        stringList.forEach(System.out::println);
    }
}
