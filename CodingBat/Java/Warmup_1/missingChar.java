public class missingChar{
    // Given a non-empty string and an int n, return a new string where the char at index n hs been removed. The value of n will be a valid index of a char in the original string
    public String missingChar(String str, int n){
        String x="";
        for (int i=0;i<str.length();i++){
            if(i!=n){
                char charAt = str.charAt(i);
                x+=charAt;
            }
          
        }
        return x;
    }
    public static void main(String[] args) {
        
    }
}