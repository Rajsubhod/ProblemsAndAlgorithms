//Given two numbers x and y find the greatest common divisor of x and y
//constraints 0<= x,y <=1e6(10^6)
public class GCD {
    //  force approach 
    //TIme complexity O(min(x,y)) ---- useless approach
    private static int fun2(int x, int y) {
        int divisor=Math.min(x, y);
        int dividend=Math.max(x,y);
        int remainder=-1;
        while(dividend%divisor!=0){
            remainder=dividend%divisor;
            dividend=divisor;
            divisor=remainder;
        }
        return divisor;
    }
    //Brute force approach 
    //TIme complexity O(min(x,y)) ---- useless approach
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
        System.out.println(fun2(x2,y2));
        System.out.println(fun(x2,y2));
    }    
}
