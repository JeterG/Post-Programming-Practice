public class last2{
    
    public static int last2(String str){
        // Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
        if(str.length()<=2){
            return 0;
        }
        else{
            String end=str.substring(str.length()-2,str.length());
            // System.out.println(str.length()-2);
            int count=0;
            for(int i=0;i<str.length()-2;i++){
                // System.out.println(str.substring(i,i+2));
                if(str.substring(i,i+2).equals(end)){
                    // System.out.println("test");

                    count+=1;
                }
            }
            return count;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(last2("ccabcc"));
        
    }
}