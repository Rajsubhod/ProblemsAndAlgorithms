//Given an array divide the array in two equal parts where the sum of the elements the same

import java.util.Arrays;

public class EqualSubArray {
        public static void main(String[] args) {
            int[] arr = {2,3,5,6,7,9};
            int[] arr2 = {5,3,2,6,3,1};
            //At this point the array can be partitioned if ans =-1 then array cant be patitioned
            System.out.println(pratition(arr2));
        }
    
        private static int fun(int[] arr) {
            prefixSum(arr);
            int b=-1;
            int n=arr[arr.length-1]/2;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==n){
                    b=i;
                }
            }
            return b;
        }

        private static int[] prefixSum(int[] arr) {
            for(int i=1;i<arr.length;i++){
                arr[i]=arr[i-1]+arr[i];
            }
            return arr;
        }
        
        // prefix sufix method
        public static boolean pratition(int[] arr){
            int[] ans=arr.clone();
            prefixSum(arr);
            int totalSum=arr[arr.length-1];
            int pref=0;
            for(int i=0;i<ans.length;i++){
                pref+=ans[i];
                int suf=totalSum-pref;
                if(pref==suf){
                    return true;
                }
            }
            return false;

        }
}
