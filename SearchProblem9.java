//Find the peak value for which values before and after the element are samller
//Also if there exist arr[-1] & arr[n] for n length array btoh of them will be negative infinity
public class SearchProblem9 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,4,3,5,0};
        int[] arr2 = {1,2,3,4,5,6,7};
        System.out.println(fun(arr2));
    }
    //Time Complexity --- O(logn)
    private static int fun(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if((mid==0 || arr[mid-1]<arr[mid]) && (mid== arr.length-1 || arr[mid]>arr[mid+1])){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){ //Uphill
                low = mid+1; 
            }
            else{ // Downhill
                high = mid-1;
            }
        }
        return ans;
    }
}
