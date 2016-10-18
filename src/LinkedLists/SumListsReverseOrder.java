package LinkedLists;

public class SumListsReverseOrder {

    private LinkedList reverseList(LinkedList list){
        LinkedList.Node prev = null;
        LinkedList.Node curr = list.head;
        LinkedList.Node next;

        while (null!=curr){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        list.head=prev;
        return list;
    }

    public LinkedList<Integer> sumLists(LinkedList<Integer> num1, LinkedList<Integer> num2){
        if ((null == num1) || (null == num2)){
            throw new IllegalArgumentException("parameters can not be null");
        }
        if ((null == num1.head) || (null == num2.head)){
            throw new IllegalArgumentException("parameters can not be empty lists");
        }

        num1 = reverseList(num1);
        num2 = reverseList(num2);

        SumLists module = new SumLists();
        return reverseList(module.sumLists(num1, num2));
    }
}
