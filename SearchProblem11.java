/*
 * A new racing track for kids is being built in New York with 'n' starting spots.
 * The spots are located along a straight line at positions xl, x2... xn(xi For each 'i', xi+l > xi.
 * At a time only 'm' children are allowed to enter the race. Since the race track is for kids,
 * they may run into each other while running. To prevent this, we want to choose the starting spots
   such that the minimum distance between any two of them is as large as possible.
 * What is the largest minimum distance?
 * The first line of input will contain the value of n, the number of starting spots.
 * The second line of input will contain the n numbers denoting the location of each spot.
 * The third line will contain the value of m, number of children.
 * 
 * Input
   arr = 12489
    m = 3
 * Output
     3 
 */
public class SearchProblem11 {
    //Time Complexity --- O(nlogN)
    //Here N = 1e9 or 10^9 upper limit of the range + time taken by isPossible() which is O(n)
    private static int fun(int[] arr, int m) {
        if(m>arr.length) return -1;
        int start = 0;
        int end = (int) 1e9;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            //This method check is it possible to place m kids with a distance between each >=mid
            if(isPossible(arr, m, mid)){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
    //Time Complexity --- O(n)
    private static boolean isPossible(int[] arr, int m, int dist) {
        int kidPlaced = 1;
        int lastKid = arr[0];
        //places next kid at each position on array and check is distance between curretly placed
        //kid and the last kid is greater than or equal to the given dist
        for(int currentKid=1;currentKid<arr.length;currentKid++){
            if(arr[currentKid]-lastKid>=dist){
                kidPlaced++;
                lastKid=arr[currentKid];
            }
        }
        return kidPlaced>=m;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9};
        int m = 3;
        System.out.println(fun(arr,m));;   
    }
}
