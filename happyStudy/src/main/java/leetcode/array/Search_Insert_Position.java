package leetcode.array;

/**
 * Created by zhangwenqiang on 2017/3/22.
 */
public class Search_Insert_Position {
    //二分查找的一定要先画图，再找规律
    private static int search_Insert_Position(int[] array,int key){
        if(array.length<1){
            return 0;
        }
        int low=0;
        int high=array.length-1;
        int result=0;
        while (low<=high){
            int mid=(low+high)/2;
            if(array[mid]==key){
                return mid;
            }else if(array[mid]<key){
                result=mid+1;
                low=mid+1;
            }else {
                result=mid;
                high=mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array={1,4,6,7,9,15};  //6
        //           0 1 2 3 4 5
        int key=20;
        System.out.println(search_Insert_Position(array,key));
    }
}
