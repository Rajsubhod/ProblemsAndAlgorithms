//Given an array with first half with increasing and second half decresing elements
//Find the value or point at which the elements before the value are smaller
//And after the value larger( Like the top or peak element)
public class SearchProblem8 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,4,3,2,0};
        System.out.println(fun(arr));
    }
    //Time Complexity --- O(log(n)) , n -> arr.length 
    private static int fun(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<arr[mid+1]){
                ans = mid+1;
                low = mid+1; 
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}
