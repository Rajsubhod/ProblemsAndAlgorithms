//create and use bubble sort
//Bubble sort is stable sort
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,1};
        bubbleSortOptimized(arr);
        System.out.println(Arrays.toString(arr));

    }
    //Time complexity --- O(n^2) -> Best,Average,Worst
    private static int[] bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){//Ascending order| Descending order -> arr[j]<arr[j+1]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    //Time complexity --- O(n) -> Best | O(n^2) -> Average,Worst
    private static void bubbleSortOptimized(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            boolean flag = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){//Ascending order| Descending order -> arr[j]<arr[j+1]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag == false) {
                return;
            }
        }
    }
}
