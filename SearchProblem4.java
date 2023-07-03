//Given a rotated sorted array with unique elements find the index of the target X if exist otherwise return -1. Time complexity must not exist O(logn)

import java.util.Arrays;
import java.util.Random;

public class SearchProblem4 {

    //Time Complexity --- O(logn)
    private static int fun(int[] arr , int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else{
                if(arr[mid]<arr[end]){ // One Sorted part of array 
                    if(arr[mid]<target && arr[end]>=target){ //target lies within this range
                        start = mid+1;
                    }
                    else{
                        end = mid-1;
                    }
                }
                else{ // Other Sorted part of array
                    if(arr[start]<=target && arr[mid]>target){ //target lies within this range
                        end = mid-1;
                    }
                    else{
                        start = mid+1;
                    }
                }
            }
        }
        
        return -1;
    }


    //Time Complexity --- O(logn^2) -> Best Case | O(logn^3) -> Average,Worst Case
    private static int fun1(int[] arr , int target) {
        int ans = -1;
        int min_idx = SearchProblem3.fun(arr);
        ans = BinarySearch(arr,0,min_idx-1,target);
        if(ans==-1){
            ans = BinarySearch(arr, min_idx, arr.length-1,target);
        }
        return ans;
    }
    // Binary Search using Loops iterative
    //Time Complexity --- O(logn)
    private static int BinarySearch(int[] arr, int l ,int h, int i){
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==i){
                return mid;
            }
            else if(arr[mid]>i){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
        public static void main(String[] args) {
        int[] arr={1,2,3,5,7,8,9};
        int target = 7;
        Random random = new Random();
        //random.setSeed(1);
        int x = random.nextInt(10);
        new RotateArray().funR(arr,x);
        System.out.println(Arrays.toString(arr));
        System.out.println(fun(arr,target));
    }
}
