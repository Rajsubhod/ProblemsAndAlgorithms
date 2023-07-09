/*
 Given a sorted array of N integers and an integer x, write a program to find the upper & lower bound of x.
    Example 1:
    Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
    Result: [1,2]
    Explanation: Index 1 is the smallest index such that arr[1] >= x.

    Example 2:
    Input Format: N = 5, arr[] = {3,5,8,15,19}, x = 9
    Result: [-1]
    Explanation: Index 3 is the smallest index such that arr[3] >= x.
 */

import java.util.Arrays;

public class ImplementUpperLowerBound {
    public static void main(String[] args) {
        int[] arr = {1};
        int x = 1;
        System.out.println(Arrays.toString(upperlowerBond(arr,x)));
    }
    //Time Complexity --- O((logn)^2)
    private static int[] upperlowerBond(int[] arr, int i) {
        if(arr.length<1){
            return new int[]{-1,-1};
        }
        int l=0;
        int h=arr.length-1;
        int occuranceL = -1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==i){
                occuranceL = mid;
                h = mid-1;
            }
            else if(arr[mid]>i){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        l=0;
        h=arr.length-1;
        int occuranceH = -1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==i){
                occuranceH = mid;
                l = mid+1;
            }
            else if(arr[mid]>i){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        int[] ans = {occuranceL,occuranceH};
        return ans;
    }
}
