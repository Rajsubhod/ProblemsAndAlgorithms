//create and use merge sort
//merge sort is not stable sort
//merge sort is inplace 
import java.util.Arrays;

public class QuickSort {
    //Time Complexity --- O(nlogn) -> Best, Average Case | O(n^2) -> Worst Case
    private static void quicksort(int[] arr, int start, int end) {
        if(start>=end){
            return;
        }
        int pat_idx = partition(arr, start, end);
        quicksort(arr, start, pat_idx-1);
        quicksort(arr, pat_idx+1, end);
    }
    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int count = 0;
        //Finding the pivot index where all left of pivot is smaller and right bigger
        for(int i=start+1;i<arr.length;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivot_idx = start+count;
        swap(arr,start,pivot_idx);
        int i=start,j=end;
        //sorting out the left and right elements of the pivot
        while(i<pivot_idx && j>pivot_idx){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if(i<pivot_idx && j>pivot_idx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivot_idx;
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,1};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
