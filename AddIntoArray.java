import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddIntoArray {
    public static void main(String[] args) {
        Integer[] arr={1,2,3};
        int [] arr1={1,2,3};
        System.out.println(Arrays.toString(arr)+" "+arr.getClass());
        System.out.println(Arrays.toString(arr1)+" "+arr1.getClass());
        System.out.println(Arrays.toString(fun(arr))+" "+arr.getClass());
        System.out.println(Arrays.toString(fun(arr1,111,1))+" "+arr1.getClass());
    }

    private static Integer[] fun(Integer[] arr) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(1, 4);
        return list.toArray(new Integer[0]);
    }
    private static int[] fun(int[] arr, int num, int j){
        arr=Arrays.copyOf(arr, arr.length+1);
        if(j<arr.length-1){
            for(int i=arr.length-1;i>j;i--){
                arr[i]=arr[i-1];
            }
            arr[j]=num;
            return arr;
        }
        arr[arr.length-1]=num;
        return arr;
    }
     
}
