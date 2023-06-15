public class Recursion1 {
    public static void main(String[] args) {
        int num=7;
        fun(num);
        System.out.println();
        fun2(num);
    }

    public static void fun(int num) {
        if(num<=1){
            System.out.print(1+" ");
            return ;
        }
        fun(num-1);
        System.out.print(num+" ");
    }
    public static void fun2(int num) {
        if(num<=1){
            System.out.print(num);
            return;
        }
        System.out.print(num+" ");
        fun2(--num);
    }
}
