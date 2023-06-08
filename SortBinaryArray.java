//Given a array consisting of 0's and 1's sort it inascending order using two pointer

import java.util.Arrays;

public class SortBinaryArray {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,0,1,0,1,0,0,1};
        int[] res = Test.fun(arr);
        System.out.println(Arrays.toString(res));
    }
}
class Test{
    public static int[] fun(int[] arr) {
        int i=0,j=arr.length-1;
        while(j>=i){
            if(arr[i]==1 && arr[j]==0){
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
                i++;
                j--;
            }
            if(arr[j]==1){
                j--;
            }
            if(arr[i]==0){
                i++;
            }
        }
        return arr;
    }
}
