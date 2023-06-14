//Find the Missing Elemente in the sorted Array

import java.util.ArrayList;
import java.util.List;

class FindSorted{
    // Method - Finding the sum of n elements and sum of first n natural numbers
    // Only applicable if the array contains elements of First n natural numbers i.e. {1,2,3...n}
    public int fun(int[] arr) {
        int Asum=0;
        for(int num:arr){
            Asum+=num;
        }
        int S=(arr[arr.length-1]*(arr[arr.length-1]+1))/2;
        if(Asum!=S){
            return S-Asum; 
        }
        return -1;
    }
    //Method - Finding the differnce between the array element at ith position and i and comparing it with the first element
    // This is applicable even if the array doest not contain the first n natural numbers i.e. {5,6,7....k}
    public int fun2(int[] arr) {
        int Diff=arr[0];
        int num=0;
        for(int i=1;i<arr.length;i++){
            int diff=arr[i]-i;
            if(diff!=Diff){
                num=Diff+i;
                break;
            }
        }
        return num;
    }
    //The First two method were only capable of finding single element but this can find multiple
    public List<Integer> fun3(int[] arr) {
        int Diff=arr[0];
        int num=0;
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            int diff=arr[i]-i;
            while(diff>Diff){
                num=Diff+i;
                list.add(num);
                Diff++;
            }
        }
        return list;
    }
    
    
}
class FindUnSorted{

}
public class MissingElement { 
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8,9};
        int[] arr2={6,7,8,9,10,12,13,14};
        int[] arr3={6,7,8,10,11,14,15,16,17,19};
        System.out.println(new FindSorted().fun(arr));
        System.out.println(new FindSorted().fun2(arr2));
        System.out.println(new FindSorted().fun3(arr3));

    }
}