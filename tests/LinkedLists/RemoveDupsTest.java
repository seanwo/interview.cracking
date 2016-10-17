package LinkedLists;

import org.junit.Test;

public class RemoveDupsTest extends LinkedListHelper {

    RemoveDups module = new RemoveDups();

    @Test
    public void testRemoveDupsHappy() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        input.appendToTail(1);
        input.appendToTail(2);
        input.appendToTail(3);
        input.appendToTail(1);
        input.appendToTail(4);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.appendToTail(1);
        expected.appendToTail(2);
        expected.appendToTail(3);
        expected.appendToTail(4);

        assertListEqual(expected, module.removeDups(input));
    }

    @Test
    public void testRemoveDupsNoDups() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        input.appendToTail(1);
        input.appendToTail(2);
        input.appendToTail(3);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.appendToTail(1);
        expected.appendToTail(2);
        expected.appendToTail(3);

        assertListEqual(expected, module.removeDups(input));
    }

    @Test
    public void testRemoveDupsTwoSequentialDups() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        input.appendToTail(1);
        input.appendToTail(1);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.appendToTail(1);

        assertListEqual(expected, module.removeDups(input));
    }

    @Test
    public void testRemoveDupsDupBeginning() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        input.appendToTail(1);
        input.appendToTail(1);
        input.appendToTail(2);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.appendToTail(1);
        expected.appendToTail(2);

        assertListEqual(expected, module.removeDups(input));
    }

    @Test
    public void testRemoveDupsDupEnd() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        input.appendToTail(1);
        input.appendToTail(2);
        input.appendToTail(2);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.appendToTail(1);
        expected.appendToTail(2);

        assertListEqual(expected, module.removeDups(input));
    }

    @Test
    public void testRemoveDupsDupMiddle() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        input.appendToTail(1);
        input.appendToTail(2);
        input.appendToTail(2);
        input.appendToTail(3);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.appendToTail(1);
        expected.appendToTail(2);
        expected.appendToTail(3);

        assertListEqual(expected, module.removeDups(input));
    }

    @Test
    public void testRemoveDupsAllDups() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        input.appendToTail(1);
        input.appendToTail(1);
        input.appendToTail(1);
        input.appendToTail(1);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.appendToTail(1);

        assertListEqual(expected, module.removeDups(input));
    }

    @Test
    public void testRemoveDupsTwoSeriesOfDups() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        input.appendToTail(1);
        input.appendToTail(1);
        input.appendToTail(2);
        input.appendToTail(2);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.appendToTail(1);
        expected.appendToTail(2);

        assertListEqual(expected, module.removeDups(input));
    }

    @Test
    public void testRemoveDupsOneElement() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        input.appendToTail(1);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.appendToTail(1);

        assertListEqual(expected, module.removeDups(input));
    }

    @Test
    public void testRemoveDupsNoElements() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        LinkedList<Integer> expected = new LinkedList<>();

        assertListEqual(expected, module.removeDups(input));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveDupsNull() throws Exception {
        module.removeDups(null);
    }
}