import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteFromArray {
    public static void main(String[] args) {
        Integer[] arr={1,2,3};
        int [] arr1={1,2,3};
        System.out.println(Arrays.toString(arr)+" "+arr.getClass());
        System.out.println(Arrays.toString(arr1)+" "+arr1.getClass());
        System.out.println(Arrays.toString(fun(arr,3))+" "+arr.getClass());
        System.out.println(Arrays.toString(fun(arr1,1))+" "+arr1.getClass());
    }
    private static Integer[] fun(Integer[] arr, int num) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        //removing the value
        list.remove(Integer.valueOf(num));
        //removing by index
        //list.remove(num);
        return list.toArray(new Integer[0]);
    }
    private static int[] fun(int[] arr, int num){
        int i=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]==num){
                break;
            }
        }
        for(int j=i;j<arr.length-1;j++){
            arr[j]=arr[j+1];
        }
        return Arrays.copyOfRange(arr, 0, arr.length-1);
    }
}
