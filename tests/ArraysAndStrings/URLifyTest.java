package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class URLifyTest {

    URLify module = new URLify();

    @Test
    public void testURLifyHappy() throws Exception {
        String input    = "Mr John Smith    ";
        String expected = "Mr%20John%20Smith";
        assertArrayEquals(expected.toCharArray(), module.urlify(input.toCharArray(), input.trim().length()));
    }

    @Test
    public void testURLifyEmpty() throws Exception {
        String input    = "";
        String expected = "";
        assertArrayEquals(expected.toCharArray(), module.urlify(input.toCharArray(), 0));
    }

    @Test
    public void testURLifyOneSpace() throws Exception {
        String input    = "   ";
        String expected = "%20";
        assertArrayEquals(expected.toCharArray(), module.urlify(input.toCharArray(), 1));
    }

    @Test
    public void testURLifyManySpaces() throws Exception {
        String input    = "         ";
        String expected = "%20%20%20";
        assertArrayEquals(expected.toCharArray(), module.urlify(input.toCharArray(), 3));
    }

    @Test
    public void testURLifyEndWithSpace() throws Exception {
        String input    = "John   ";
        String expected = "John%20";
        assertArrayEquals(expected.toCharArray(), module.urlify(input.toCharArray(), 5));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testURLifyNull() throws Exception {
        module.urlify(null, 1);
    }
}