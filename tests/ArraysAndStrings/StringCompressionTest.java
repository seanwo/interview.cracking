package ArraysAndStrings;

import org.junit.Test;

import java.util.StringTokenizer;

import static org.junit.Assert.*;

public class StringCompressionTest {

    StringCompression module = new StringCompression();

    @Test(expected = IllegalArgumentException.class)
    public void testStringCompressionNull() throws Exception {
        module.StringCompression(null);
    }

    @Test
    public void testStringCompressionEmptyNotCompressed() throws Exception {
        String input = "";
        String expected = input;
        assertEquals(expected, module.StringCompression(input));
    }

    @Test
    public void testStringCompressionOneStringNotCompressed() throws Exception {
        String input = "a";
        String expected = input;
        assertEquals(expected, module.StringCompression(input));
    }

    @Test
    public void testStringCompressionTwoStringNotCompressed() throws Exception {
        String input = "aa";
        String expected = input;
        assertEquals(expected, module.StringCompression(input));
    }

    @Test
    public void testStringCompressionThreeStringCompress() throws Exception {
        String input = "aaa";
        String expected = "a3";
        assertEquals(expected, module.StringCompression(input));
    }

    @Test
    public void testStringCompressionThreeStringNotCompressed() throws Exception {
        String input = "abc";
        String expected = "abc";
        assertEquals(expected, module.StringCompression(input));
    }

    @Test
    public void testStringCompressionHappyCompressed() throws Exception {
        String input = "aabcccccaaa";
        String expected = "a2b1c5a3";
        assertEquals(expected, module.StringCompression(input));
    }
}