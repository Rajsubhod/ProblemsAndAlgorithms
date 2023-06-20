//Remove occerances of an character from a string
public class RemoveCharacterFromString{
    //Using recursion
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
    //Using iteration
    private static String funI(String str) {
        String ans="";
        for(int c=0;c<str.length();c++){
            if(str.charAt(c)!='a'){
                ans+=str.charAt(c);
            }
        }
        return ans;
    }
      public static void main(String[] args) {
        String str="Saaasas";
        System.out.println(funR(str,0));
    }

}