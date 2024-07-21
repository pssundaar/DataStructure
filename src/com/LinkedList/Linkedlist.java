package com.LinkedList;

public class Linkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
        this.data=data;
        next=null;
        }
    }
    Node head;
    Node tail;

    public void addNode(int data){
        Node node= new Node(data);
        if(head == null){
            head=node;
            tail=node;
        }else {
            tail.next=node;
            tail=tail.next;
        }

    }
    public void middleNode(Node node){
        Node fast=node;
        Node slow=node;
        while(fast != null && fast.next!=null ){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.data);
    }
    public static void print(Node node){
        while(node !=null){
            System.out.println(node.data);
            node=node.next;
        }
    }
    public void chckCycle(Node node){
        Node fast=node;
        Node slow=node;
        while(fast !=null && slow!=null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast.data == slow.data){
                System.out.println(fast.data+" -Fast ;"+ slow.data+"- Slow; ");
                break;
            }
        }
    }
    public void reverse(Node node){
        Node current=node;
        Node prev=null;
        Node next=null;
        while(current !=null){
            next= current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        print(prev);
    }

    public static void main(String[] args) {
        Linkedlist ll= new Linkedlist();
       ll.addNode(1);
       ll.addNode(2);
       ll.addNode(3);
       ll.addNode(4);
       ll.addNode(5);
       ll.addNode(6);
       ll.addNode(7);
     //  ll.head.next.next.next=ll.head.next;
       ll.reverse(ll.head);
     //  ll.middleNode(ll.head);
//        while(ll.head !=null){
//            System.out.println(ll.head.data);
//            ll.head=ll.head.next;
//        }

    }

}
