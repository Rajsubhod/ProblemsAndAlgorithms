//Given a array print/find all sum subsequences of the array

import java.util.Arrays;

public class SumOfSubsequences {
    public static void main(String[] args) {
        int[] arr = {2,4,5};
        fun(arr,0);
    }
    //Time complexity --- O(2^n)
    private static void fun(int[] arr,int sum) {
        if(arr.length==0){
            System.out.println(sum);
            return;
        }
        int curr = arr[0];
        arr = Arrays.copyOfRange(arr, 1, arr.length);
         //Take the curr into account
        fun(arr,sum+curr);
        //Do not take curr into account
        fun(arr,sum);
    }
}

