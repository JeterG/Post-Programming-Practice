public class stringBits{
    
    public static String stringBits(String str){
        // Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
        if(str.length()<=1){
            return str;
        }
        else{
            boolean go=true;
            int start=2;
            String str2="";
            str2+=str.charAt(0);
            while(go==true){
                if(start>=str.length()){
                    go=false;
                }
                else{
                    str2+=str.charAt(start);
                    start+=2;
                }
            }
            return str2;
        }
    }
    
    public static void main(String[] args) {
        
    }
}