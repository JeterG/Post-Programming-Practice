public class stringMatch{
    
    public static int stringMatch(String a, String b){
        //Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings. 
        int count=0;
        if((a.length()<=1)||(b.length()<=1)){
            return 0;
        }
        else if((a.length()==2)&&(b.length()==2)){
            if (a.equals(b)){
                return 1;
            }
            return 0;
        }
        else if(a.length()==b.length()){
                
                for (int i=0;i<a.length()-1;i++){
                    if (a.substring(i,i+2).equals(b.substring(i,i+2))){
                        count++;
                    }
                }
                return count;
            }
        else if(a.length()>b.length()){
            for (int i=0;i<b.length()-1;i++){
                if (a.substring(i,i+2).equals(b.substring(i,i+2))){
                    count++;
                }
            }
            return count;
        }
        for (int i=0;i<a.length()-1;i++){
            if (a.substring(i,i+2).equals(b.substring(i,i+2))){
                count++;
            }
        }
        return count;

    }
    
    public static void main(String[] args) {
        
        System.out.println(stringMatch("aaa","aaa"));
        
    }
}