package LinkedLists;

public class Partition {
    public LinkedList partition(LinkedList<Integer> list, int pivot){
        if (null==list){
            throw new IllegalArgumentException("list can not be null");
        }
        if (list.head==null){
            throw new IllegalArgumentException("list can not be empty");
        }

        LinkedList<Integer>.Node lowerHead = null;
        LinkedList<Integer>.Node lower = null;
        LinkedList<Integer>.Node upperHead = null;
        LinkedList<Integer>.Node upper = null;

        LinkedList<Integer>.Node n = list.head;
        while (n!=null){
            if (n.data<pivot){
                if (lower==null){
                    lower=n;
                    lowerHead=n;
                }else{
                    lower.next=n;
                    lower=n;
                }
            }else{
                if (upper==null){
                    upper=n;
                    upperHead=n;
                }else{
                    upper.next=n;
                    upper=n;
                }
            }
            n=n.next;
        }

        if (lower==null){
            list.head=upperHead;
        }else{
            lower.next=upperHead;
            list.head=lowerHead;
        }

        return list;
    }
}
