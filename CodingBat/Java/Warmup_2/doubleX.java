public class doubleX{
    
    public static boolean doubleX(String str){
        // Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
        if(str.length()<=1){
            return false;
          }
        boolean count=false;
        int start=0;
        boolean end=true;
        while(end==true){
            if(str.charAt(start)=='x'){
                if(str.charAt(start+1)=='x'){
                    count=true;
                    end=false;
                }
                else{
                    end=false;
                }
            }
            start++;
            if((start+1)>=str.length()){
                end=false;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(doubleX("axdxbb"));
    }
}