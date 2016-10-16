package LinkedLists;

public class LinkedList {

    Node head = null;

     class Node {
        Node next = null;
        int data;

        public Node(int d){
            data=d;
        }
    }

    public void appendToTail(int d){
        Node end = new Node(d);
        Node n = head;
        if (null==n){
            head=end;
            return;
        }
        while (n.next != null){
            n = n.next;
        }
        n.next=end;
    }
}
