package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class OneAwayTest {

    OneAway module = new OneAway();

    //Remove
    @Test
    public void testIsOneEditAwayRemoveOneBeginning() throws Exception {
        assertEquals(true, module.isOneEditAway("ale", "pale"));
    }

    @Test
    public void testIsOneEditAwayRemoveOneBeginningSwap() throws Exception {
        assertEquals(true, module.isOneEditAway("pale", "ale"));
    }

    @Test
    public void testIsOneEditAwayRemoveOneMiddle() throws Exception {
        assertEquals(true, module.isOneEditAway("pale", "ple"));
    }

    @Test
    public void testIsOneEditAwayRemoveOneMiddleSwap() throws Exception {
        assertEquals(true, module.isOneEditAway("ple", "pale"));
    }

    @Test
    public void testIsOneEditAwayRemoveOneEnd() throws Exception {
        assertEquals(true, module.isOneEditAway("pales", "pale"));
    }

    @Test
    public void testIsOneEditAwayRemoveOneEndSwap() throws Exception {
        assertEquals(true, module.isOneEditAway("pale", "pales"));
    }

    @Test
    public void testIsOneEditAwayRemoveTwo() throws Exception {
        assertEquals(false, module.isOneEditAway("pale", "pa"));
    }

    @Test
    public void testIsOneEditAwayRemoveTwoSwap() throws Exception {
        assertEquals(false, module.isOneEditAway("pa", "pale"));
    }

    //Replace

    @Test
    public void testIsOneEditAwayReplaceOneBeginning() throws Exception {
        assertEquals(true, module.isOneEditAway("pale", "bale"));
    }

    @Test
    public void testIsOneEditAwayReplaceOneBeginningSwap() throws Exception {
        assertEquals(true, module.isOneEditAway("bale", "pale"));
    }

    @Test
    public void testIsOneEditAwayReplaceOneMiddle() throws Exception {
        assertEquals(true, module.isOneEditAway("pale", "pele"));
    }

    @Test
    public void testIsOneEditAwayReplaceOneMiddleSwap() throws Exception {
        assertEquals(true, module.isOneEditAway("pele", "pale"));
    }

    @Test
    public void testIsOneEditAwayReplaceOneEnd() throws Exception {
        assertEquals(true, module.isOneEditAway("pale", "pala"));
    }

    @Test
    public void testIsOneEditAwayReplaceOneEndSwap() throws Exception {
        assertEquals(true, module.isOneEditAway("pala", "pale"));
    }

    @Test
    public void testIsOneEditAwayReplaceTwo() throws Exception {
        assertEquals(false, module.isOneEditAway("pale", "bake"));
    }

    @Test
    public void testIsOneEditAwayReplaceTwoSwap() throws Exception {
        assertEquals(false, module.isOneEditAway("bake", "pale"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsOneEditAwayOneNull() throws Exception {
        module.isOneEditAway(null, "pale");
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsOneEditAwayOtherNull() throws Exception {
        module.isOneEditAway("pale", null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsOneEditAwayTwoNull() throws Exception {
        module.isOneEditAway(null, null);
    }
}