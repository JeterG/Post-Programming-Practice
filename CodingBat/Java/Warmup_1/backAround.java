public class backAround{
    public static String backAround(String str){
        // Given a string, take the last char and return a new string with the last char added at the frontand back, so "cat" yields "tcatt". the original string will be length 1 or more.
        return str.charAt(str.length()-1)+str+str.charAt(str.length()-1);
    }
    public static void main(String[] args) {
        
    }
}