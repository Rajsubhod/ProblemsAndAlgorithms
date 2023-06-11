//Print all the elements in a matrix in spiral order
public class SpiralOrderMatrix {
    public static void main(String[] args) {
        int[][] matrix1={{1,2,3},{4,5,6}};
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        fun(matrix);
    }

    private static void fun(int[][] matrix) {
        int topRow=0;
        int rightCol=matrix[0].length-1;
        int buttonRow=matrix.length-1;
        int leftCol=0;
        int num=0;
        int totaElements = matrix.length*matrix[0].length;
        while(num<totaElements){
            //topRow -> leftCol to rightCol
            for(int j=leftCol;j<=rightCol && num<totaElements;j++){
                System.out.print(matrix[topRow][j]+ " ");
                num++;
            }
            topRow++;
            //RightColumn -> topRow to buttomRow
            for(int i=topRow;i<=buttonRow && num<totaElements;i++){
                System.out.print(matrix[i][rightCol]+ " ");
                num++;
            }
            rightCol--;
            //ButtomRow -> rightCol to leftCol
            for(int j=rightCol;j>=leftCol && num<totaElements;j--){
                System.out.print(matrix[buttonRow][j]+ " ");
                num++;
            }
            buttonRow--;
            //LeftColumn -> buttomRow to topRow
            for(int i=buttonRow;i>=topRow && num<totaElements;i--){
                System.out.print(matrix[i][leftCol]+ " ");
                num++;
            }
            leftCol++;
        }
    }
}
