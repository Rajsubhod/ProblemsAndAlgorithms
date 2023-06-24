/*
   There are N stones from 0,1,2, to N-1. THe height (h)of each ith stones are given in an array. 
   A frog can jump from ith stone to i+1 th or i+2 th stone , the jump incured has a cost of |hi-hj|
   where j = i+1 or i+2 th stone. Find the minimum cost incured to traveled to N-1 th stone by the frog. 
 */
public class MinimumCostFrogJump {
    public static void main(String[] args) {
        int[] arr = {10,30,40,20};
        System.out.println(fun(arr,0,0));
    }

    private static int fun(int[] arr,int sum,int curr) {
        if(curr+2>arr.length-1){
            return 0;
        }
        //Find the distance from ith to i+1th stone
        int dis1=Math.abs(arr[curr]-arr[curr+1]);
        //Find the distance from ith to i+2th stone
        int dis2=Math.abs(arr[curr]-arr[curr+2]);
        sum = Math.min(dis1, dis2);
        int smallSum=0;
        if(dis1==dis2){
            smallSum=fun(arr,sum,2);
        }
        else if(dis1<dis2){
            smallSum=fun(arr,sum,1);
        }
        else{
            smallSum=fun(arr,sum,2);
        }
        return sum+smallSum;
    }
}
