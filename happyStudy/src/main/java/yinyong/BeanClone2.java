package yinyong;

/**
 * Created by zhangwenqiang on 2017/1/16.
 */
public class BeanClone2 implements Cloneable{
    private String name;
    private int age;

    @Override
    public BeanClone2 clone() throws CloneNotSupportedException {
        return (BeanClone2) super.clone();
    }

    @Override
    public String toString() {
        return "BeanClone2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        BeanClone2 bean2=new BeanClone2();
        bean2.setAge(18);
        bean2.setName("hehe");
        BeanClone2 beanClone2;
        try {
            beanClone2= bean2.clone();
            System.out.println(beanClone2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
