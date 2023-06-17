//Given two numbers x and y find the least common multiple of x and y
//constraints 0<= x,y <=1e6(10^6)
public class LCM {
    public static int lcm(int x, int y){
        //We know a formula LCM * GCD = X * Y
        //Thus LCM = (X * Y)/GCD
        int gcd=GCD.gcd(x,y);
        int num = (x*y)/gcd;
        return num;
    }
    public static void main(String[] args) {
        int x=4;
        int y=9;
        int x2=6;
        int y2=18;
        System.out.println(lcm(x,y));
        System.out.println(lcm(x2,y2));
    }   
}
