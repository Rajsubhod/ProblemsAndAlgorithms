//Given an array of fruits sort it in lexicographically order using selection sort

import java.util.Arrays;

public class SortProblem2 {
    public static void main(String[] args) {
        String[] arr = {"Mango","Apple","Banana","Watemelon","Grapes"};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Time complexity --- O(n^2)
    private static void sort(String[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++){
                //This has a problem what if both fruits start with same alphabet e.x: Banana & Blue Berry
                /*
                    if(arr[j].charAt(0)<arr[min_idx].charAt(0)){
                        min_idx=j;
                    }
                */
                if(arr[j].compareToIgnoreCase(arr[min_idx]) < 0){
                    min_idx = j;
                }
            }
            String temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
    }
}
