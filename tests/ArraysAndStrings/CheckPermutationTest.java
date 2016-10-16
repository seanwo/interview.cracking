package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPermutationTest {
    CheckPermutation module = new CheckPermutation();

    @Test
    public void testIsPermutationHappy() throws Exception {
        assertEquals(true, module.isPermutation("abc","cba"));
    }

    @Test
    public void testIsPermutationDuplicateCharacters() throws Exception {
        assertEquals(true, module.isPermutation("aaa","aaa"));
    }

    @Test
    public void testIsPermutationDuplicateCharactersNotPermutation() throws Exception {
        assertEquals(false, module.isPermutation("aab","aac"));
    }

    @Test
    public void testIsPermutationEmptySet() throws Exception {
        assertEquals(false, module.isPermutation("abc","def"));
    }

    @Test
    public void testIsPermutationFirstEmpty() throws Exception {
        assertEquals(false, module.isPermutation("","abc"));
    }

    @Test
    public void testIsPermutationSecondEmpty() throws Exception {
        assertEquals(false, module.isPermutation("abc",""));
    }

    @Test
    public void testIsPermutationBothEmpty() throws Exception {
        assertEquals(true, module.isPermutation("",""));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsPermutationFirstNull() throws Exception {
        module.isPermutation(null,"abc");
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsPermutationSecondNull() throws Exception {
        module.isPermutation("abc",null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsPermutationBothNull() throws Exception {
        module.isPermutation(null,null);
    }
}