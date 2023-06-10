//Calculate matrix Multiplication

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] M1={{1,2,3},{3,2,1}};
        int[][] M2={{3,2},{2,3},{3,1}};
        System.out.println(Arrays.deepToString(fun(M1,M2)));
    }
    public static int[][] fun(int[][] M1,int[][] M2) {
        if(M1[0].length!=M2.length){
            return new int[0][];
        }
        int[][] C = new int[M1.length][M2[0].length];
        for(int i=0;i<M1.length;i++){
            for(int j=0;j<M2[0].length;j++){
                for(int k=0;k<M1[0].length;k++){
                    C[i][j]+=M1[i][k]*M2[k][j];
                }
            }
        }
        return C;
    }
}
