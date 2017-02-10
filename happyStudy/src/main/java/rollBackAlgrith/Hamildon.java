package rollBackAlgrith;

/**
 * Created by zhangwenqiang on 2016/12/24.
 */
public class Hamildon {

    public static boolean hamilton(int n,int x[],boolean c[][]){
        int i,k;
        boolean s[]=new boolean[n];
        for (int j = 0; j < n; j++) {
            x[j]=-1;s[j]=false;
        }
        k=1;s[0]=true;x[0]=0;
        while(k>0){
            x[k]=x[k]+1;
            while (x[k]<n){
                if(!s[x[k]]&&c[x[k-1]][x[k]]){
                    break;
                }else {
                    x[k]=x[k]+1;
                }
            }
            if((x[k]<n)&&(k!=n-1)){
                s[x[k]]=true;k=k+1;
            }else if ((x[k]<n)&&(k==n-1)&&(c[x[k]][x[0]])){
                return true;
            }else {
                x[k]=-1;k=k-1;s[x[k]]=false;
            }
        }
        return false;
    }

    public static  void main(String[] args){
        boolean c[][]=new boolean[][]{
            {false,false,false,false,false},//
            {false,false,true,true,true},//
            {false,true,false,true,true},//
            {false,true,true,false,true},//
            {false,true,true,true,false},//
        };
        int x[]=new int[5];
        System.out.println(hamilton(5, x, c));
    }

}
