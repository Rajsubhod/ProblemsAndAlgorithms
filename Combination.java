//Find the number of combinations possible with r numbers taken from n possible numbers -- nCr
//we can use factorial to do this or we can use pascal's triangle
public class Combination {
    public static void main(String[] args) {
        int n=5;
        int r=2;
        System.out.println(fun(n,r));
    }

    private static int fun(int n, int r) {
        if(n==r || r==0){
            return 1;
        }
        return fun(n-1,r-1)+fun(n-1,r);
    }
}
