public class frontBack{
    // Given a string, return a new string where the first and last chars have been exchanged.
    
    public static String frontBack(String str){
        int end = str.length();
        if (end <2){
            return str;
        }
        int begin = 0;
        String x="";
        for (int i=1;i<end-1;i++){
            x+=str.charAt(i);
        }
        return str.charAt(end-1)+x+str.charAt(0);
    }
    public static void main(String[] args) {
        
    }
}