public class delDel{
    public static String delDel(String str){
        // Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherewise return the string unchanged.
        if(str.length()<4){
            return str;
        }
        if(str.substring(1, 4).equals("del")){
            return str.charAt(0)+str.substring(4, str.length());
            
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(delDel("ddel"));
    }
}