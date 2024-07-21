package com.ds.Tree;

import java.util.Stack;

public class Inorder {
    public static  void inorder(Node node){
        if(node == null) return ;
        Stack<Node> data= new Stack<>();
        Node temp=node;
        while(temp != null || !data.isEmpty() ){
            while(temp != null ){
                data.push(temp);
                temp= temp.left;
            }
            temp= data.pop();
            System.out.println(temp.key);
            temp= temp.right;
        }

    }

    public static void main(String[] args) {

        Inorder.inorder(utill.node());
    }
}
