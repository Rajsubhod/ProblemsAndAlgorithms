//Search a target X in a 2D matrix of n*m, return true if found or false. Properties of the matrix are as follows-
// 1. Integers in each row are sorted from left to right
// 2. The first integer in each row is greater than the last integer in previous row
public class SearchProblem6 {
    /*
     * For Any Value in A 2D array position of value (R,C) -> R*m+C ,
     * where m is the lenght of the array in that column (or)
     * (r, c) of a matrix is given by (i/m,i%m), 
     * i is the index position of the value if the whole matix was reflected on a 1D array
     * m is the length of the array in that column
     */

     //Time Complexity --- O(log[n*m])
    private static boolean fun(int[][] arr, int x) {
        int n = arr.length, m = arr[0].length; // n -> length of row | m -> length of column
        int start = 0;
        int end = n*m-1;
        while(start<=end){
            int mid=start+(end-start)/2; // positon of value if it was in 1D array
            int i = mid/m, j = mid%m; // True index of vale in 2D array (i,j)
            if(arr[i][j]==x){
                return true;
            }
            else if(arr[i][j]>x){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
    
    //Time Complexity --- O(n*logm)
    private static int fun1(int[][] arr, int x) {
        int i=0;
        int j=arr[i].length-1;
        int ans=-1;
        while(i<arr.length){ // Iterationg over m rows -> O(n)
            if(arr[i][0]<x && arr[i][j]>x){
                ans = BinarySearch.fun2(arr[i], j); // Binary search -> O(logm)
                break;
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = { {1, 3, 5, 7 },
                        {10,11,16,20},
                        {23,30,34,60} };
        int x = 3;
        System.out.println(fun(arr,x));
    }
}
