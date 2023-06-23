//Subsequences related problems
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Subsequence {
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> list = ArrayListSubsequence.fun(str);
        System.out.println(list);
        PrintSubsequence.fun(str, "");
    }
}

//Given a string return a arraylist containing all subsequences of the string
class ArrayListSubsequence {
    //Time complexity --- O(2^n)
    public static ArrayList<String> fun(String str) {
        ArrayList<String> ans = new ArrayList<>();

        if(str.length()==0){
            ans.add("");
            return ans;
        }

        char c = str.charAt(0);
        ArrayList<String> smallans = fun(str.substring(1));

        for(String ss:smallans){
            ans.add(ss);
            ans.add(c+ss);
        }
        //this uses default comparator which compares via character order
        //Collections.sort(ans);
        //This does sorting via custom comparator that compares string length and then via character order
        Comparator<String> comparator = Comparator.comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder());
        Collections.sort(ans, comparator);
        return ans;
    }
}

//Given a string print all subsequences of the string
class PrintSubsequence {
    //Time complexity --- O(n)
    public static void fun(String str,String remString) {
        if(str.length()==0){
            System.out.print(remString+ " ");
            return;
        }
        char curr = str.charAt(0);
        String remeningString = str.substring(1);
        //Take the curr into account
        fun(remeningString,remString+curr);
        //Do not take curr into account
        fun(remeningString,remString);
    }
}

