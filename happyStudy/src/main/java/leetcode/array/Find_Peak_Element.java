package leetcode.array;

/**
 * Created by zhangwenqiang on 2017/3/23.
 */
public class Find_Peak_Element {

    private static boolean find_Peak_Element(int[] array){
        int low=0;
        int high=array.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if((mid==0 || array[mid]>array[mid-1]) &&
                    ( mid==array.length-1 || array[mid]>array[mid+1] )){
                return true;
            }else if (mid>0 && array[mid]<array[mid-1]){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array=new int[]{
                1,2
        };
        System.out.println(find_Peak_Element(array));
    }
}
