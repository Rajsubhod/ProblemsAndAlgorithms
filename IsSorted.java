//check if a given array is sorted or not

public class IsSorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] arr2={1,2,3,5,6,7,4,8,9};
        int[] arr3={2,1,3,5,6,7,8,9};
        int[] arr4={1,2,3,5,6,7,8,9,4};
        System.out.println(fun2(arr));
        System.out.println(fun2(arr2));
        System.out.println(fun2(arr3));
        System.out.println(fun2(arr4));
    }
    //Linear approach
    public static boolean fun(int[] arr) {
        int i=0;
        while(i<arr.length-1 && arr[i]<arr[i+1]){
            i++;
        }
        if(i==arr.length-1){
            return true;
        }
        return false;
    }
    //Two Pointer approach
    public static boolean fun2(int[] arr){
        int i=0;
        int j=arr.length-1;
        boolean condition=true;
        while(j>i){
            if(arr[i]>arr[i+1] || arr[j]<arr[j-1]){
                condition=false;
                break;
            }
            i++;
            j--;
        }
        return condition;
    }
}
