//Find the p^q 
public class PowerFunction {
    public static void main(String[] args) {
        int p=2;
        int q=6;
        System.out.println(fun(p,q));
        System.out.println(fun2(p,q));
    }
    //Time complexity O(q) ---- not efficient
    private static int fun(int p, int q) {
        if(q<=0) return 1;
        return p*fun(p, --q);
    }
    //Time complexity O(log q) ---- more better
    private static int fun2(int p, int q) {
        int res=0;
        if(q<=0) return 1;
        //-----This is all okay but inefficient as we are doing extra method calls for fun2(p,q/2) thus the Time complexity O(2^log q) or O(q)
        // if(q%2==0){
        //     res=fun2(p,q/2)*fun2(p, q/2);
        // }
        // else{
        //     res=p*fun2(p,q/2)*fun2(p, q/2);
        // }
        int smallpower=fun2(p, q/2);
        if(q%2==0){
            res=smallpower*smallpower;
        }
        else{
            res=p*smallpower*smallpower;
        }
        return res;
    }
    
}
