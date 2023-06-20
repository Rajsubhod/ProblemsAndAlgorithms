// Find an array that has samllest and largest values from a given array

import java.util.Arrays;

public class SmallestLargest {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,11,4};
        System.out.println(Arrays.toString(new SmallestLargest().fun(arr)));
        System.out.println(funR(arr,0));
        System.out.println(funI(arr));
    }   
    //Using sorting
    public int[] fun(int[] arr){
        Arrays.sort(arr);
        int[] res = {arr[0],arr[arr.length-1]};
        return res;
        
    }
    //using iteration
    public static int funI(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    //Using recursion
    public static int funR(int[] arr,int i){
        if(i==arr.length-1){
            return arr[i];
        }
        int max=funR(arr,i+1);
        return Math.max(max,arr[i]);
    }
}

