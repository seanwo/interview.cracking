package LinkedLists;

public class DeleteMiddleNode {
    public void DeleteMiddleNode(LinkedList.Node node){
        if (null==node) {
            throw new IllegalArgumentException("node can not be null");
        }
        if (null==node.next){
            throw new IllegalArgumentException("node can not represent the last node in the list!");
        }
        node.data=node.next.data;
        node.next=node.next.next;
    }
}
