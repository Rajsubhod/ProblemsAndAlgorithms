// Return the triplets or the number of pairs whose sum result in 7 or given value

import java.util.ArrayList;
import java.util.Arrays;

public class TargetSumTriplet {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] arr = {2, 1, 5, 7, 8, 11, 3, 4};
        //System.out.println(Arrays.toString(new TargetSum().fun(arr)));
        int[][] result = new TargetSumTriplet().fun(arr);
        Arrays.stream(result).forEach(e->System.out.println(Arrays.toString(e)));
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

        return list.toArray(new int[0][]);
    }
}

