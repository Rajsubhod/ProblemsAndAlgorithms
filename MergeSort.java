//create and use merge sort
//merge sort is stable sort

import java.util.Arrays;

public class MergeSort {

    private static void mergesort(int[] arr, int l, int r) {
        if(l>=r){ return; }

        int mid = (l+r)/2;
        
        mergesort(arr, l, mid);
        mergesort(arr, mid+1, r);
        //Now Once the mergesort method sort the two halves of the array we need to merger them using merge funtion
        merge(arr,l,mid,r);

    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int left_arr_size = mid-l+1;
        int right_arr_size = r-mid;
        int[] left_arr = new int[left_arr_size];
        int[] right_arr = new int[right_arr_size];
        int i,j,k;
        for(i=0;i<left_arr_size;i++) left_arr[i]=arr[l+i];
        for(j=0;j<right_arr_size;j++) right_arr[j]=arr[mid+1+j];

        i=0;
        j=0;
        k=l;

        while(i<left_arr_size && j<right_arr_size){
            if(left_arr[i]<right_arr[j]){
                arr[k]=left_arr[i];
                k++;
                i++;
            }
            else{
                arr[k++]=right_arr[j++];
            }
        }
        while(i<left_arr_size){
            arr[k++]=left_arr[i++];
        }
        while(j<right_arr_size){
            arr[k++]=right_arr[j++];
        }


    }
     public static void main(String[] args) {
        int[] arr = {3,2,4,5,1};
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
