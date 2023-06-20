//Remove occerances of an character from a string
public class RemoveCharacterFromString{
    public static void main(String[] args) {
        String str="Saaasas";
        System.out.println(fun(str));
    }

    private static String fun(String str) {
        String ans="";
        for(int c=0;c<str.length();c++){
            if(str.charAt(c)!='a'){
                ans+=str.charAt(c);
            }
        }
        return ans;
    }
}