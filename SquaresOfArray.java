//Given a non-decreasing array return the square of each element

import java.util.Arrays;

public class SquaresOfArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,9,21,32};
        int[] res = fun(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] fun(int[] arr) {
        for(int i = 0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        return arr;
    }
}
