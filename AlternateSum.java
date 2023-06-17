//Given a number n find sum of till n numbers with alternate sign
public class AlternateSum {
    public static void main(String[] args) {
        int n=7;
        System.out.println(fun(n));
    }
    //Time complexity O(n)
    private static int fun(int n) {
        if(n==0) return 0;
        return ((int)Math.pow(-1,n+1)*n)+fun(n-1);
        // we can also do this
        //return ((n%2==0)?-n:n)+fun(n-1);
    }
}