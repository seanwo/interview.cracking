package LinkedLists;

public class LinkedList<T> {

    Node head = null;

     class Node {
        Node next = null;
        T data;

        public Node(T d){
            data=d;
        }
    }

    public Node appendToTail(T d){
        Node end = new Node(d);
        Node n = head;
        if (null==n){
            head=end;
            return end;
        }
        while (n.next != null){
            n = n.next;
        }
        n.next=end;
        return end;
    }
}