//
//最适合的方法是桶排序：
//        1.找出最大值和最小值。
//        2.生成一个最大值-最小值的区间 比如最大值9，最小值3，那就需要7个桶
//        3.往里面填
//        4.查找空桶，最多的即为最大差值。
//public static int findMaxDivision(int[]A,int n){
//        int maxnum=A[0];
//        int minnum=A[0];
//        for(int i=0;i<A.length;i++){
//        if(maxnum<A[i])
//        maxnum=A[i];
//        if(minnum>A[i])
//        minnum=A[i];
//        }
//        int[]arr=new int[maxnum-minnum+1]; // 生成桶
//        for(int i=0;i<A.length;i++){
//        arr[A[i]-minnum]++; // 填桶
//        }
//        int count=0;
//        int max=0;
//        for(int i=0;i<arr.length;i++){
//        if(arr[i]==0){ // 桶为空
//        count++;   //记录连续空桶数
//        }else{
//        if(max<count)
//        max=count;
//        count=0;
//        }
//        }
//        return max+1;  //如最大值为9，最小值为3，中间有5个空桶，但差值应为6
//        }
