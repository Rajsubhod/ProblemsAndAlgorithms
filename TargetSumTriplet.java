// Return the triplets or the number of pairs whose sum result in 7 or given value

import java.util.ArrayList;
import java.util.Arrays;

public class TargetSumTriplet {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] arr = {2, 1, 5, 7, 8, 11, 3, 4, 0};
        //System.out.println(Arrays.toString(new TargetSum().fun(arr)));
        int[][] result = new TargetSumTriplet().fun(arr);
        //we are using stream to print this
        Arrays.stream(result).forEach(e->System.out.println(Arrays.toString(e)));
        //here we are using deeptoString()
        System.out.println(Arrays.deepToString(result));
        long endTime = System.nanoTime();
        System.out.println("Took "+(endTime - startTime) + " ns"); 
    }

    public int[][] fun(int[] arr) {
        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for(int k = j + 1; k < arr.length; k++){                
                    if (arr[i] + arr[j] + arr[k] == 7) {
                        list.add(new int[]{arr[i], arr[j] , arr[k]});
                    }
                }
            }
        }
        /*
         * Here we are returning a int[][] array back but how from list we got an object type array 
           if we use list.toArray() so to convert it to int type we type cast the object array in runtime
         * 
         * list.toArray()
        ==> Object[2] { int[3] { 1, 2, 3 }, int[3] { 3, 4, 6 } }
         * list.toArray(new int[1][])
        ==> int[2][] { int[3] { 1, 2, 3 }, int[3] { 3, 4, 6 } }  
         * if you typecast it before runtime i.e. (int[][]) list.toString() it will result in error
         */
        return list.toArray(new int[0][]);
    }
}

