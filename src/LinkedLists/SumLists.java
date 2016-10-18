package LinkedLists;

public class SumLists {
    public LinkedList<Integer> sumLists(LinkedList<Integer> num1, LinkedList<Integer> num2){
        if ((null==num1) || (null==num2)){
            throw new IllegalArgumentException("parameters can not be null");
        }
        if ((null==num1.head) || (null==num2.head)){
            throw new IllegalArgumentException("parameters can not be empty lists");
        }
        LinkedList<Integer> retVal = new LinkedList<>();
        Integer carry = 0;
        LinkedList<Integer>.Node pNum1 = num1.head;
        LinkedList<Integer>.Node pNum2 = num2.head;
        while ((null!=pNum1) && (null!=pNum2)){
            Integer value = carry;
            carry=0;
            value+=pNum1.data;
            value+=pNum2.data;
            if (value>=10){
                carry=1;
                value=value%10;
            }
            retVal.appendToTail(value);
            pNum1=pNum1.next;
            pNum2=pNum2.next;
        }
        while (null!=pNum1){
            Integer value = carry;
            carry=0;
            value+=pNum1.data;
            if (value>=10){
                carry=1;
                value=value%10;
            }
            retVal.appendToTail(value);
            pNum1=pNum1.next;
        }
        while (null!=pNum2){
            Integer value = carry;
            carry=0;
            value+=pNum2.data;
            if (value>=10){
                carry=1;
                value=value%10;
            }
            retVal.appendToTail(value);
            pNum2=pNum2.next;
        }
        if (carry>0){
            retVal.appendToTail(carry);
        }
        return retVal;
    }
}
