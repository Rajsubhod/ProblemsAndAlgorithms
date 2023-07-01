//An array of size N containing only 0s 1s and 2s sort the array in ascending order

import java.util.Arrays;

public class SortProblem5 {
    //Time Complexity --- O(n)
    //Space Complexity --- O(k) -> k is extra space ~ O(n)
    static void sort(int[] arr){
        int[] count = new int[Arrays.stream(arr).max().getAsInt()+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int[] prefixSum = new int[count.length];
        prefixSum[0]=count[0];
        for(int i=1;i<prefixSum.length;i++){
            prefixSum[i]=prefixSum[i-1]+count[i];
        }
        for(int i=0;i<prefixSum.length;i++){
            if(i==0) 
                Arrays.fill(arr,0,prefixSum[i],i);
            else
                Arrays.fill(arr,prefixSum[i-1],prefixSum[i],i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,2,1,1,2,1,0,0,1};
        System.out.println(" Input Array : "+Arrays.toString(arr));
        sort(arr);
        System.out.println("Output Array : "+Arrays.toString(arr));
    }
}
