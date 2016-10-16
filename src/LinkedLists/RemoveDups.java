package LinkedLists;

import java.util.HashSet;

public class RemoveDups {
    public LinkedList removeDups(LinkedList list){
        if (null == list) {
            throw new IllegalArgumentException("list can not be null");
        }
        HashSet<Integer> set = new HashSet<>();
        LinkedList.Node pPrev = null;
        LinkedList.Node pList = list.head;
        if (null==pList) return list;
        while (pList!=null){
            if (set.contains(pList.data)){
                pPrev.next=pList.next;
            }else{
                set.add(pList.data);
                pPrev=pList;
            }
            pList=pList.next;
        }
        return list;
    }
}
