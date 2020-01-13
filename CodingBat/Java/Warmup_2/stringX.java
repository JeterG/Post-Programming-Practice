public class stringX{
    
    public static String stringX(String str){

        // Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

        if(str.length()<=1){
            return str;
        }
        else{
            String str2=str.substring(0,1);
            for(int i=1;i<str.length()-1;i++){
                if(str.charAt(i)!='x'){
                    str2+=str.charAt(i);
                }
            }
            str2+=str.substring(str.length()-1);
            return str2;
        }

    }
    
    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));


    }
}