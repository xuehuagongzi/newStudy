package StreamAndFile.Serializable;

import java.io.*;

/**
 * Created by zhangwenqiang on 2017/3/10.
 */
public class SimpleSerial {
    private Object newPerson;

    public static void main(String[] args) {
        File outputFile=new File("E:1.dat");
        try {
        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(outputFile));
        Person person = new Person("John", 101, Gender.MALE);
        oout.writeObject(person);
        oout.close();
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream(outputFile));
            Object newPerson = oin.readObject(); // 没有强制转换到Person类型
            oin.close();
            System.out.println(newPerson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
