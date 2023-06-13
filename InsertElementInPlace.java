//Given a sorted array add an element in this array in it's sorted position

import java.util.Arrays;

public class InsertElementInPlace {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,7,9,11,14,20,35,50};
        System.out.println(Arrays.toString(fun(arr,77)));
        System.out.println(Arrays.toString(fun(arr,34)));
        System.out.println(Arrays.toString(fun(arr,0)));

    }

    private static int[] fun(int[] arr, int i) {
        arr = Arrays.copyOf(arr, arr.length+1);
        arr[arr.length-1]=Integer.MAX_VALUE;
        for(int j=arr.length-1;j>=0 && i!=0;j--){
            if(arr[j]<i){
                arr[j+1]=i;
                break;
            }
            arr[j]=arr[j-1];
        }
        if(i==0){
            arr[arr.length-1]=0;
            RotateArray ob = new RotateArray();
            ob.funL(arr, 1);
        }
        return arr;
    }
}
