//Over a range of intergers print Fizz if integer is divisible by 3 buzz if integer is divisible by 5 and fizzbuzz if it is divisible by both
public class FizzBuzz {
    public static void main(String[] args) {
        fun();
    }
    private static void fun() {
        for(int i=1;i<=50;i++){
            String str="";
            if(i%3==0){
                str+="Fizz";
            }
            if(i%5==0){
                str+="Buzz";
            }
            System.out.println(i+" : "+str);
        }
    }
}
