//Find the square root of a given non negative value x. Round it off to the nearest floor integer
public class SearchProblem2 {
    public static void main(String[] args) {
        int x = 24;
        System.out.println(fun(x));
    }

    private static int fun(int x) {
        int low = 0;
        int high = x;
        int ans=-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int val = mid*mid;
            if(val==x){
                return mid;
            }
            else if(val>x){
                high = mid-1;
            }
            else{
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
