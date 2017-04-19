package objectClass;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhangwenqiang on 2017/2/23.
 */
public class ObjectClass {
    public static void main(String[] args) {
        Set<Demo1> demo1Set=new HashSet<Demo1>();
        Demo1 demo1=new Demo1(1,2);
        Demo1 demo2=new Demo1(3,4);
        Demo1 demo3=new Demo1(5,6);
        demo1Set.add(demo1);
        demo1Set.add(demo2);
        demo1Set.add(demo3);
        System.out.println(demo1Set);
        Demo1 demo4=new Demo1(1,2);
        demo1Set.add(demo4);
        System.out.println(demo1Set);
        System.out.println(demo1Set.size());
        System.out.println(demo1.hashCode());
        System.out.println(demo4.hashCode());
        System.out.println(demo1.hashCode());

    }
}

class Demo1{
    private int value;
    private int id;

    public Demo1(int value,int id){
        this.value=value;
        this.id=id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Demo1 demo1 = (Demo1) o;

        if (id != demo1.id) return false;
        if (value != demo1.value) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + id;
        return result;
    }

    @Override
    public String toString() {
        return "Demo1{" +
                "value=" + value +
                ", id=" + id +
                '}';
    }
}