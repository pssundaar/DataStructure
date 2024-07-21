package DSA.LinkedList;

public class InsertFirst {
    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void firstInsert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else {
            Node curr = head;
            newNode.next = head;
            head = newNode;

        }
    }

    public void print(Node head){
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        InsertFirst list = new InsertFirst();
        list.firstInsert(1);
        list.firstInsert(2);
        list.firstInsert(3);
        list.print(list.head);
    }
}
