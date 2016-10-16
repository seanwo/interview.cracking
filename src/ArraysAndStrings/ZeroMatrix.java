package ArraysAndStrings;

public class ZeroMatrix {

    private int[][] zeroRows(int[][] matrix, boolean[] rowsToZero){
        for(int i=0; i<matrix.length; i++){
            if (rowsToZero[i]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    private int[][] zeroCols(int[][] matrix, boolean[] colsToZero){
        for(int i=0; i<matrix[0].length; i++){
            if (colsToZero[i]) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        return matrix;
    }

    public int[][] zeroMatrix(int[][] matrix){
        if (null == matrix){
            throw new IllegalArgumentException("matrix can not be null");
        }
        if (matrix.length<1) return matrix;

        boolean[] rowsToZero = new boolean[matrix.length];
        boolean[] colsToZero = new boolean[matrix[0].length];

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (matrix[i][j]==0){
                    rowsToZero[i]=true;
                    colsToZero[j]=true;
                }
            }
        }

        matrix = zeroRows(matrix, rowsToZero);
        matrix = zeroCols(matrix, colsToZero);

        return matrix;
    }
}
