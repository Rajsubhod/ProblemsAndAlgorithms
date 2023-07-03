//Given a rotated sorted array having duplicate elements return true if target present and false if not if possible return the index.
import java.util.Arrays;
import java.util.Random;

public class SearchProblem5 {

     private static int fun(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[start]==arr[mid] && arr[end]==arr[mid]) {
                start++;
                end--;
            }
            else if(arr[mid] <= arr[end]){
                if(arr[mid]<target && arr[end]>=target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(arr[start]<=target && arr[mid]>target){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,4,4,5,5,5,5,5,7,7,8,8,9,9,9};
        int target = 7;
        Random random = new Random();
        //random.setSeed(1);
        int x = random.nextInt(10);
        new RotateArray().funR(arr,x);
        System.out.println(Arrays.toString(arr));
        System.out.println(fun(arr,target));
    }
}
