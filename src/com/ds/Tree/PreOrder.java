package com.ds.Tree;

import java.util.Stack;

public class PreOrder {
    public static void preorder(Node node){
        if(node == null) return;
        Stack<Node> stack= new Stack<>();
        stack.push(node);
        Node temp= node;
        while (!stack.isEmpty() ){
            System.out.println(temp.key);
            if(temp.right != null)
                stack.push(temp.right);
            if(temp.left != null)
                stack.push(temp.left);
            temp=stack.pop();
        }
    }
    public static void main(String[] args) {
        PreOrder.preorder(utill.node());
    }
}
