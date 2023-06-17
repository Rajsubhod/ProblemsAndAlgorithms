//Find the sum of the digits using recursion
public class SumOfDigits {
    public static void main(String[] args) {
        int num=149;
        int num2=1342;
        System.out.println(fun(num));
        System.out.println(fun2(num2));
        System.out.println(fun2(num,0));
    }
    //Recurssive method
    private static int fun2(int num) {
        //This commented out code will also given the same result but will take additional thread call thus lower performance and is incorrect for negative numbers
        //if(num<=0){
        //    return 0;
        //}
        if(num>=0 && num<=9){
            return num;
        }
        return num%10+fun2(num/10);
    }
    private static int fun2(int num, int sum) {
    if (num <= 0) {
        return sum;
    }
    return fun2(num / 10, sum + num % 10);
}
    //Iterative method
    private static int fun(int num) {
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
