package yinyong.InMethod;

/**
 * Created by zhangwenqiang on 2017/1/2.
 */
public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cat catA=new Cat("catA");
        Cat catB=new Cat("catB");
        Cat newCat=change(catA);
        System.out.println(newCat);
    }

    public static Cat change(Cat cat){
        cat.setName("haha");
        Cat b=new Cat("ccc");
        b=cat;
        return b;
//        cat=null;
    }

}
