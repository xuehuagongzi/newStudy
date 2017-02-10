package rollBackAlgrith;

/**
 * Created by zhangwenqiang on 2017/1/3.
 */
public class Hamildon2 {
    public static void main(String[] args) {
        boolean c[][]=new boolean[][]{
                {false,true,false,true,false},//
                {true,false,true,true,true},//
                {false,true,false,true,true},//
                {true,true,true,false,true},//
                {false,true,true,true,false},//
        };
        int x[]=new int[5];
        x=hamildon(5,x,c);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public static int[] hamildon(int n,int x[],boolean c[][]){
        boolean s[]=new boolean[5];
        for (int i = 0; i < n; i++) {
            x[i]=-1;s[i]=false;
        }
        x[0]=0;s[0]=true;
        int k=1;
        while (k>0){
            x[k]=x[k]+1;
            while (x[k]<n){
                if(s[x[k]]==false&&c[x[k-1]][x[k]]){
                    break;
                }else {
                    x[k] = x[k] + 1;
                }
            }
            if (k!=n-1 && x[k]<n) {
                s[x[k]]=true;k++;
            }
            else if (k==n-1&&x[k]<n&&c[x[k-1]][x[0]]){
                break;
            }else {
                x[k]=-1;--k;s[x[k]]=false;
            }
        }
        return x;
    }
}
