// Return the unique element form the array which didn't appear twice

public class UniqueElement {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] arr = {2, 1, 5, 7, 5, 2, 1, 4, 4};
        System.out.println(new UniqueElement().fun(arr));
        long endTime = System.nanoTime();
        System.out.println("Took "+(endTime - startTime) + " ns"); 
    }

    public int fun(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int result:arr){
            if(result!=-1){
                ans=result;
            }
        }
        return ans;
    }
}
