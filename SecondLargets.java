// return an array that has second largest values from a given array

import java.util.Arrays;

public class SecondLargets {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,11,11,4};
        System.out.println(new SecondLargets().fun(arr));
    }   

    //can only be used if there is no duplicate values
    public int fun1(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
        
    }
    //With duplicate values
    public int fun2(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;    
    }
    public int fun(int[] arr){
        int max = fun2(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        max = fun2(arr);
        return max;
    }
}
