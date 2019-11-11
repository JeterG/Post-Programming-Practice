public class startHi{
    public static boolean startHi(String str){
        // Given a string, return true if the string starts with "hi" and false othwerwise
        if(str.length()<=1){
            return false;
        }
        if(str.substring(0,2).equals("hi")){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        startHi("hi there");
    }
}