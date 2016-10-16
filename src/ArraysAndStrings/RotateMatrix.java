package ArraysAndStrings;

public class RotateMatrix {
    public int[][] RotateMatrix(int matrix[][]){
        if (null==matrix){
            throw new IllegalArgumentException("matrix cannot be null");
        }
        if (matrix.length<2) return matrix;

        int M = matrix.length; //M x M

        int row;
        int col;

        for (int layer=0; layer<M/2; layer++) {
            for (int i=0; i<(M/(layer+1)-1); i++){
                row=layer+i;
                col=layer;
                int prev=matrix[row][col];
                for (int side=0; side<4; side++) {
                    int p=row;
                    row = col;
                    col = M - p - 1;
                    int tmp = matrix[row][col];
                    matrix[row][col] = prev;
                    prev = tmp;
                }

            }
        }

        return matrix;
    }
}
