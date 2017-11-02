package leetcode.array;

/**
 * Created by zhangwenqiang on 2017/5/4.
 */
public class Third_Maximum_Number {
    public static void main(String[] args) {
        int[] nums={2,1};
        int result=get_Third_Maximum_Number(nums);
        System.out.println(result);
        long a=23;
        Long b=a;
        System.out.println(a>b);
    }

    private static int get_Third_Maximum_Number(int[] nums) {
        Integer temp1=null;
        Integer temp2=null;
        Integer temp3=null;

        for(Integer num:nums){
            if (num.equals(temp1) || num.equals(temp2) || num.equals(temp3)) continue;
            if(temp1 == null || num>temp1){
                    temp3 = temp2;
                    temp2 = temp1;
                    temp1 = num;
            }else if(temp2 == null || num>temp2){
                    temp3 = temp2;
                    temp2 = num;
            }else if(temp3 == null || num>temp3){
                temp3=num;
            }
        }
        if(temp3==null){
            return temp1;
        }
        return temp3;
    }
}
