//Return the First element that is repeated

import java.util.LinkedHashMap;

public class FirstRepeat {
    public static void main(String[] args) {    
        int[] arr = {2,5,4,7,2,7,8,11,11,4};
        //int[] arr = {2,5,7,8,11,4};
        System.out.println(new FirstRepeat().fun(arr));
    }
    
    public int fun(int[] arr){

        LinkedHashMap<Integer,Integer> table = new LinkedHashMap<>();
        for (Integer i = 0; i < arr.length; i++) {
            if(table.containsKey(arr[i])){
                table.put(arr[i],table.get(arr[i])+1);
            }
            else{
                table.put(arr[i],0);
            }    
        }
        for (Integer i = 0; i < arr.length; i++) {
            if(table.get(arr[i])>0){
                return arr[i];
            } 
        }
        return -1;
    }
}