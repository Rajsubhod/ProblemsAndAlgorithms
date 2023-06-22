//Check if the given string is palindrome or not
public class StringPalindrome {
    public static void main(String[] args) {
        String str="aba";
        System.out.println(isPalindrome(str));
    }

    private static String isPalindrome(String str){
        String revString = funR(str);
        if(str.equals(revString)){
            return "IS PALINDROME";
        }
        return "Not Palindrome";
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
