//create and use selection sort
//Insertion sort is not stable sort
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,1};
        insertionSortV(arr);
        System.out.println(Arrays.toString(arr));

    }
    //Time complexity --- O(n) -> Best Case | O(n^2) -> Average,Worst Case
    private static void insertionSortV(int[] arr) {
        //considering arr[0] -> sorted i.e. 1st element of the array is sorted we are sorting the rest
        for(int i=1;i<arr.length;i++){
            //inner loop checks for the element in the unsorted part with the sorted part and swaps
            //This Uses FOR LOOP 
            /*
                for(int j=i;j>0;j--){
                    if(arr[j]<arr[j-1]){
                        int temp=arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=temp;
                    }
                }
            */
            //This Uses WHILE LOOP
                int j=i;
                while(j>0 && arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    j--;
                }
        }
    }
}
