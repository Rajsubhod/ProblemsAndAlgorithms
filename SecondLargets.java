// return an array that has samllest and largest values from a given array

import java.util.Arrays;

public class SecondLargets {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,11,11,4};
        System.out.println(new SecondLargets().fun(arr));
    }   

    //can only be used if there is no duplicate values
    public int fun(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
        
    }
}
