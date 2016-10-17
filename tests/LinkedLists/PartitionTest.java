package LinkedLists;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionTest {

    Partition module = new Partition();

    @Test
    public void testPartitionHappy() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        input.appendToTail(3);
        input.appendToTail(5);
        input.appendToTail(8);
        input.appendToTail(5);
        input.appendToTail(10);
        input.appendToTail(2);
        input.appendToTail(1);

        int pivot = 5;
        module.partition(input, pivot);

        LinkedList<Integer>.Node node = input.head;
        for(int i=0; i<3; i++){
            assertTrue(node.data<pivot);
            node=node.next;
        }
        for(int i=0; i<4; i++){
            assertTrue(node.data>=pivot);
            node=node.next;
        }
    }

    @Test
    public void testPartitionPivotHead() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        input.appendToTail(7);
        input.appendToTail(6);
        input.appendToTail(5);
        input.appendToTail(4);
        input.appendToTail(3);
        input.appendToTail(2);
        input.appendToTail(1);

        int pivot = 1;
        module.partition(input, pivot);

        LinkedList<Integer>.Node node = input.head;
        for(int i=0; i<7; i++){
            assertTrue(node.data>=pivot);
            node=node.next;
        }
    }

    @Test
    public void testPartitionPivotTail() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        input.appendToTail(7);
        input.appendToTail(6);
        input.appendToTail(5);
        input.appendToTail(4);
        input.appendToTail(3);
        input.appendToTail(2);
        input.appendToTail(1);

        int pivot = 7;
        module.partition(input, pivot);

        LinkedList<Integer>.Node node = input.head;
        for(int i=0; i<6; i++){
            assertTrue(node.data<pivot);
            node=node.next;
        }
        assertTrue(node.data>=pivot);
    }

    @Test
    public void testPartitionPivotGreater() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        input.appendToTail(7);
        input.appendToTail(6);
        input.appendToTail(5);
        input.appendToTail(4);
        input.appendToTail(3);
        input.appendToTail(2);
        input.appendToTail(1);

        int pivot = 8;
        module.partition(input, pivot);

        LinkedList<Integer>.Node node = input.head;
        for(int i=0; i<7; i++){
            assertTrue(node.data<pivot);
            node=node.next;
        }
    }

    @Test
    public void testPartitionPivotLesser() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        input.appendToTail(7);
        input.appendToTail(6);
        input.appendToTail(5);
        input.appendToTail(4);
        input.appendToTail(3);
        input.appendToTail(2);
        input.appendToTail(1);

        int pivot = 0;
        module.partition(input, pivot);

        LinkedList<Integer>.Node node = input.head;
        for(int i=0; i<7; i++){
            assertTrue(node.data>pivot);
            node=node.next;
        }
    }

    @Test
    public void testPartitionPivotMiddleNotInList() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        input.appendToTail(8);
        input.appendToTail(7);
        input.appendToTail(6);
        input.appendToTail(5);
        input.appendToTail(3);
        input.appendToTail(2);
        input.appendToTail(1);

        int pivot = 4;
        module.partition(input, pivot);

        LinkedList<Integer>.Node node = input.head;
        for(int i=0; i<3; i++){
            assertTrue(node.data<pivot);
            node=node.next;
        }
        for(int i=0; i<4; i++){
            assertTrue(node.data>=pivot);
            node=node.next;
        }
    }

    @Test
    public void testPartitionOneElementList() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        input.appendToTail(1);

        int pivot = 1;
        module.partition(input, pivot);

        LinkedList<Integer>.Node node = input.head;
        assertTrue(node.data==pivot);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testPartitionEmptyList() throws Exception {
        LinkedList<Integer> input = new LinkedList<>();
        module.partition(input, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPartitionNullList() throws Exception {
        module.partition(null, 0);
    }
}