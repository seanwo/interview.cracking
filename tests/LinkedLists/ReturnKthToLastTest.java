package LinkedLists;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReturnKthToLastTest {

    ReturnKthToLast module = new ReturnKthToLast();

    @Test
    public void testKthToLastHappy() throws Exception {
        LinkedList input = new LinkedList();
        input.appendToTail(1);
        input.appendToTail(2);
        input.appendToTail(3);
        input.appendToTail(4);
        input.appendToTail(5);
        input.appendToTail(6);
        input.appendToTail(7);

        assertEquals(5, module.kthToLast(input, 2));
    }

    @Test
    public void testKthToLastLastElement() throws Exception {
        LinkedList input = new LinkedList();
        input.appendToTail(1);
        input.appendToTail(2);
        input.appendToTail(3);
        input.appendToTail(4);

        assertEquals(4, module.kthToLast(input, 0));
    }

    @Test
    public void testKthToLastFirstElement() throws Exception {
        LinkedList input = new LinkedList();
        input.appendToTail(1);
        input.appendToTail(2);
        input.appendToTail(3);
        input.appendToTail(4);

        assertEquals(1, module.kthToLast(input, 3));
    }

    @Test
    public void testKthToLastOneElementList() throws Exception {
        LinkedList input = new LinkedList();
        input.appendToTail(1);

        assertEquals(1, module.kthToLast(input, 0));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testKthToLastExceedsList() throws Exception {
        LinkedList input = new LinkedList();
        input.appendToTail(1);
        input.appendToTail(2);
        input.appendToTail(3);
        input.appendToTail(4);

        assertEquals(1, module.kthToLast(input, 4));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testKthToLastEmptyList() throws Exception {
        LinkedList input = new LinkedList();
        module.kthToLast(input, 0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testKthToLastNullList() throws Exception {
        module.kthToLast(null, 0);
    }
}