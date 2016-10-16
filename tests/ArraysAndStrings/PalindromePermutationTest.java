package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePermutationTest {

    PalindromePermutation module = new PalindromePermutation();

    @Test
    public void testIsPalindromePermutationHappy() throws Exception {
        assertEquals(true, module.isPalindromePermutation("tactcoa"));
    }

    @Test
    public void testIsPalindromePermutationMixedCase() throws Exception {
        assertEquals(true, module.isPalindromePermutation("TactCoa"));
    }

    @Test
    public void testIsPalindromePermutationWithSpace() throws Exception {
        assertEquals(true, module.isPalindromePermutation("Tact Coa"));
    }

    @Test
    public void testIsPalindromePermutationSingleLetter() throws Exception {
        assertEquals(true, module.isPalindromePermutation("a"));
    }

    @Test
    public void testIsPalindromePermutationEmpty() throws Exception {
        assertEquals(true, module.isPalindromePermutation(""));
    }

    @Test
    public void testIsPalindromePermutationNotPalindromePerm() throws Exception {
        assertEquals(false, module.isPalindromePermutation("abaa"));
    }

    @Test
    public void testIsPalindromePermutationNotPalindromePermAllUnique() throws Exception {
        assertEquals(false, module.isPalindromePermutation("abd"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsPalindromePermutationNull() throws Exception {
        module.isPalindromePermutation(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsPalindromePermutationIllegalChar() throws Exception {
        module.isPalindromePermutation("ab!a");
    }
}