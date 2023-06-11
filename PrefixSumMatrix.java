//A big matrix is given and two points or cells of the matrix (l1,r1) & (l2,r2) is given find the sum of all the cells of the rectangle formed by the points
public class PrefixSumMatrix {
    public static void main(String[] args) {
        int[][] matrix = formMatrix(7,7);
        int l1=3;
        int r1=1;
        int l2=5;
        int r2=4;
        int res=sumP(matrix,l1,r1,l2,r2);
        System.out.println("\n"+res);
    }
    //Brute force Method
    private static int sum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
    //Prefix Sum over row Method
    private static int sumR(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum=0;
        prefixSumR(matrix);
        for(int i=l1;i<=l2;i++){
            if(r1>0){
                sum+=matrix[i][r2]-matrix[i][r1-1];
            }
            else{
                sum+=matrix[i][r2];
            }
        }
        return sum;
    }
    //Prfix Sum over row & column Method
    private static int sumP(int[][] matrix, int l1, int r1, int l2, int r2) {
        prefixSum(matrix);
        int upSum=0;
        if(l1>0)
            upSum=matrix[l1-1][r2];
        int sideSum=0;
        if(r1>0)
            sideSum=matrix[l2][r1-1];
        int diagonalUpSUm=0;
        if(l1>0 && r1>0)
            diagonalUpSUm = matrix[l1-1][r1-1];
        int sum = matrix[l2][r2];
        return sum-upSum-sideSum+diagonalUpSUm;
        
    }
    private static void prefixSum(int[][] matrix) {
        printMatrix(matrix);
        prefixSumR(matrix);
        printMatrix(matrix);
        prefixSumC(matrix);
        printMatrix(matrix);
    }
    //Prefix Sum of Matrix over Rows
    private static void prefixSumR(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                matrix[i][j]=matrix[i][j-1]+matrix[i][j];
            }
        }
    }
    //Prefix Sum of Matrix over Column
    private static void prefixSumC(int[][] matrix) {
        for(int j=0;j<matrix[0].length;j++){
            for(int i=1;i<matrix.length;i++){
                matrix[i][j]=matrix[i-1][j]+matrix[i][j];
            }
        }
    }
    private static int[][] formMatrix(int row,int column) {
        int[][] arr= new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=1;
            }
        }
        return arr;
    }
    private static void printMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }
    }
}