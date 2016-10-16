package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePermutationTest {

    PalindromePermutation module = new PalindromePermutation();

    @Test
    public void testIsPalindromePermutationHappy() throws Exception {
        assertEquals(true, module.IsPalindromePermutation("tactcoa"));
    }

    @Test
    public void testIsPalindromePermutationMixedCase() throws Exception {
        assertEquals(true, module.IsPalindromePermutation("TactCoa"));
    }

    @Test
    public void testIsPalindromePermutationWithSpace() throws Exception {
        assertEquals(true, module.IsPalindromePermutation("Tact Coa"));
    }

    @Test
    public void testIsPalindromePermutationSingleLetter() throws Exception {
        assertEquals(true, module.IsPalindromePermutation("a"));
    }

    @Test
    public void testIsPalindromePermutationEmpty() throws Exception {
        assertEquals(true, module.IsPalindromePermutation(""));
    }

    @Test
    public void testIsPalindromePermutationNotPalindromePerm() throws Exception {
        assertEquals(false, module.IsPalindromePermutation("abaa"));
    }

    @Test
    public void testIsPalindromePermutationNotPalindromePermAllUnique() throws Exception {
        assertEquals(false, module.IsPalindromePermutation("abd"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsPalindromePermutationNull() throws Exception {
        module.IsPalindromePermutation(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsPalindromePermutationIllegalChar() throws Exception {
        module.IsPalindromePermutation("ab!a");
    }
}