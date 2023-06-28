//given an array with numbers move all the zeros to the end of the array maintaining the relative order

import java.util.Arrays;

public class SortProblem1 {
    public static void main(String[] args) {
        int[] arr={0,1,3,0,0,5,6,17,42};
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Bubble sort has been used for this problem
    //Time complexity --- O(n) -> Best Case | O(n^2) -> Average & Worst Case
    private static void fun(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            boolean flag = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false) {
                return;
            }
        }
    }
}
