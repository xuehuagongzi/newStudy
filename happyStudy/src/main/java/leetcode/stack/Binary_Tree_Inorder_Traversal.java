package leetcode.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by zhangwenqiang on 2017/7/18.
 */
public class Binary_Tree_Inorder_Traversal {
    static List<Integer> resultList=new ArrayList<Integer>();
    static Stack stack=new Stack<Integer>();

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.right=new TreeNode(3);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(22);
        root.left.right=new TreeNode(4);
//        root.left.right.right=new TreeNode(44);
//        root.left.right.left=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        get_Inorder(root);
    }

    //只要左边访问完以后，就把当前节点加进去
    public static List<Integer> get_Inorder(TreeNode root){
        //递归函数入口处
        while (root.left!=null && (root.left.visit==false)){
            root.left.visit=true;
            get_Inorder(root.left);
        }
        resultList.add(root.val);
        if(root.right!=null){
            //root.right.visit=true;
            //此处之所以不用判断是否visit了，原因是右侧节点走过之后，第一变函数已经结束，会从函数的左侧开始走，
            // 左侧判断已经走过了，就不会再走原来的路了
            get_Inorder(root.right);
        }

        return resultList;
    }
}

//Definition for a binary tree node.
class TreeNode {
    int val;
    boolean visit;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
        visit=false;
    }

}
