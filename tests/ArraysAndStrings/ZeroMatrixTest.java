package ArraysAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroMatrixTest {

    ZeroMatrix module = new ZeroMatrix();

    @Test
    public void testRotateMatrixOneZero() throws Exception {
        int [][] input = {
                { 1, 2, 3, 4},
                { 5, 6, 0, 8},
                { 9,10,11,12},
                {13,14,15,16}};

        int [][] expected = {
                { 1, 2, 0, 4},
                { 0, 0, 0, 0},
                { 9,10, 0,12},
                {13,14, 0,16}};

        int [][] actual = module.ZeroMatrix(input);

        assertArrayEquals(expected[0], actual[0]);
        assertArrayEquals(expected[1], actual[1]);
        assertArrayEquals(expected[2], actual[2]);
        assertArrayEquals(expected[3], actual[3]);
    }

    @Test
    public void testRotateMatrixTwoDistinctZeros() throws Exception {
        int [][] input = {
                { 1, 2, 3, 4},
                { 5, 6, 0, 8},
                { 9, 0,11,12},
                {13,14,15,16}};

        int [][] expected = {
                { 1, 0, 0, 4},
                { 0, 0, 0, 0},
                { 0, 0, 0, 0},
                {13, 0, 0,16}};

        int [][] actual = module.ZeroMatrix(input);

        assertArrayEquals(expected[0], actual[0]);
        assertArrayEquals(expected[1], actual[1]);
        assertArrayEquals(expected[2], actual[2]);
        assertArrayEquals(expected[3], actual[3]);
    }

    @Test
    public void testRotateMatrixCornerZero() throws Exception {
        int [][] input = {
                { 0, 2, 3, 4},
                { 5, 6, 7, 8},
                { 9,10,11,12},
                {13,14,15,16}};

        int [][] expected = {
                { 0, 0, 0, 0},
                { 0, 6, 7, 8},
                { 0,10,11,12},
                { 0,14,15,16}};

        int [][] actual = module.ZeroMatrix(input);

        assertArrayEquals(expected[0], actual[0]);
        assertArrayEquals(expected[1], actual[1]);
        assertArrayEquals(expected[2], actual[2]);
        assertArrayEquals(expected[3], actual[3]);
    }

    @Test
    public void testRotateMatrixDiagonalZeros() throws Exception {
        int [][] input = {
                { 0, 2, 3, 4},
                { 5, 0, 7, 8},
                { 9,10, 0,12},
                {13,14,15, 0}};

        int [][] expected = {
                { 0, 0, 0, 0},
                { 0, 0, 0, 0},
                { 0, 0, 0, 0},
                { 0, 0, 0, 0}};

        int [][] actual = module.ZeroMatrix(input);

        assertArrayEquals(expected[0], actual[0]);
        assertArrayEquals(expected[1], actual[1]);
        assertArrayEquals(expected[2], actual[2]);
        assertArrayEquals(expected[3], actual[3]);
    }

    @Test
    public void testRotateMatrixAllZeros() throws Exception {
        int [][] input = {
                { 0, 0, 0, 0},
                { 0, 0, 0, 0},
                { 0, 0, 0, 0},
                { 0, 0, 0, 0}};

        int [][] expected = {
                { 0, 0, 0, 0},
                { 0, 0, 0, 0},
                { 0, 0, 0, 0},
                { 0, 0, 0, 0}};

        int [][] actual = module.ZeroMatrix(input);

        assertArrayEquals(expected[0], actual[0]);
        assertArrayEquals(expected[1], actual[1]);
        assertArrayEquals(expected[2], actual[2]);
        assertArrayEquals(expected[3], actual[3]);
    }

    @Test
    public void testRotateMatrixOneRow() throws Exception {
        int [][] input = {
                { 1, 0, 3, 4}};

        int [][] expected = {
                { 0, 0, 0, 0}};

        int [][] actual = module.ZeroMatrix(input);

        assertArrayEquals(expected[0], actual[0]);
    }

    @Test
    public void testRotateMatrixOneColumn() throws Exception {
        int [][] input = {
                { 1},
                { 0},
                { 3},
                { 4}};

        int [][] expected = {
                { 0},
                { 0},
                { 0},
                { 0}};

        int [][] actual = module.ZeroMatrix(input);

        assertArrayEquals(expected[0], actual[0]);
        assertArrayEquals(expected[1], actual[1]);
        assertArrayEquals(expected[2], actual[2]);
        assertArrayEquals(expected[3], actual[3]);
    }

    @Test
    public void testRotateMatrix1x1a() throws Exception {
        int [][] input = {{1}};

        int [][] expected = {{1}};

        int [][] actual = module.ZeroMatrix(input);

        assertArrayEquals(expected[0], actual[0]);
    }

    @Test
    public void testRotateMatrix1x1b() throws Exception {
        int [][] input = {{0}};

        int [][] expected = {{0}};

        int [][] actual = module.ZeroMatrix(input);

        assertArrayEquals(expected[0], actual[0]);
    }

    @Test
    public void testRotateMatrixEmpty() throws Exception {
        int [][] input = {{}};

        int [][] expected = {{}};

        int [][] actual = module.ZeroMatrix(input);

        assertEquals(expected.length, actual.length);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRotateMatrixNull() throws Exception {
        module.ZeroMatrix(null);
    }}