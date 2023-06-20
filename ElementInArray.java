//Find whether Element X exist in an array
public class ElementInArray {
    public static void main(String[] args) {
        int[] arr={1,4,3,2,5,6,45,8,7};
        System.out.println(fun2(arr,45,0));
    }
    //This return true or false
    private static boolean fun(int[] arr,int x, int i) {
        if(i>=arr.length){
            return false;
        }
        if(arr[i]==x){ return true; }
        return fun(arr, x, i+1);
    }
    //This return the index at which the number is present if not then return -1
    private static int fun2(int[] arr,int x, int i) {
        if(i>=arr.length){
            return -1;
        }
        if(arr[i]==x){ return i; }
        return fun2(arr, x, i+1);
    }
}
