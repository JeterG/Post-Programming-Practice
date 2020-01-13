public class countXX{
    
    public static int countXX(String str){
        // Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
        if(str.length()<=1){
            return 0;
          }
        int count=0;
        int start=0;
        boolean end=true;
        while(end==true){
            
            if(((str.charAt(start))=='x')&&(str.charAt(start+1)=='x')){
                count++;

            }
            start++;
            if((start+1)>=str.length()){
                end=false;
            }

        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(countXX("xxx"));
    }
}