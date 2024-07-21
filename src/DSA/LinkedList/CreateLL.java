package DSA.LinkedList;

public class CreateLL {
    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
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

    public void print(Node list){
        if(list != null){
            while (list != null){
                System.out.println(list.data);
                list=list.next;
            }
        }
    }
    public static void main(String[] args) {
        CreateLL list = new CreateLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);

        list.print(list.head);
    }
}
