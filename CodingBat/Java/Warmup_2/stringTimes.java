public class stringTimes{
    
    public static String stringTimes(String str, int n){
        // Given a string and a non-negative int n, return a larger string that is n copies of the original string.
        String str2="";
        for (int i=0;i<n;i++){
            str2+=str;
        }
        return str2;
    }

    public static void main(String[] args) {
        
    }
}