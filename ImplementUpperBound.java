/*
 Given a sorted array of N integers and an integer x, write a program to find the upper bound of x.
    Example 1:
    Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
    Result: 2
    Explanation: Index 1 is the smallest index such that arr[1] >= x.

    Example 2:
    Input Format: N = 5, arr[] = {3,5,8,15,19}, x = 9
    Result: -1
    Explanation: Index 3 is the smallest index such that arr[3] >= x.
 */
public class ImplementUpperBound {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int x = 2;
        System.out.println(lowerBond(arr,x));
    }

    private static int lowerBond(int[] arr, int x) {
        int st = 0;
        int end = arr.length-1;
        int ans = -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            /*
                if(arr[mid]==x){
                    ans=mid;
                    st=mid+1;
                }
                else if(arr[mid]<x){
                    st=mid+1;
                }
                else{
                    end=mid-1;
                }
            */
            //Instead of using 3 if we can use 2 but then we need to check before returning if ans==target
            if(arr[mid]>x){
                ans=mid-1;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        if(ans<0 || arr[ans]!=x){
            return -1;
        }
        return ans;
    }
    
}
