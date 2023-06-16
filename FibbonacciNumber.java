//Find the Kth number in the fibbonacci series

import java.util.Scanner;

public class FibbonacciNumber {
    static int[] memoization;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int num=sc.nextInt();
            series(num);
            memoization=new int[num+1];
            System.out.println();
            //This will give kth term from starting of series at 1
            System.out.println(fun2(num));
            //This will give kth term from starting of series at 0
            System.out.println(fun2(num-1));
        }
    }

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
    //Time complexity O(2^n) ---- useless
    private static int fun(int num) {
        if(num==0 || num==1){
            return num;
        }
        //IF THE SERIES START FROM 1
        return fun(num-1)+fun(num-2);
    }
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
    }
    //Time complexity O(log(n)) ----- very usefull
    private static int fun3(int num) {

        //IF THE SERIES START FROM 1
        return -1;
    }
}
