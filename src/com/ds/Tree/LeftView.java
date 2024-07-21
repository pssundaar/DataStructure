package com.ds.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LeftView {
    public static void left(Node node){
        if(node == null) return;
        Queue<Node> queue = new LinkedList<>();
        Node temp=node;
        queue.add(temp);
        while(!queue.isEmpty()){
            int count = queue.size();
            while (count>0) {
                temp=queue.peek();
                System.out.print(temp.key + "  ");
                queue.remove();
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
               count--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        LeftView.left(utill.node());


    }
}

class Node{
    int key;
    Node left,right;

    public Node(int item){
        key=item;
        left=right=null;
    }

}
