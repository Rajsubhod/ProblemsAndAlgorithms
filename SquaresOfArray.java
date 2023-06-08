//Given a non-decreasing array return the square of each element

import java.util.Arrays;

public class SquaresOfArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,9,21,32};
        int[] arrA = {-21,-7,-5,-2,3,6,9,21,32};
        int[] res = fun(arr);
        int[] resA = funA(arrA);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(resA));
    }
    //This is valid only if the numbers are positive
    private static int[] fun(int[] arr) {
        for(int i = 0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        return arr;
    }
    //Valid when numbers are both positive and negative
    private static int[] funA(int[] arr){
        int left=0, right=arr.length-1;
        int k=arr.length-1;
        int[] ans = new int[arr.length];
        for(;left<=right;){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k--]=arr[left]*arr[left];
                left++;
            }
            if(Math.abs(arr[left])<Math.abs(arr[right])){
                ans[k--]=arr[right]*arr[right];
                right--;
            }
            if(Math.abs(arr[left])==Math.abs(arr[right])){
                ans[k--]=arr[right]*arr[right];
                right--;
            }

        }
        return ans;
    }
}
