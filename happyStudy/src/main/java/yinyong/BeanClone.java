package yinyong;

/**
 * Created by zhangwenqiang on 2017/1/16.
 */
public class BeanClone implements Cloneable{
    private String name;
    private int age;

    public BeanClone cloneTest(){
        try {
            return (BeanClone) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return this;
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

    @Override
    public String toString() {
        return "BeanClone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        BeanClone bean=new BeanClone();
        bean.setName("zhangsan");
        bean.setAge(19);
        BeanClone bean2;

        bean2=bean.cloneTest();
        System.out.println(bean2);
    }
}
