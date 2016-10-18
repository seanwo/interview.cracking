package LinkedLists;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest extends LinkedListHelper{

    Palindrome module = new Palindrome();

    @Test
    public void testIsPalindromeHappy() throws Exception {
        LinkedList<Character> list = new LinkedList<>();
        list.appendToTail('k');
        list.appendToTail('a');
        list.appendToTail('y');
        list.appendToTail('a');
        list.appendToTail('k');

        assertTrue(module.isPalindrome(list));
    }

    @Test
    public void testIsPalindromeOdd() throws Exception {
        LinkedList<Character> list = new LinkedList<>();
        list.appendToTail('y');
        list.appendToTail('a');
        list.appendToTail('y');

        assertTrue(module.isPalindrome(list));
    }
    @Test

    public void testIsPalindromeOddNot() throws Exception {
        LinkedList<Character> list = new LinkedList<>();
        list.appendToTail('y');
        list.appendToTail('a');
        list.appendToTail('p');

        assertFalse(module.isPalindrome(list));
    }

    @Test
    public void testIsPalindromeEven() throws Exception {
        LinkedList<Character> list = new LinkedList<>();
        list.appendToTail('t');
        list.appendToTail('o');
        list.appendToTail('o');
        list.appendToTail('t');

        assertTrue(module.isPalindrome(list));
    }

    @Test
    public void testIsPalindromeEvenNot() throws Exception {
        LinkedList<Character> list = new LinkedList<>();
        list.appendToTail('t');
        list.appendToTail('a');
        list.appendToTail('o');
        list.appendToTail('t');

        assertFalse(module.isPalindrome(list));
    }

    @Test
    public void testIsPalindromeOne() throws Exception {
        LinkedList<Character> list = new LinkedList<>();
        list.appendToTail('a');

        assertTrue(module.isPalindrome(list));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsPalindromeEmpty() throws Exception {
        LinkedList<Character> list = new LinkedList<>();
        module.isPalindrome(list);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsPalindromeNull() throws Exception {
        module.isPalindrome(null);
    }
}