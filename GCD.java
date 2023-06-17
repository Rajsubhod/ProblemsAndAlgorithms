//Given two numbers x and y find the greatest common divisor of x and y
//constraints 0<= x,y <=1e6(10^6)
public class GCD {
    //Euclid's algorithm approach -> GCD(x,y)=GCD(y,x%y) & GCD(x,0)=x
    //Time complexity O(log(min(x,y))) ---- most optimized approach
    private static int gcd(int x, int y) {
        if(y==0){
            return x;
        }
        return gcd(y, x%y);
    }
    // Long division Iterative approach 
    //Time complexity O(min(x,y)) ---- a bit better still useless approach
    private static int fun2(int x, int y) {
        int divisor=Math.min(x, y);
        int dividend=Math.max(x,y);
        /* It's not necessary to intialize the divisor and dividend as we can simply write x%y
           which will work for x<y but even if x>y it would still work but now it will do 1 extra
           division in which the firat division it will swap the places of the two (x,y) 
         */
        while(dividend%divisor!=0){
           int remainder=dividend%divisor;
            dividend=divisor;
            divisor=remainder;
        }
        return divisor;
    }
    //Brute force approach 
    //Time complexity O(min(x,y)) ---- useless approach
    private static int fun(int x, int y) {
        for(int i=(int)Math.min(x,y);i>0;i--){
            if(x%i==0 && y%i==0){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int x=4;
        int y=9;
        int x2=6;
        int y2=18;
        System.out.println(fun(x,y));
        System.out.println(fun(x2,y2));
        System.out.println(fun2(x2,y2));
        System.out.println(gcd(x,y));
        System.out.println(gcd(x2,y2));
    }    
}
