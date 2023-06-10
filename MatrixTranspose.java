//Find the Transpose of a matrix using etra space

import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6}};
        int[][] matrix2={{1,2,3},{4,5,6},{7,8,9}};
        System.err.println(Arrays.deepToString(new MatrixTranspose().fun(matrix)));
        //System.err.println(Arrays.deepToString(new MatrixTranspose().fun2(matrix)));
        System.err.println(Arrays.deepToString(new MatrixTranspose().fun(matrix2)));
        System.err.println(Arrays.deepToString(new MatrixTranspose().fun2(matrix2)));
    }
    //Finding transpose using extra array
    public int[][] fun(int[][] matrix) {
        int[][] ans=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
    //Finding transpose without using extra space i.e. inline
    //This only applicable for square matrix
    public int[][] fun2(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        return matrix;
    }
    
}