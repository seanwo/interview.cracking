package LinkedLists;

import java.util.Stack;

public class Palindrome {
    public boolean isPalindrome(LinkedList list){
        if (null==list){
            throw new IllegalArgumentException("list can not be null");
        }
        if (null==list.head){
            throw new IllegalArgumentException("list can not be empty");
        }

        Stack<Object> stack = new Stack<>();
        LinkedList.Node pList = list.head;
        while (null!=pList){
            stack.add(pList.data);
            pList=pList.next;
        }
        pList = list.head;
        while (null!=pList) {
            if (pList.data!=stack.pop()) return false;
            pList=pList.next;
        }
        return true;
    }
}
