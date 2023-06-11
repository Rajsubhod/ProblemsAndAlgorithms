//Create a n*m matrix with numbers in spiral order

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int n = 4;
        int m =4;
        int[][] arr=fun(n,m);
        //System.out.println(Arrays.deepToString(fun(n,m)));
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }
    }

    private static int[][] fun(int n, int m) {
        int[][] matrix = new int[n][m];
        int topRow=0;
        int rightCol=m-1;
        int buttonRow=n-1;
        int leftCol=0;
        int num=1;
        int totaElements = n*m;
        while(num<=totaElements){
            //topRow -> leftCol to rightCol
            for(int j=leftCol;j<=rightCol && num<=totaElements;j++){
                matrix[topRow][j]=num;
                num++;
            }
            topRow++;
            //RightColumn -> topRow to buttomRow
            for(int i=topRow;i<=buttonRow && num<=totaElements;i++){
                matrix[i][rightCol]=num;
                num++;
            }
            rightCol--;
            //ButtomRow -> rightCol to leftCol
            for(int j=rightCol;j>=leftCol && num<=totaElements;j--){
                matrix[buttonRow][j]=num;
                num++;
            }
            buttonRow--;
            //LeftColumn -> buttomRow to topRow
            for(int i=buttonRow;i>=topRow && num<=totaElements;i--){
                matrix[i][leftCol]=num;
                num++;
            }
            leftCol++;
        }
        return matrix;
    }
}
