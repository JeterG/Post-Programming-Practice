public class stringYak{
    
    public static String stringYak(String str){
        // Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
        if (str.contains("y")==false){
            return str;
        }
        else{
                String str2="";
                for(int i=0;i<str.length();i++){
                    if (i>=str.length()){
                        continue;
                    }
                    if(str.charAt(i)=='y'){
                        if((i+2)>=str.length()){
                            str2+=str.charAt(i);

                            continue;
                        }
                        if(str.charAt(i + 2)=='k'){
                            i+=3;
                            if (i>=str.length()){
                                continue;
                            }
                        }
                    }
                    str2+=str.charAt(i);


                }
                return str2;
        }


    }
    
    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));


    }
}