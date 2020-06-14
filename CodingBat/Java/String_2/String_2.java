public class String_2 {
    public String doubleChar(String str) {
        String result="";
        for(int i=0;i<str.length();i++){
            result=result+str.charAt(i);
            result=result+str.charAt(i);
        }
        return result;
    }
    

public static void main( String[] args) {
    String_2 obj = new String_2();
   System.out.println(obj.doubleChar("The"));
}

}