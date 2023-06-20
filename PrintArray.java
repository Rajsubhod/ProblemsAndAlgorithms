//Print the elements in an array
public class PrintArray {
    public static void main(String[] args) {
        int[] arr={1,4,5,6,8,3};
        funI(arr);
        System.out.println();
        funR(arr);
    }
    //Using recursion
    private static void funR(int[] arr) {
        rec(arr,0);
    }
    //Recursive helper function
    private static void rec(int[] arr, int i) {
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        rec(arr,i+1);
    }
    //Using iteration
    private static void funI(int[] arr) {
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
