package niuke;

/**
 * Created by zhangwenqiang on 2017/4/5.
 */
public class ZeroTest {
    public static void main(String[] args) {
        try {
            int i=100/0;
            System.out.println(i);
        }
        catch (Exception e){
            System.out.println(1);
            throw new RuntimeException();
        }
        finally {
            System.out.println(2);
        }
        System.out.println(3);
    }
}
