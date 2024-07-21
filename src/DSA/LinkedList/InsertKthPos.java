package DSA.LinkedList;

public class InsertKthPos {
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
            System.out.print(head.data +" ");
            head = head.next;
        }
    }

    public void insertKth(int data, int pos, Node head){
        Node newNode = new Node(data);
        int count =1;
        Node curr = head;
        while (curr != null){
            if(count == pos -1){
                Node temp = curr.next;
                curr.next = newNode;
                newNode.next = temp;
            }
            curr = curr.next;
            count++;
        }
    }

    public static void main(String[] args) {
        InsertKthPos list = new InsertKthPos();
        list.firstInsert(5);
        list.firstInsert(4);
        list.firstInsert(2);
        list.firstInsert(1);
        list.print(list.head);
        list.insertKth(3,3, list.head);
        System.out.println("--------------");
        list.print(list.head);

    }

}
