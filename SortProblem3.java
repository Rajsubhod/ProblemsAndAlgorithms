//Given a increasing array take any two numbers of it and swap then take that input array and sort it in linear time i.e. O(n)

import java.util.Arrays;
import java.util.Random;

public class SortProblem3 {

    public static void sort(int[] arr){
        int i = 0, j = arr.length-1;
        int x=-1,y=-1;
        boolean f1 = false , f2 = false;
        while(i<=j){
            if(arr[i]>arr[i+1] && f1 == false){
                x = i;
                f1 = true;
            }
            if(arr[j]<arr[j-1] && f2 == false){
                y = j;
                f2 = true;
            }
            if(f1 == true && f2 == true){
                swap(arr, x, y);
                return;

            }
            if(f1 == false) i++;
            if(f2 == false) j--;
        }
    }

    static void swap (int[] arr ,int i ,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9};
        int i = new Random().nextInt(7), j = new Random().nextInt(7);
        swap(arr, i, j);
        System.out.println(" Input Array : "+Arrays.toString(arr));
        sort(arr);
        System.out.println("Output Array : "+Arrays.toString(arr));

    }
}