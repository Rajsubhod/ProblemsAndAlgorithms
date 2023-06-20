//Given an array find all indeces of the element X in the array

import java.util.ArrayList;

public class AllIndecesOfElementInArray {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {1,2,4,2,3,4,5,6,4,7,4};
        fun(arr,4,0);
        System.out.println(fun2(arr, 4, 0));
    }

    private static void fun(int[] arr, int x, int i) {
        if(i==arr.length) return;
        if(arr[i]==x){
            System.out.print(i+" ");
        }
        fun(arr,x,i+1);
    }
    public static ArrayList<Integer> fun2(int[] arr,int x,int i){
        if(i>=arr.length){
            return new ArrayList<>();
        }
        ArrayList<Integer> ans=new ArrayList<>();
        if(arr[i]==x){
            ans.add(i);
        }
        ArrayList<Integer> smallans = fun2(arr, x, i+1);
        ans.addAll(smallans);
        return ans;
    }
}
