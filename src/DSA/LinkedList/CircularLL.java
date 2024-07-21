package DSA.LinkedList;

public class CircularLL {
    Node head;
   class Node {
       int data;
       Node next;
       public Node(int data){
           this.data =  data;
           this.next = null;
       }
   }

    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else {
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void print(Node head){
        while (head != null){
            System.out.print(head.data +" ");
            head = head.next;
        }
    }

    // Create Circular List
    public  void circularList(Node head){
        Node curr =  head;
        while(curr.next != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
        curr.next = head;

    }

    // Find out the last node and print

    public  void circularLastNode(Node head){
        Node curr =  head;
        int temp = head.data;
        while(curr.next != null){
           if(curr.next.data == temp){
               System.out.println(curr.data);
               return;
           }
            curr = curr.next;
        }
        curr.next = head;

    }

    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.circularList(list.head);

        list.circularLastNode(list.head);

    }
}
