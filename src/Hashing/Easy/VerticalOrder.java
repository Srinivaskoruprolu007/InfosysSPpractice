package Hashing.Easy;


import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class VerticalOrder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left.right = new Node(6);
        printVerticalOrder(root);
    }


    static void getVerticalOrder(Node root, int hd, TreeMap<Integer, Vector<Integer>>m){
//        base case
        if(root==null){
            return;
        }
//        get the vector list at 'hd'
        Vector<Integer> get = m.get(hd);
        if(get==null){
            get = new Vector<>();
            get.add(root.key);
        }else get.add(root.key);
        m.put(hd,get);
        getVerticalOrder(root.left,hd-1,m);
        getVerticalOrder(root.right,hd+1,m);
    }
    static void printVerticalOrder(Node root){
        TreeMap<Integer,Vector<Integer>> m = new TreeMap<>();
        int hd =0;
        getVerticalOrder(root,hd,m);
        for(Map.Entry<Integer,Vector<Integer>>entry : m.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    private static class Node {
        int key;
        Node left;
        Node right;
        Node(int data){
            key = data;
            left=null;
            right=null;
        }
    }
}
