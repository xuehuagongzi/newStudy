package yinyong.Listyinyong;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangwenqiang on 2017/3/8.
 */
public class TestListYinyong {
    public static void main(String[] args) {
        Person person=new Person("1111");
        Person person1=new Person("2222");
        Person person2=new Person("3333");
        List<Person> personList=new ArrayList<>();
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        for (Person person0:personList){
            System.out.println("最开始的personList   "+person0.getName());
        }

        //改变person的值是会影响原来的personList的（会改变personList的值）
        System.out.println();System.out.println();System.out.println();
        List<Person> personList2=new ArrayList<>();
        personList2.addAll(null);
        personList2.get(0).setName("111111111111");
        for (Person person0:personList){
            System.out.println("改变personList2中的person的值后的personList   "+person0.getName());
        }

        //对personList2增加数据，看一下对personList的影响（对personList没影响）
        System.out.println();System.out.println();System.out.println();
        personList2.add(new Person("4444"));
        for (Person person0:personList){
            System.out.println("对personList2增加数据后的personList   "+person0.getName());
        }


        //对personList2删除数据，看一下对personList的影响（对personList没影响）
        System.out.println();System.out.println();System.out.println();
        personList2.remove(0);
        System.out.println();
        for (Person person0:personList){
            System.out.println("对personList2删除数据后的personList   "+person0.getName());
        }


        //清空personList2数据，看一下对personList的影响（对personList没影响）
        System.out.println();System.out.println();System.out.println();
        personList2.clear();
        System.out.println();
        for (Person person0:personList){
            System.out.println("清空personList2数据后的personList   "+person0.getName());
        }
    }
}
