//Find the Kth number in the fibbonacci series

import java.util.Arrays;
import java.util.Scanner;

public class FibbonacciNumber {
    //Matrix Exponentiation method -> Binary Exponentiation * Matrix Multiplication
    // O(log(n))                   ->       O(log(num))     * num^3 ==> O(k^3(log(k))) = O(log(n1))
    //Time complexity O(log(n)) ----- very usefull
    private static int matrixExponentiation(int num) {
        int [][] con = {{1,1},{1,0}};
        if (num <= 0)
            return 0;
        if (num == 1)
            return 1;
        int [][] ans = binaryExponentiation(con,num-1);
        System.out.println(Arrays.deepToString(ans));
        //IF THE SERIES START FROM 0
        return ans[0][1];
        //IF THE SERIES START FROM 1
        //return ans[0][0];
    }
    private static int[][] binaryExponentiation(int[][] con, int num) {
        if(num==1){
            return con;
        }
        int[][] temp=binaryExponentiation(con, num/2);
        int[][] ans=MatrixMultiplication.fun(temp, temp);
        if(num%2==1){
            ans=MatrixMultiplication.fun(ans,con);
        }
        return ans;
    }
    //Using Memoization (Dynamic Programming) with recursion
    //Time complexity O(n) ----- a bit usefull
    private static int fun2(int num) {
        if(num==0 || num==1){
            memoization[num]=num;
            return num;
        }
        else{
            if(memoization[num-2]==0) memoization[num-2]=fun2(num-2);
            if(memoization[num-1]==0) memoization[num-1]=fun2(num-1);
        }  
        memoization[num]=memoization[num-2]+memoization[num-1];
        //IF THE SERIES START FROM 1
        return memoization[num];
        //IF THE SERIES START FROM 0
        //return memoization[num-1];
    }
    //Finding the nth fibonnacc term and printing the series 
    //Time complexity O(n)
    private static void series(int num) {
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=3;i<=num;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    //Using recursion
    //Time complexity O(2^n) ---- useless
    private static int fun(int num) {
        if(num==0 || num==1){
            return num;
        }
        //IF THE SERIES START FROM 1
        return fun(num-1)+fun(num-2);
    }
    static int[] memoization;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int num=sc.nextInt();
            series(num);
            memoization=new int[num+1];
            System.out.println();
            System.out.println(fun2(num));
            System.out.println(matrixExponentiation(num));
        }
    }
}
