//package com.LinkedList.Practice;
//
//public class LL {
//    class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    Node head;
//    Node tail;
//    public void add(int data){
//        Node newNode= new Node(data);
//        if(head== null){
//            head=newNode;
//            tail=newNode;
//        }else{
//            tail.next=newNode;
//            tail=tail.next;
//        }
//    }
//    Node addNodeInMiddle(int data, int position, Node head){
//        Node addNode= new Node(data);
//        if(position < 1 ){
//            return null;
//        }
//        int count =1;
//        Node slow=null;
//        Node fast= head;
//        if(position == count){
//            slow= addNode;
//            slow.next=fast;
//            return slow;
//        }else{
//            while(fast != null && fast.next !=null && count != position){
//                count++;
//                slow=fast;
//                fast=fast.next;
//            }
//            if(fast)
//            System.out.println(count);
//            slow.next=addNode;
//            addNode.next=fast;
//            return head;
//        }
//    }
//    public static void main(String[] args){
//        LL l =new LL();
//        l.add(1);
//        l.add(2);
//        l.add(3);
//        l.add(4);
//        l.add(5);
//        Node n=l.addNodeInMiddle(101,10,l.head);
//        while(n!=null){
//            System.out.println(n.data);
//            n=n.next;
//        }
//    }
//}
