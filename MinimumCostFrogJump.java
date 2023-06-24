/*
   There are N stones from 0,1,2, to N-1. THe height (h)of each ith stones are given in an array. 
   A frog can jump from ith stone to i+1 th or i+2 th stone , the jump incured has a cost of |hi-hj|
   where j = i+1 or i+2 th stone. Find the minimum cost incured to traveled to N-1 th stone by the frog. 
 */
public class MinimumCostFrogJump {
    public static void main(String[] args) {
        int[] arr = {10,30,40,20};
        System.out.println(fun(arr,0));
    }
    //Time compexity --- O(2^n)
    private static int fun(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return 0;
        }
        //Find the distance from ith to i+1th stone
        int dis1 = Math.abs(arr[idx]-arr[idx+1])+fun(arr,idx+1);
        //If the idx is second last stone of the array there is no i+2th stone thus return dist1
        if(idx == arr.length-2){
            return dis1;
        }
        //Find the distance from ith to i+2th stone
        int dis2 = Math.abs(arr[idx]-arr[idx+2])+fun(arr,idx+2);
        
        //return minimum of distance 1 and 2 
        return Math.min(dis1, dis2);
    }
}
