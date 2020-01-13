public class stringE{
    
    public static boolean stringE(String str){
        // Return true if the given string contains between 1 and 3 'e' chars.
        if(str.length()==0){
            return false;
        }
        else{
            int count=0;
            int end =str.length();
            for (int i=0;i<end;i++){
                if (str.charAt(i)=='e'){
                    count+=1;
                }
            }
            if ((count<=3)&&(count>=1)){
                return true;
            }
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(stringE(""));

    }
}