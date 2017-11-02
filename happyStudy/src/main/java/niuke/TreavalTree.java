package niuke;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by zhangwenqiang on 2017/9/27.
 */
public class TreavalTree {
    public static void main(String[] args) {
        Node root = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        root.setLeft(b);
        root.setRight(c);
        b.setLeft(d);
        b.setRight(e);
//        getPaiXuShu(root);
        System.out.println(isFullTree(root));
    }

    //中序递归
    public static void zhongTreavel(Node node) {
        if (node != null) {
            zhongTreavel(node.left);
            System.out.println(node);
            zhongTreavel(node.right);
        }
    }

    //中序遍历非递归,左跟右
    public static void zhongFeiDiGui(Node node) {
        Stack stack = new Stack();
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            }
            if (node == null) {
                node = (Node) stack.peek();
                System.out.println(stack.pop());
                node = node.right;
            }
        }
    }

    //先序遍历 递归
    public static void preTreavelTree(Node root) {
        if (root != null) {
            System.out.println(root);
            preTreavelTree(root.left);
            preTreavelTree(root.right);
        }
    }

    //先序遍历  非递归
    public static void preTreavelTreeFeiDiGui(Node root) {
        Stack stack = new Stack();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                System.out.println(root);
                stack.push(root);
                root = root.left;
            }else {
                root= (Node) stack.peek();
                stack.pop();
                root=root.right;
            }
        }
    }

    //右根左
    public static void getPaiXuShu(Node root){
        Stack stack = new Stack();
        while (root !=null || !stack.isEmpty()){
            if(root!=null){
                stack.push(root);
                root = root.right;
            }else {
                root = (Node) stack.peek();
                System.out.println(root);
                stack.pop();
                root=root.left;
            }
        }
    }


    public static boolean isFullTree(Node node){
        Queue<Node> queue = new LinkedList<Node>();
        if(node==null){
            return true;
        }
        queue.offer(node);
        while (!queue.isEmpty()){
            Node temp = queue.poll();
            if(temp==null){
                while (!queue.isEmpty()){
                    Node hehe=queue.poll();
                    if(hehe!=null){
                        return false;
                    }
                }
            }
            if(temp!=null) {
                queue.offer(temp.left);
                queue.offer(temp.right);
            }
        }
        return true;
    }


}


class Node{
    public String key;
    public Node left;
    public Node right;

    public Node(String key) {
        this.key = key;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key='" + key + '\'' +
                '}';
    }
}
