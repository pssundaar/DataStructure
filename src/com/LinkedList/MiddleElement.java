package com.LinkedList;

public class MiddleElement {

    public static void middleElement(Linkedlist.Node head){
        Linkedlist.Node fast = head;
        Linkedlist.Node slow =head;
        while(fast.next != null && fast.next.next !=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {

        Linkedlist ll= new Linkedlist();
        ll.head= new Linkedlist.Node(1);
        Linkedlist.Node sec= new Linkedlist.Node(2); ll.head.next=sec;
        Linkedlist.Node th= new Linkedlist.Node(3);  sec.next=th;
        Linkedlist.Node fo= new Linkedlist.Node(4);  th.next=fo;
        Linkedlist.Node fi= new Linkedlist.Node(5);  fo.next=fi;
        Linkedlist.Node si= new Linkedlist.Node(6);  fi.next=si;
        Linkedlist.Node se= new Linkedlist.Node(7);  si.next=se;

        middleElement(ll.head);
    }
}
