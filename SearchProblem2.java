//Find the square root of a given non negative value x. Round it off to the nearest floor integer
public class SearchProblem2 {
    public static void main(String[] args) {
        int x = 24;
        int y= 2147395599;
        System.out.println(fun(x));
        System.out.println(funL(y));
    }
    //Time Complexity --- O(logn)
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
    // A revised method that handles large int value like 2147395599
    public static int funL(int x){
        int low = 0, high = x;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            long val = (long) mid*mid;
            if(val==x){
                return mid;
            }
            else if(val>x) {
                high = mid-1;
            }
            else {
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
