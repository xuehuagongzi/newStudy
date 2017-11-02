package leetcode.array;

//扑克牌
public class Puke{
    public int tag;   //1  2   3  4 代表花色 黑红花片
    public int num;    //1-13    代表 2-JQK A

    public Puke(int tag,int num){
        this.tag=tag;
        this.num=num;
    }

    public Puke(){}

    @Override
    public String toString() {
        return "Puke{" +
                "tag=" + tag +
                ", num=" + num +
                '}';
    }

}
