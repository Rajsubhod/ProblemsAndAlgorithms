//Find factorial of a number

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            System.out.println(fun(num));
        }
        
    }

    private static int fun(int num) {
        if(num<=1) return 1;
        return num*fun(--num);
    }
}
