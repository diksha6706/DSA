public class BoundaryTraversal {
    static void main() {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int rows = mat.length;
        int cols = mat[0].length;
        for(int j=0; j<cols; j++)
            System.out.println(mat[0][j]);
        for(int i=1; i<rows; i++)
            System.out.println(mat[i][cols-1]);
        for(int j=cols-2; j>=0; j--)
            System.out.println(mat[rows-1][j]);
        for(int i=rows-2; i>0; i--)
            System.out.println(mat[i][0]);

    }
}
