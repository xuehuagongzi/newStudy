package Serializable;

import java.io.*;

/**
 * Created by zhangwenqiang on 2017/4/10.
 */
public class SimpleSerial {
    public static void main(String[] args) throws Exception {
        File file = new File("person.out");

        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));
        Person person = new Person("John", 101, Gender.MALE);
        oout.writeObject(person);
        oout.close();

        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
        Object newPerson = oin.readObject(); // 没有强制转换到Person类型
        oin.close();
        System.out.println(newPerson==person);
        System.out.println(newPerson);
    }
}
