public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] arr2={8,1,4,2,5,3,6,9,7};
        System.out.println(fun(arr,0, arr.length, 8));
        System.out.println(fun2(arr2,8));
    }
    // Binary Search using recursion
    //Time Complexity --- O(logn)
    private static int fun(int[] arr, int l,int h,int i) {
        if(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==i){
                return mid;
            }
            else if(arr[mid]>i){
                return fun(arr,l,mid-1,i);
            }
            else{
                return fun(arr,mid+1,h,i);
            }
        }
        return -1;
    }
    // Binary Search using Loops iterative
    //Time Complexity --- O(logn)
    private static int fun2(int[] arr, int i){
        int l=0;
        int h=arr.length;
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
}
