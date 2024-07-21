package com.ds.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    public static void level(Node node){
        if(node == null) return;
        Queue<Node> queue= new LinkedList<>();
        Node temp= node;
        queue.add(node);
        while (!queue.isEmpty()){
            System.out.println(temp.key);
            if(temp.left != null)
                queue.add(temp.left);
            if(temp.right != null)
                queue.add(temp.right);
            queue.poll();
            temp=queue.peek();
        }

    }
    public static void main(String[] args) {
        LevelOrder.level(utill.node());
    }
}
