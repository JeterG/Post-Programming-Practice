public class startOz{
    public static String startOz(String str){
        // Given a string, return a string made of the first 2 chars (if present), however include the first char only if it is 'o' and iclude the second only if it is 'z' so "ozymandias" yields "oz".
        if(str.length()<=0){
            return str;
        }
        if(str.length()==1){
          if(str.charAt(0)=='o'){
            return str;
        }  
        }
        String temp="";
        if(str.charAt(0)=='o'){
            temp+='o';
        }
        if(str.charAt(1)=='z'){
            temp+='z';
        }
        return temp;
    }
    public static void main(String[] args) {
        System.out.println(startOz("oz"));
    }
}