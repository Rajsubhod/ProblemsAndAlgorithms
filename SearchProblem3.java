//Given a rotated sorted array with unique elements find the minimum value of the array

import java.util.Arrays;
import java.util.Random;

public class SearchProblem3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,7,8,9};
        Random random = new Random();
        //random.setSeed(1);
        int x = random.nextInt(10);
        new RotateArray().funR(arr,x);
        System.out.println(Arrays.toString(arr));
        System.out.println(fun(arr));
    }
    //Time Complexity --- O(logn)
    public static int fun(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int min = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low + (high-low)/2;
            /*
                if(arr[mid]>arr[high]){
                    low = mid + 1;
                }
                else if(arr[mid]<=arr[high]){
                    min = mid;
                    high = mid-1;
                }
            */
            if(arr[mid]<=arr[high]){
                //This Condition checks if the current mid is minimum than the last one
                if(arr[mid]<min) min = mid;
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return min;
    }
}
