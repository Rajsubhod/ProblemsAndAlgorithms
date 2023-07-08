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
        int[] arr = {1,2,2,3};
        int x = 4;
        System.out.println(Arrays.toString(upperlowerBond(arr,x)));
    }
    //Time Complexity --- O((logn)^2)
    private static int[] upperlowerBond(int[] arr, int x) {
        int st = 0;
        int end = arr.length-1;
        int low=-1,high=-1;
        //Finding low
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]<=x){
                low=mid;
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        st=0;
        end=arr.length-1;
        //Fiding high
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]>x){
                high=mid-1;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        int[] ans = {low,high};
        if(ans[0]!=x){
            ans[0]=-1;
        }
        return ans;
    }
}
