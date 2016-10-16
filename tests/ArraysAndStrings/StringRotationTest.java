package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringRotationTest {

    StringRotation module = new StringRotation();

    @Test
    public void testIsStringRotationHappy() throws Exception {
        assertEquals(true, module.isStringRotation("waterbottle", "erbottlewat"));
    }

    @Test
    public void testIsStringRotationFalse() throws Exception {
        assertEquals(false, module.isStringRotation("waterbattle", "erbottlewat"));
    }

    @Test
    public void testIsStringRotationEmptyString() throws Exception {
        assertEquals(true, module.isStringRotation("", ""));
    }

    @Test
    public void testIsStringRotationSingleChar() throws Exception {
        assertEquals(true, module.isStringRotation("a", "a"));
    }

    @Test
    public void testIsStringRotationTwoChars() throws Exception {
        assertEquals(true, module.isStringRotation("ab", "ba"));
    }

    @Test
    public void testIsStringRotationSameFullRotation() throws Exception {
        assertEquals(true, module.isStringRotation("waterbottle", "waterbottle"));
    }

    @Test
    public void testIsStringRotationDifferentLengths() throws Exception {
        assertEquals(false, module.isStringRotation("waterbottle", "watterbottles"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsStringRotationStringNull() throws Exception {
        module.isStringRotation(null, "erbottlewat");
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsStringRotationRotationNull() throws Exception {
        module.isStringRotation("waterbottle", null);
    }
}