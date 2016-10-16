package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateMatrixTest {

    RotateMatrix module = new RotateMatrix();

    @Test
    public void testRotateMatrix4x4() throws Exception {
        int [][] input = {
                { 1, 2, 3, 4},
                { 5, 6, 7, 8},
                { 9,10,11,12},
                {13,14,15,16}};

        int [][] expected = {
                {13, 9, 5, 1},
                {14,10, 6, 2},
                {15,11, 7, 3},
                {16,12, 8, 4}};

        int [][] actual = module.rotateMatrix(input);

        assertArrayEquals(expected[0], actual[0]);
        assertArrayEquals(expected[1], actual[1]);
        assertArrayEquals(expected[2], actual[2]);
        assertArrayEquals(expected[3], actual[3]);
    }

    @Test
    public void testRotateMatrix3x3() throws Exception {
        int [][] input = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};

        int [][] expected = {
                {7,4,1},
                {8,5,2},
                {9,6,3}};

        int [][] actual = module.rotateMatrix(input);

        assertArrayEquals(expected[0], actual[0]);
        assertArrayEquals(expected[1], actual[1]);
        assertArrayEquals(expected[2], actual[2]);
    }

    @Test
    public void testRotateMatrix2x2() throws Exception {
        int [][] input = {
                {1,2},
                {3,4}};

        int [][] expected = {
                {3,1},
                {4,2}};

        int [][] actual = module.rotateMatrix(input);

        assertArrayEquals(expected[0], actual[0]);
        assertArrayEquals(expected[1], actual[1]);
    }

    @Test
    public void testRotateMatrix1x1() throws Exception {
        int [][] input = {{1}};

        int [][] expected = {{1}};

        int [][] actual = module.rotateMatrix(input);

        assertArrayEquals(expected[0], actual[0]);
    }

    @Test
    public void testRotateMatrixEmpty() throws Exception {
        int [][] input = {{}};

        int [][] expected = {{}};

        int [][] actual = module.rotateMatrix(input);

        assertEquals(expected.length, actual.length);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRotateMatrixNull() throws Exception {
        module.rotateMatrix(null);
    }
}