public class posNeg{
    // Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative " is true, then return true if both are negative.
    public static boolean posNeg(int a, int b, boolean negative){
        if (negative){
            if ((a<0)&&(b<0)){
                return true;
            }
        }
        else if(((a<0)&&(b>0))||((a>0)&&(b<0))){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}