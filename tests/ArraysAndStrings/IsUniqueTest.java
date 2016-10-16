package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsUniqueTest {
    IsUnique module = new IsUnique();

    @Test
    public void testIsUniqueHappy() throws Exception {
        assertEquals(true, module.isUnique("abc"));
    }

    @Test
    public void testIsUniqueSingle() throws Exception {
        assertEquals(true, module.isUnique("a"));
    }

    @Test
    public void testIsUniqueEmpty() throws Exception {
        assertEquals(true, module.isUnique(""));
    }

    @Test
    public void testIsUniqueSimpleDuplicate() throws Exception {
        assertEquals(false, module.isUnique("aa"));
    }

    @Test
    public void testIsUniqueDuplicate() throws Exception {
        assertEquals(false, module.isUnique("abcad"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsUniqueNull() throws Exception {
        assertEquals(true, module.isUnique(null));
    }
}