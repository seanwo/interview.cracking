package LinkedLists;

import sun.awt.image.ImageWatched;
import sun.dc.pr.PRError;

public class RemoveDupsNoBuffer {
    public LinkedList removeDups(LinkedList list){
        if (null == list){
            throw new IllegalArgumentException("linked list cannot be null");
        }
        if (null==list.head) return list;
        LinkedList.Node pIndex = list.head;
        while (pIndex!=null){
            LinkedList.Node pRunner = pIndex.next;
            LinkedList.Node pPrev = pIndex;
            while (pRunner!=null){
                if (pIndex.data==pRunner.data){
                    pPrev.next=pRunner.next;
                }else{
                    pPrev=pRunner;
                }
                pRunner=pRunner.next;
            }
            pIndex=pIndex.next;
        }
        return list;
    }
}
