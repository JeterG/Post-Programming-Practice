public class frontTimes{
    
    public static String frontTimes(String str, int n){
        // Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

        String front="";
        if (str.length()<=3){
            front=str;
        }
        else{
            front=str.substring(0,3);
        }

        String str2="";
        for (int i=0;i<n;i++){
            str2+=front;
        }
        return str2;

    }
    
    public static void main(String[] args) {
        
    }
}