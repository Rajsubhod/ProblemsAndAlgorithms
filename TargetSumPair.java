// Return the pairs or the number of pairs whose sum result in 7 or given value

import java.util.ArrayList;
import java.util.Arrays;

public class TargetSumPair {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] arr = {2, 5, 7, 8, 11, 3, 4};
        int[] arr2={1,2,3,5,6,7,9,11,14};
        //System.out.println(Arrays.toString(new TargetSum().fun(arr)));
        System.out.println(Arrays.deepToString(fun2(arr)));
        System.out.println(Arrays.deepToString(fun3(arr2)));
        long endTime = System.nanoTime();
        System.out.println("Took "+(endTime - startTime) + " ns");
        startTime = System.nanoTime(); 
        int[][] result = new TargetSumPair().fun(arr);
        Arrays.stream(result).forEach(e->System.out.println(Arrays.toString(e)));
        endTime = System.nanoTime();
        System.out.println("Took "+(endTime - startTime) + " ns"); 
        
    }
    //Time complexity O(n^2)
    public int[][] fun(int[] arr) {
        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 7) {
                    list.add(new int[]{arr[i], arr[j]});
                }
            }
        }

        return list.toArray(new int[0][]);
    }
    //Time complexity O(n)
    public static int[][] fun2(int[] arr){
        int[] hash=new int[Arrays.stream(arr).max().getAsInt()+1];
        ArrayList<int[]> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=7 && hash[7-arr[i]]!=0){
               list.add(new int[]{arr[i], 7-arr[i]});
            }
            hash[arr[i]]++;
        }
        return list.toArray(new int[0][]);
    }
    //Forted sorted array can use two pointer
    //Time complexity <= O(n)
    public static int[][] fun3(int[] arr){
        ArrayList<int[]> list = new ArrayList<>();
        int i=0,j=arr.length-1;
        while(j!=i){
            if(arr[i]+arr[j]==7){
                list.add(new int[]{arr[i],arr[j]});
                i++;
                j--;
            }
            else if(arr[i]+arr[j]>7){
                j--;
            }
            else{
                i++;
            }

        }
        return list.toArray(new int[0][]);
    }
}
