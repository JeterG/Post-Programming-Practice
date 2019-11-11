public class mixStart{
    public static boolean mixStart(String str){
// Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count
        if(str.length()<=2){
            return false;
        }
        if (str.substring(1, 3).equals("ix")){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(mixStart("9x"));
    }
}