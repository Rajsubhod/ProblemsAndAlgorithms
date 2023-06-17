//Given a number n and k print first k multiple of n given k>0
public class PrintMultiples {
    public static void main(String[] args) {
        int num=7;
        int k=9;
        fun(num,k);
    }
    //Time complexity O(k)
    private static void fun(int num, int k) {
        if(k==0){
            return;
        }
        fun(num,k-1);
        System.out.println(num+"*"+k+":"+num*k+" ");
    }
}
