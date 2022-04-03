package LinkedLists;

import org.junit.Test;

public class DeleteMiddleNodeTest extends LinkedListHelper{

    DeleteMiddleNode module = new DeleteMiddleNode();

    @Test
    public void testDeleteMiddleNodeHappy() throws Exception {
        LinkedList<Character> input = new LinkedList<>();
        input.appendToTail('a');
        input.appendToTail('b');
        LinkedList<Character>.Node node = input.appendToTail('c');
        input.appendToTail('d');

        LinkedList<Character> expected = new LinkedList<>();
        expected.appendToTail('a');
        expected.appendToTail('b');
        expected.appendToTail('d');

        module.DeleteMiddleNode(node);

        assertListEqual(expected, input);
    }

    @Test
    public void testDeleteMiddleNodeFirst() throws Exception {
        LinkedList<Character> input = new LinkedList<>();
        LinkedList<Character>.Node node = input.appendToTail('a');
        input.appendToTail('b');
        input.appendToTail('c');
        input.appendToTail('d');

        LinkedList<Character> expected = new LinkedList<>();
        expected.appendToTail('b');
        expected.appendToTail('c');
        expected.appendToTail('d');

        module.DeleteMiddleNode(node);

        assertListEqual(expected, input);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testDeleteMiddleNodeLastNode() throws Exception {
        LinkedList<Character> input = new LinkedList<>();
        input.appendToTail('a');
        input.appendToTail('b');
        LinkedList<Character>.Node node = input.appendToTail('c');

        module.DeleteMiddleNode(node);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testDeleteMiddleNodeNodeNull() throws Exception {
        module.DeleteMiddleNode(null);
    }
}