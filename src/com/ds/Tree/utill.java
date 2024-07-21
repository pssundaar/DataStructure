package com.ds.Tree;

import java.util.Stack;

public class utill {


    public static Node node(){
        Node node= new Node(1);
        node.left= new Node(2);
        node.right= new Node(3);
        node.left.left= new Node(4);
        node.left.right= new Node(5);
        node.right.left= new Node(6);
        node.right.right= new Node(7);
        return  node;
    }
}


//                    1
//                  /   \
//                2       3
//              /  \     / \
//            4     5   6   7