// Given an array return prefix sum/ running sum of the array without creating new array

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,9,21,32};
        System.out.println(Arrays.toString(fun(arr)));
    }

    private static int[] fun(int[] arr) {
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
}