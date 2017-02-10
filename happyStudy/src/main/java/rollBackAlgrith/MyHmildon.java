package rollBackAlgrith;

/**
 * Created by zhangwenqiang on 2017/1/8.
 */
public class MyHmildon {
    public static void main(String[] args) {
        boolean cities[][]=new boolean[][]{
                {false,true,false,true,false},
                {true,false,true,true,true},
                {false,true,false,true,true},
                {true,true,true,false,true},
                {false,true,true,true,false},
        };
        int n=5;
        int m[];
        m=hamilton(cities,n);
        for (int i = 0; i < n; i++) {
            System.out.print(m[i]);
        }
    }

    public static int[] hamilton(boolean cities[][],int n){
        int m[]=new int[5];
        boolean s[]=new boolean[5];
        //一、初始化，判断路径中字母是否走过**********************************************
        for (int i = 0; i < n; i++) {
            s[i]=false;m[i]=0;
        }
        m[0]=0;
        s[0]=true;
        int k=0;
        k++;
        //二、跳出循环条件******************************************************
        while (k>0){
            // 三、一进入循环中方向自动增加（回溯法必须有这一步）************************************************
            m[k] = m[k] + 1;
            //四、修剪枝叶****************************************************
            while (m[k]<=k-1){
                if((s[m[k]]==true)||(cities[k-1][k]=false)) {
                    if(m[k]<n-1) {
                        m[k] = m[k] + 1;
                    }
                }else {
                    break;
                }
            }
            //5、此位置替换上一位置，继续往下搜索***************************************************
            if((m[k]<=n-1)&&(k<n-1)&&(s[m[k]]==false)){
                s[m[k]]=true;k++;
            }
            //success
            //6、成功找到了，不再循环********************************************************************
            if((m[k]<=n-1)&&(k==n-1)&&(cities[m[k]][0]==true)){
                return m;
            }
            //failure
            //7、查找失败，回溯**************************************************************
            if(m[k]>n-1||((m[k]==n-1)&&(k==n-1))){
                m[k]=0;k--;s[m[k]]=false;
            }
        }
        return m;
    }
}
