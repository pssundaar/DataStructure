package com.LinkedList;

public class ReverseLL {
    public static void reverseLL(Linkedlist.Node head){
        Linkedlist.Node current=head;
        Linkedlist.Node prev=null;
        Linkedlist.Node next=null;

        while(current != null){
          next=current.next;
          current.next=prev;
          prev= current;
          current=next;
        }
        while(prev   !=null){
            System.out.println(prev.data);
            prev=prev.next;
        }
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

        reverseLL(ll.head);
    }
}
