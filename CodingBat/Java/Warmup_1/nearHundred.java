public class nearHundred{
    // Given an int n, return treu if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
    public boolean nearHundred(int n){
        if(n<=110){
            if (Math.abs(100-n)<=10){
                return true;
            }
        }
        else{
            if (Math.abs(200-n)<=10){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}