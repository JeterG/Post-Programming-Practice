public class everyNth{
    
    public static String everyNth(String str,int n){
        // Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

        String str2="";
        if(str.length()<=1){
            return str;
        }
        else{
            boolean temp=true;
            str2+=str.charAt(0);
            int start=0;
            while(temp==true){
                start+=n;
                if(start<=str.length() -1){
                    str2+=str.charAt(start);
                }
                else{
                    temp=false;
                }
            }
            return str2;
        }

    }
    
    public static void main(String[] args) {
        System.out.println(everyNth("a",1));
        System.out.println(everyNth("1233",1));

    }
}