package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class OneAwayTest {

    OneAway module = new OneAway();

    //Remove
    @Test
    public void testIsOneEditAwayRemoveOneBeginning() throws Exception {
        assertEquals(true, module.IsOneEditAway("ale", "pale"));
    }

    @Test
    public void testIsOneEditAwayRemoveOneBeginningSwap() throws Exception {
        assertEquals(true, module.IsOneEditAway("pale", "ale"));
    }

    @Test
    public void testIsOneEditAwayRemoveOneMiddle() throws Exception {
        assertEquals(true, module.IsOneEditAway("pale", "ple"));
    }

    @Test
    public void testIsOneEditAwayRemoveOneMiddleSwap() throws Exception {
        assertEquals(true, module.IsOneEditAway("ple", "pale"));
    }

    @Test
    public void testIsOneEditAwayRemoveOneEnd() throws Exception {
        assertEquals(true, module.IsOneEditAway("pales", "pale"));
    }

    @Test
    public void testIsOneEditAwayRemoveOneEndSwap() throws Exception {
        assertEquals(true, module.IsOneEditAway("pale", "pales"));
    }

    @Test
    public void testIsOneEditAwayRemoveTwo() throws Exception {
        assertEquals(false, module.IsOneEditAway("pale", "pa"));
    }

    @Test
    public void testIsOneEditAwayRemoveTwoSwap() throws Exception {
        assertEquals(false, module.IsOneEditAway("pa", "pale"));
    }

    //Replace

    @Test
    public void testIsOneEditAwayReplaceOneBeginning() throws Exception {
        assertEquals(true, module.IsOneEditAway("pale", "bale"));
    }

    @Test
    public void testIsOneEditAwayReplaceOneBeginningSwap() throws Exception {
        assertEquals(true, module.IsOneEditAway("bale", "pale"));
    }

    @Test
    public void testIsOneEditAwayReplaceOneMiddle() throws Exception {
        assertEquals(true, module.IsOneEditAway("pale", "pele"));
    }

    @Test
    public void testIsOneEditAwayReplaceOneMiddleSwap() throws Exception {
        assertEquals(true, module.IsOneEditAway("pele", "pale"));
    }

    @Test
    public void testIsOneEditAwayReplaceOneEnd() throws Exception {
        assertEquals(true, module.IsOneEditAway("pale", "pala"));
    }

    @Test
    public void testIsOneEditAwayReplaceOneEndSwap() throws Exception {
        assertEquals(true, module.IsOneEditAway("pala", "pale"));
    }

    @Test
    public void testIsOneEditAwayReplaceTwo() throws Exception {
        assertEquals(false, module.IsOneEditAway("pale", "bake"));
    }

    @Test
    public void testIsOneEditAwayReplaceTwoSwap() throws Exception {
        assertEquals(false, module.IsOneEditAway("bake", "pale"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsOneEditAwayOneNull() throws Exception {
        module.IsOneEditAway(null, "pale");
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsOneEditAwayOtherNull() throws Exception {
        module.IsOneEditAway("pale", null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsOneEditAwayTwoNull() throws Exception {
        module.IsOneEditAway(null, null);
    }
}