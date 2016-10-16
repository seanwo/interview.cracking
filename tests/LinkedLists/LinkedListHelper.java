package LinkedLists;

import static org.junit.Assert.fail;

public class LinkedListHelper {
    static public void assertListEqual(LinkedList list1, LinkedList list2){
        if ((null==list1) && (null==list2)) return;
        if ((null==list1) || (null==list2)) {
            fail("one list is null and the other is not");
            return;
        }
        LinkedList.Node pList1 = list1.head;
        LinkedList.Node pList2 = list2.head;
        if ((null==pList1) && (null==pList2)) return;
        if ((null==pList1) || (null==pList2)) {
            fail("one list has nodes and the other does not");
            return;
        }
        int index=0;
        while (pList1!=null){
            if (null==pList2) {
                fail("one list is longer than the other [index:"+index+"]");
                return;
            }
            if (pList1.data!=pList2.data){
                fail("element mismatch at index "+index+" (e1:["+pList1.data+"] != e2:["+pList2.data+"])");
                return;
            }
            pList1=pList1.next;
            pList2=pList2.next;
            index++;
        }
        if (pList2!=null){
            fail("one list is longer than the other [index:"+index+"]");
        }
    }
}
