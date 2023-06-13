// Rotate Array by K steps where K may be greater than lenth of array

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,5,8,9,4};
        int k =3;
        // Instead of k%arr.lenght we could just used k but then for higher value of k time complexity will sky rocket thus we will use remainder of k and array length which will return the minimum number of iteration required to achive the same result.
        System.out.println(Arrays.toString(new RotateArray().funL(Arrays.copyOf(arr, arr.length),k%arr.length)));
        System.out.println(Arrays.toString(new RotateArray().funR(Arrays.copyOf(arr, arr.length),k%arr.length)));
    }
    //Rotation anticlockwise or left rotation
    public int[] funL(int[] arr,int k) {
        if(k>0){
            int num =arr[arr.length-1];
            for(int l = arr.length-1;l>0;l--){
                arr[l]=arr[l-1];
            }
            arr[0]=num;
            funL(arr,--k);
        }
        return arr;
    }
    //Rotation clockwise or right rotation
    private int[] funR(int[] arr,int k) {
        if(k>0){
            int num =arr[0];
            for(int l = 0;l<arr.length-1;l++){
                arr[l]=arr[l+1];
            }
            arr[arr.length-1]=num;
            funR(arr,--k);
        }
        return arr;
    }
}
