//Remove occerances of an character from a string
public class RemoveCharacterFromString{
    //Using recursion part2
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
        String str="SaaaW sas";
        System.out.println(funI(str));
        System.out.println(funR(str,0));
        System.out.println(funR2(str));
        System.out.println(funR2A(str));
    }

}