/*
    Given an array find the sum of the range of the quary.
    The array follows 1 based indexing - meaing the array starts from 1th index
    Do it without using brute force approch
 */
public class RangeSumQueries {
    public static void main(String[] args) {
        int[] arr = {0,3,5,6,7,9,21,32};
        System.out.println(funs(arr,1,5));
    }
    // Brute force approch O(q*n)/O(n^2) if q=n
    private static int fun(int[] arr,int l,int r) {
        int sum=0;
        for(int i=l;i<=r;l++){
            sum+=arr[l];
        }
        return sum;
    }
    // This is optimised technique which uses prefix sum
    // Summation of all elemnts till the right subtract the sum of all till left-1
    //Time Complexity O(n)
    private static int funs(int[] arr,int l,int r){
        prefixSum(arr);
        int sum=arr[r]-arr[l-1];
        return sum;
    }
    private static int[] prefixSum(int[] arr) {
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
}
