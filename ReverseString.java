//Given a string reverse the string
public class ReverseString {
    public static void main(String[] args) {
        String str="Rajdeep Mukherjee";
        System.out.println(funR(str));
    }
    //Using recursion
    //Time complexity --- O(n^2)
    private static String funR(String str) {
        if(str==""){
            return "";
        }
        char ans=str.charAt(0);
        
        return funR(str.substring(1))+ans;
    }
}
