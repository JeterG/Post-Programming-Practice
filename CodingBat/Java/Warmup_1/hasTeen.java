public class hasTeen{
    public static boolean hasTeen(int a, int b, int c){
        // We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
        if(13<=a&&a<=19){
            return true;
        }
        if(13<=b&&b<=19){
            return true;
        }
        if(13<=c&&c<=19){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}