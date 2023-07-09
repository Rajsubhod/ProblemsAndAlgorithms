//Find the first & last occurrence of a given element x, given that the array is sorted,If no occurance found return -1
public class SearchProblem1 {
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,4,4,5,5,5,5,5,7,7,8,8,9,9,9};
        int x = 5;
        System.out.println(funF(arr, x));
        System.out.println(funL(arr, x));
    }
    //First Occurance
    //Time Complexity --- O(logn)
    private static int funF(int[] arr, int i) {
        int l=0;
        int h=arr.length-1;
        int occurance = -1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==i){
                occurance = mid;
                h = mid-1;
            }
            else if(arr[mid]>i){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return occurance;
    }
    //Last Occurance
    //Time Complexity --- O(logn)
    private static int funL(int[] arr, int i) {
        int l=0;
        int h=arr.length-1;
        int occurance = -1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==i){
                occurance = mid;
                l = mid+1;
            }
            else if(arr[mid]>i){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return occurance;
    }
}
