package com.LinkedList.Practice;

public class LinkedL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    Node tail;
    public  void insertNode(int data){
        Node newNode= new Node(data);
        if(head ==null){
            head= newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=tail.next;
        }
    }

    public static void print(Node head){
        while(head != null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    public void reverseLL(Node head){
        Node current=head;
        Node prev=null;
        Node next= null;
        while(current !=null){ // 1 2 3 4 5
            next=current.next; // n-> 2,3,4,5// 3,4,5
            current.next= prev; //cn-> null//  c.n-1
            prev= current;// p-> 1//
            current=next;// 2 3 4 5
        }
        print(prev);
    }

    public Node deleteNode(Node head, int target){
        Node temp = head, prev = null;
        if (temp != null && temp.data == target) {
            prev = temp.next;
            print(prev);
            return prev;
        }
        while (temp != null && temp.data != target) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null)
            return null;

        prev.next = temp.next;
        return head;
    }

    public Node addNodeInMiddle(Node head, int position, int value){
        Node data = new Node(value);
        int count=1; Node slow= null; Node fast=head;
        if(position == count){
            data.next=head;
            head=data;
            return head;
        }else{
            while(fast != null && fast.next != null && count != position){
                count++;
                slow=fast;
                fast=fast.next;
            }
            if(fast.next != null && fast.next.next !=  null)
                slow.next=fast.next;
            else
                slow.next=null;
            }
            return slow;
        }



    public static void main(String[] args) {
        LinkedL l= new LinkedL();
        l.insertNode(1);
        l.insertNode(2);
        l.insertNode(3);
        l.insertNode(4);
        l.insertNode(5);
      Node n = l.addNodeInMiddle(l.head,2,101);
       print(n);

    }
}
