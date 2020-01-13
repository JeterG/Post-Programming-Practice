public class stringSplosion{
    
    public static String stringSplosion(String str){
        // Given a non-empty string like "Code" return a string like "CCoCodCode".
        if(str.length()<=1){
            return str;
        }
        else{
            String str2="";
            for(int i=0;i<str.length();i++){
                str2+=str.substring(0,i);
            }
            return str2+str;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
    }
}