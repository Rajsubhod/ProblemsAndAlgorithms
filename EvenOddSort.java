//Gaiven an array with even and odd integers sort it so the even comes front and odds goes back, relaive order does not mater

import java.util.Arrays;

public class EvenOddSort {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,6,7,9,21,32,45,55,66,100};
        int[] res = fun(arr);
        System.out.println(Arrays.toString(res));
    }
    public static boolean evenodd(int num) {
        if(num%2==0){
            return true;
        }
        return false;
    }
    private static int[] fun(int[] arr) {
        for(int i=0,j=arr.length-1;i<=j;){
            if(evenodd(arr[i])==false && evenodd(arr[j])==true){
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
                i++;
                j--;
            }
            if(evenodd(arr[i])==true){
                i++;
            }
            if(evenodd(arr[j])==false){
                j--;
            }
        }
        return arr;
    }
}
