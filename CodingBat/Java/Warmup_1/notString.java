public class notString{
    // Given a string, return a new string where "not" has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
    
    public static String notString(String str){
        if (str.length()>=3){
        if ((str.charAt(0)=='n')&&((str.charAt(1)=='o'))&&((str.charAt(2)=='t' ))){
            return str;
        }}
        return "not "+str;
    }
    public static void main(String[] args) {
        
    }
}