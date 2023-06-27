//create and use selection sort
//Selection sort is not stable sort
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,1};
        selectionSortV(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(selectionSort(arr)));

    }
    //Time complexity --- O(n^2) -> Best,Average,Worst
    //Space complexity --- O(n)
    private static int[] selectionSort(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int min=arr[0];
            int idx=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    idx=j;
                }
            }
            // int temp=arr[i];
            // arr[i]=min;
            // arr[idx]=temp;
            ans[i]=min;
            arr[idx]=Integer.MAX_VALUE;
        }
        return ans;
    }
    //Time complexity --- O(n^2) -> Best,Average,Worst
    //Space complexity --- O(1)
    private static void selectionSortV(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
    }
}
