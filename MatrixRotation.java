// Rotate the matrix in 90 degreee anti/clockwise

import java.util.Arrays;

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] matrix1={{1,2,3},{4,5,6}};
        int[][] matrix2={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.err.println(Arrays.deepToString(new MatrixRotation().fun(matrix1)));
        System.err.println(Arrays.deepToString(new MatrixRotation().fun(matrix2)));
    }
    /*So for rotating we are going to first find the transpose of the matix and then reverse
    the individual array
    {{1,2,3,4},         Transpose      {{1,5,9,13},     Reverse           {{13,9,5,1},
    {5,6,7,8},        ------------->    {2,6,10,14},  ----------->         {14,10,6,2},
    {9,10,11,12},                       {3,7,11,15},                       {15,11,7,3},
    {13,14,15,16}}                      {4,8,12,16}}                       {16,12,8,4}}
         <------------------------------------------------------------------->
                                Rotated by 90 degree clockwise

     {{1,2,3},               {{1,4},            {{4,1},
      {4,5,6}}     ----->     {2,5}, ----->      {5,2},
                              {3,6}}             {6,3}}
    This is not applicable for non square matrix
    */
    public int[][] fun(int[][] matrix){
        matrix=transpose(matrix);
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
        return matrix;
    }
    //reversing and array
    public static void reverse(int[] matrix){
        int i=0,j=matrix.length-1;
        while(j>=i){
            int temp=matrix[i];
            matrix[i]=matrix[j];
            matrix[j]=temp;
            i++;
            j--;
        }
    }
    //Finding transpose using extra array
    public int[][] transpose(int[][] matrix) {
        int[][] ans=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }

}
