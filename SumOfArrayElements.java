//Sum of all array elements
public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr={1,3,2,4,6,7,8};
        System.out.println(funR(arr,0));
    }
    //Using recursion
    private static int funR(int[] arr, int i) {
        if(i==arr.length-1){
            return arr[i];
        }
        return arr[i]+funR(arr, i+1);
    }
}
