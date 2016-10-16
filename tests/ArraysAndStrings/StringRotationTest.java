package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringRotationTest {

    StringRotation module = new StringRotation();

    @Test
    public void testIsStringRotationHappy() throws Exception {
        assertEquals(true, module.IsStringRotation("waterbottle", "erbottlewat"));
    }

    @Test
    public void testIsStringRotationFalse() throws Exception {
        assertEquals(false, module.IsStringRotation("waterbattle", "erbottlewat"));
    }

    @Test
    public void testIsStringRotationEmptyString() throws Exception {
        assertEquals(true, module.IsStringRotation("", ""));
    }

    @Test
    public void testIsStringRotationSingleChar() throws Exception {
        assertEquals(true, module.IsStringRotation("a", "a"));
    }

    @Test
    public void testIsStringRotationTwoChars() throws Exception {
        assertEquals(true, module.IsStringRotation("ab", "ba"));
    }

    @Test
    public void testIsStringRotationSameFullRotation() throws Exception {
        assertEquals(true, module.IsStringRotation("waterbottle", "waterbottle"));
    }

    @Test
    public void testIsStringRotationDifferentLengths() throws Exception {
        assertEquals(false, module.IsStringRotation("waterbottle", "watterbottles"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsStringRotationStringNull() throws Exception {
        module.IsStringRotation(null, "erbottlewat");
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsStringRotationRotationNull() throws Exception {
        module.IsStringRotation("waterbottle", null);
    }
}