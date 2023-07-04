//Search a target X in a 2D matrix of n*m, return true if found or false. Properties of the matrix are as follows-
// 1. Integers in each row are sorted from left to right
// 2. Integers in each column are sorted from top to buttom
public class SearchProblem7 {
    /*
     * As its given that it is sorted from both roe and column wise we could
     * start from last element of first row and move left or down given if the target
     * if smaller than or larger than the current element respectively.
     * As its sorted all elements left of a given element must be smaller & 
     * all elements down the given element must be greater than the current element
     */

    //Time Complexity --- O(n+m)
    private static boolean fun(int[][] arr, int x) {
        int n = arr.length, m = arr[0].length; // n -> length of row | m -> length of column
        int i = 0, j = m-1;
        while(i<n && j>=0){
            if(arr[i][j]==x){
                return true;
            }
            else if(arr[i][j]<x){ // target is downwards from current element
                ++i;
            }
            else{ // target is leftwards from current element
                --j;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[][] arr = { {1, 4, 7, 11,15},
                        {2, 5,  8,12,19},
                        {3, 6,  9,16,22},
                        {10,13,14,17,24},
                        {18,21,23,26,30} };
        int x = 17;
        System.out.println(fun(arr,x));
    }
}
