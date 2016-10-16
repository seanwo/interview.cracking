package LinkedLists;

public class ReturnKthToLast {
    public int kthToLast(LinkedList list, int k){
        if (null==list){
            throw new IllegalArgumentException("linked list can not be null");
        }
        if (null==list.head){
            throw new IllegalArgumentException("linked list can not be empty");
        }

        LinkedList.Node trail = list.head;
        LinkedList.Node curr = list.head;

        int dist = 0;
        while ((curr!=null) && (dist<=k)){
            curr=curr.next;
            dist++;
        }

        if ((null==curr) && (dist==k)){
            throw new IllegalArgumentException("kth element exceeds list length!");
        }

        while (curr!=null){
            curr=curr.next;
            trail=trail.next;
        }

        return trail.data;
    }
}
