public class altPairs{
    
    public static String altPairs(String str){
        // Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

        if(str.length()<=2){
            return str;
        }
        else{
            boolean count=false;
            String str2="";
            for (int i=0;i<str.length();){
                if (count==true){
                    str2+=str.charAt(i);
                    i+=3;
                    count=false;
                    if(i>=str.length()){
                    return str2;
                }
                }
                else{
                    str2+=str.charAt(i);
                    i+=1;
                    count=true;
                    if(i>=str.length()){
                    return str2;
                }
                }
            }
            return str2;
        }
    }
    
    public static void main(String[] args) {
     System.out.println(altPairs("kitten"));   
    }
}