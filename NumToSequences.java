/*
  Given a string of number ex : 423 , ranging from 2 - 9 each digit is associated with a number of characters similar to a bar phone keypad.
  Make all possible combinations of characters and return an array or arraylist of them.
*/

import java.util.ArrayList;

public class NumToSequences {
    public static void main(String[] args) {
        String str = "23";
        final String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; 
        fun2(str,"",kp);
        System.out.println(fun(str,"",kp));
    }
    //Time complexity --- O(n*m^n) ~ O(m^n) , where m is length of Stirng str or number or digits
    private static void fun2(String str,String curr,String[] aStrings) {
        if(str.length()==0){
            System.out.print(curr+ " ");
            return;
        }
        int digit = str.charAt(0)-'0';
        String currString = aStrings[digit];
        for(int i=0;i<currString.length();i++){
            fun2(str.substring(1), curr+currString.charAt(i), aStrings);
        }
    }
    //Time complexity --- O(m^n)
    private static ArrayList<String> fun(String str,String curr,String[] aStrings) {
        ArrayList<String> ans = new ArrayList<>();
        if(str.length()==0){
            ans.add(curr);
            return ans;
        }
        int digit = str.charAt(0)-'0';
        String currString = aStrings[digit];
        for(int i=0;i<currString.length();i++){
            ArrayList<String> smallAns = fun(str.substring(1), curr+currString.charAt(i), aStrings);
            ans.addAll(smallAns);
        }
        return ans;
    }
}
