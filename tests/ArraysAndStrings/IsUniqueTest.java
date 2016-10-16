package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsUniqueTest {
    IsUnique module = new IsUnique();

    @Test
    public void testIsUniqueHappy() throws Exception {
        assertEquals(true, module.IsUnique("abc"));
    }

    @Test
    public void testIsUniqueSingle() throws Exception {
        assertEquals(true, module.IsUnique("a"));
    }

    @Test
    public void testIsUniqueEmpty() throws Exception {
        assertEquals(true, module.IsUnique(""));
    }

    @Test
    public void testIsUniqueSimpleDuplicate() throws Exception {
        assertEquals(false, module.IsUnique("aa"));
    }

    @Test
    public void testIsUniqueDuplicate() throws Exception {
        assertEquals(false, module.IsUnique("abcad"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsUniqueNull() throws Exception {
        assertEquals(true, module.IsUnique(null));
    }
}