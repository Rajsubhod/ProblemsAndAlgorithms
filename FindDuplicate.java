//Find Duplicate elements in an array and return the number of duplicates

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,5,6,7,8,8,8,9};
        DuplicateSorted.fun2(arr);
    }
}
class DuplicateSorted {

    public static void fun(int[] arr) {
        int lastDuplicate=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1] && arr[i]!=lastDuplicate){
                System.out.println(arr[i]);
                lastDuplicate=arr[i];
            }
        }
    }
    public static void fun2(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                int j=i+1;
                while(arr[j]==arr[i]) j++;
                System.out.println(arr[i]+" "+(j-i));
                i=j-1;
            }
        }
    }

}
class DuplicateUnSorted {
    public static void fun(int[] arr) {
        HashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(Integer num:arr){
            if(map.containsKey(num)==false){
                map.put(num,1);
            }
            else{
                map.put(num, map.get(num)+1);
            }
        }
        Iterator it =map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry ele=(Map.Entry)it.next();
            int value=(int)ele.getValue();
            if(value>1){
                System.out.print(ele.getKey()+" "+value);
                System.out.println();
            }
        }
    }
}
