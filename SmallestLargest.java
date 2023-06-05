// return an array that has samllest and largest values from a given array

import java.util.Arrays;

public class SmallestLargest {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,11,4};
        System.out.println(Arrays.toString(new SmallestLargest().fun(arr)));
    }   
    
    public int[] fun(int[] arr){
        Arrays.sort(arr);
        int[] res = {arr[0],arr[arr.length-1]};
        return res;
        
    }
}

