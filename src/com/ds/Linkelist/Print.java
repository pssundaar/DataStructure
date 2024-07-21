package com.ds.Linkelist;

import java.util.LinkedList;

public class Print {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head = null;
    Node tail = null;

    public void addNode(int data){
        Node newNode= new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next= newNode;
            tail=tail.next;
        }
    }
    public void print(){
        while(head != null){
            System.out.print(head.data +"->");
            head = head.next;
        }
    }
    public void middle(){
        Node fast= head;
        Node slow= head;
        while (fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.data);
    }
    public void findLoop(){
        Node fast=head;
        Node slow=head;
        while(fast != null && slow !=null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow == fast){
                System.out.println(slow.data);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Print p = new Print();
        p.addNode(1);
        p.addNode(2);
        p.addNode(3);
        p.addNode(4);
        p.addNode(5);
        p.addNode(6);
       // p.head.next.next.next= p.head.next;
       // p.findLoop();
        LinkedList<Integer> ll= new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.remove(1);
        System.out.println(ll);
    }
}
