package LinkedLists;

import org.junit.Test;

public class SumListsReverseOrderTest extends LinkedListHelper{

    SumListsReverseOrder module = new SumListsReverseOrder();

    @Test
    public void testSumListsHappy() throws Exception {
        LinkedList<Integer> num1 = new LinkedList<>();
        num1.appendToTail(6);
        num1.appendToTail(1);
        num1.appendToTail(7);

        LinkedList<Integer> num2 = new LinkedList<>();
        num2.appendToTail(2);
        num2.appendToTail(9);
        num2.appendToTail(5);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.appendToTail(9);
        expected.appendToTail(1);
        expected.appendToTail(2);

        assertListEqual(expected, module.sumLists(num1, num2));
    }

    @Test
    public void testSumLists1x1NoCarry() throws Exception {
        LinkedList<Integer> num1 = new LinkedList<>();
        num1.appendToTail(1);

        LinkedList<Integer> num2 = new LinkedList<>();
        num2.appendToTail(2);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.appendToTail(3);

        assertListEqual(expected, module.sumLists(num1, num2));
    }

    @Test
    public void testSumLists1x1Carry() throws Exception {
        LinkedList<Integer> num1 = new LinkedList<>();
        num1.appendToTail(7);

        LinkedList<Integer> num2 = new LinkedList<>();
        num2.appendToTail(6);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.appendToTail(1);
        expected.appendToTail(3);

        assertListEqual(expected, module.sumLists(num1, num2));
    }

    @Test
    public void testSumLists1x3NoCarry() throws Exception {
        LinkedList<Integer> num1 = new LinkedList<>();
        num1.appendToTail(1);

        LinkedList<Integer> num2 = new LinkedList<>();
        num2.appendToTail(4);
        num2.appendToTail(3);
        num2.appendToTail(1);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.appendToTail(4);
        expected.appendToTail(3);
        expected.appendToTail(2);

        assertListEqual(expected, module.sumLists(num1, num2));
    }

    @Test
    public void testSumLists1x3Carry() throws Exception {
        LinkedList<Integer> num1 = new LinkedList<>();
        num1.appendToTail(9);

        LinkedList<Integer> num2 = new LinkedList<>();
        num2.appendToTail(9);
        num2.appendToTail(9);
        num2.appendToTail(1);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.appendToTail(1);
        expected.appendToTail(0);
        expected.appendToTail(0);
        expected.appendToTail(0);

        assertListEqual(expected, module.sumLists(num1, num2));
    }

    @Test
    public void testSumLists3x1NoCarry() throws Exception {
        LinkedList<Integer> num1 = new LinkedList<>();
        num1.appendToTail(4);
        num1.appendToTail(3);
        num1.appendToTail(1);

        LinkedList<Integer> num2 = new LinkedList<>();
        num2.appendToTail(1);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.appendToTail(4);
        expected.appendToTail(3);
        expected.appendToTail(2);

        assertListEqual(expected, module.sumLists(num1, num2));
    }

    @Test
    public void testSumLists3x1Carry() throws Exception {
        LinkedList<Integer> num1 = new LinkedList<>();
        num1.appendToTail(9);
        num1.appendToTail(9);
        num1.appendToTail(1);

        LinkedList<Integer> num2 = new LinkedList<>();
        num2.appendToTail(9);


        LinkedList<Integer> expected = new LinkedList<>();
        expected.appendToTail(1);
        expected.appendToTail(0);
        expected.appendToTail(0);
        expected.appendToTail(0);

        assertListEqual(expected, module.sumLists(num1, num2));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSumListsFirstEmpty() throws Exception {
        LinkedList<Integer> num1 = new LinkedList<>();
        LinkedList<Integer> num2 = new LinkedList<>();
        num2.appendToTail(1);

        module.sumLists(num1, num2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSumListsSecondEmpty() throws Exception {
        LinkedList<Integer> num1 = new LinkedList<>();
        num1.appendToTail(1);
        LinkedList<Integer> num2 = new LinkedList<>();

        module.sumLists(num1, num2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSumListsBothEmpty() throws Exception {
        LinkedList<Integer> num1 = new LinkedList<>();
        LinkedList<Integer> num2 = new LinkedList<>();

        module.sumLists(num1, num2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSumListsFirstNull() throws Exception {
        LinkedList<Integer> num2 = new LinkedList<>();
        num2.appendToTail(1);

        module.sumLists(null, num2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSumListsSecondNull() throws Exception {
        LinkedList<Integer> num1 = new LinkedList<>();
        num1.appendToTail(1);

        module.sumLists(num1, null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSumListsBothNull() throws Exception {
        module.sumLists(null, null);
    }
}