//Given an array of positive and negative numbers segregate them in linear time O(n) & constant space O(1)
//The output should print all negative numbers followed by positive numbers

import java.util.Arrays;

public class SortProblem4 {
    //Time Complexity --- O(n)
    //Space Complexity --- O(1)
    private static void sort(int[] arr) {
        int i = 0, j = arr.length-1;
        while(i<=j){
           if(arr[i]>0 && arr[j]<0){
            swap(arr, i, j);
            i++;
            j--;
           }
           if(arr[i]<0) i++;
           if(arr[j]>0) j--;

        }
    }
    static void swap (int[] arr ,int i ,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,4,-5,-6,7,8,-9};
        System.out.println(" Input Array : "+Arrays.toString(arr));
        sort(arr);
        System.out.println("Output Array : "+Arrays.toString(arr));
    }
}
