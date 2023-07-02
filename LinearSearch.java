public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] arr2={8,1,4,2,5,3,6,9,7};
        System.out.println(fun(arr, 0, 8));
        System.out.println(funL(arr2,8));
    }

    private static int fun(int[] arr, int i, int j) {
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == j){
            return i;
        }
        int ans = fun(arr, i+1, j);
        return ans;

    }
    private static int funL(int[] arr, int j) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==j){
                return i;
            }
        }
        return -1;
    }
}
