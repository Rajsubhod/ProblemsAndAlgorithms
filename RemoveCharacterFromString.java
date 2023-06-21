//Remove occerances of an character from a string
public class RemoveCharacterFromString{
    //Using recursion part2
    //Time complexity --- O(n^2)
    private static String funR2(String str) {
        if(str==""){
            return "";
        }
        String ans=funR2(str.substring(0, str.length()-1));
        if(str.charAt(str.length()-1)!='a'){
            return ans+str.charAt(str.length()-1);
        }
        return ans;
        
    }
    //Time complexity --- O(n^2)
    private static String funR2A(String str) {
        if(str.length()==0){
            return "";
        }
        String ans=funR2(str.substring(1));
        if(str.charAt(0)!='a'){
            return str.charAt(0)+ans;
        }
        else{
            return ans;
        }
        
    }
    //Using recursion
    //Time complexity --- O(n^2)
    private static String funR(String str,int i) {
        if(i==str.length()){
            return "";
        }
        String ans=funR(str, i+1);
        if(str.charAt(i)!='a'){
            return str.charAt(i)+ans;
        }
        else{
            return ans;
        }
    }
    //Optimized version
    //Time complexity --- O(n)
    private static String funRO(String str, int i, String result) {
    if (i == str.length()) {
        return result;
    }
    if (str.charAt(i) != 'a') {
        result += str.charAt(i);
    }
    return funRO(str, i + 1, result);
    }
    public static String funRO(String str) {
    return funRO(str, 0, "");
    }

    //Using iteration
    //Time complexity --- O(n)
    private static String funI(String str) {
        String ans="";
        for(int c=0;c<str.length();c++){
            if(str.charAt(c)!='a'){
                ans+=str.charAt(c);
            }
        }
        return ans;
    }
    //Most of the recursive methods are taking time complexity O(n^2) due to the fact string concatenation
    //is not O(1) but O(n) as it needs to go over the string length every time to add the character in place
    //thus O(n)*O(n)-->O(n^2)
    //THIS COULD BE SOLVED BY USING OPTIMIZED METHOD OR JUST USE STRING BUILDER CLASS
      public static void main(String[] args) {
        String str="SaaaW sas";
        System.out.println(funI(str));
        System.out.println(funR(str,0));
        System.out.println(funRO(str));
        System.out.println(funR2(str));
        System.out.println(funR2A(str));
    }

}