//Given a string return a arraylist containing all subsequences of the string

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrintSubsequence {
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> list = fun(str);
        System.out.println(list);
    }

    private static ArrayList<String> fun(String str) {
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
        //Collections.sort(ans);
        Comparator<String> comparator = Comparator.comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder());
        Collections.sort(ans, comparator);
        return ans;
    }
}
