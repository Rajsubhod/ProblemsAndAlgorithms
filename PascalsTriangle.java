//Print n row pascasls triangle

import java.util.Arrays;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        fun(n);
    }
    // This method creates an 2D array for which it stores 1 for index j=0 and j=i and sum of previous two array index (i-1)(j-1) & (i-1)(j)
    //Restriction use or make jagged array instead of complete 2D array
    private static void fun(int n) {
        int[][] arr = new int[n][];
        for(int i=0;i<n;i++){
            arr[i] = new int[i+1];
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    System.out.print(" 1 ");
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                    System.out.print(" "+ arr[i][j]+" ");
                }
            }
            System.out.println("  ");
        }
        //System.out.println(Arrays.deepToString(arr));
    }
}
