package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPermutationTest {
    CheckPermutation module = new CheckPermutation();

    @Test
    public void testIsPermutationHappy() throws Exception {
        assertEquals(true, module.IsPermutation("abc","cba"));
    }

    @Test
    public void testIsPermutationDuplicateCharacters() throws Exception {
        assertEquals(true, module.IsPermutation("aaa","aaa"));
    }

    @Test
    public void testIsPermutationDuplicateCharactersNotPermutation() throws Exception {
        assertEquals(false, module.IsPermutation("aab","aac"));
    }

    @Test
    public void testIsPermutationEmptySet() throws Exception {
        assertEquals(false, module.IsPermutation("abc","def"));
    }

    @Test
    public void testIsPermutationFirstEmpty() throws Exception {
        assertEquals(false, module.IsPermutation("","abc"));
    }

    @Test
    public void testIsPermutationSecondEmpty() throws Exception {
        assertEquals(false, module.IsPermutation("abc",""));
    }

    @Test
    public void testIsPermutationBothEmpty() throws Exception {
        assertEquals(true, module.IsPermutation("",""));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsPermutationFirstNull() throws Exception {
        module.IsPermutation(null,"abc");
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsPermutationSecondNull() throws Exception {
        module.IsPermutation("abc",null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsPermutationBothNull() throws Exception {
        module.IsPermutation(null,null);
    }
}