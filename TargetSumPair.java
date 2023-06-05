import java.util.ArrayList;
import java.util.Arrays;

public class TargetSumPair {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] arr = {2, 5, 7, 8, 11, 3, 4};
        //System.out.println(Arrays.toString(new TargetSum().fun(arr)));
        int[][] result = new TargetSumPair().fun(arr);
        Arrays.stream(result).forEach(e->System.out.println(Arrays.toString(e)));
        long endTime = System.nanoTime();
        System.out.println("Took "+(endTime - startTime) + " ns"); 
        
    }

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
}
