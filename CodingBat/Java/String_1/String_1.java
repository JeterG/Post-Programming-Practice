public class String_1{
    
    public static String helloName(String name){
        // Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        return "Hello "+name +"!";
    }

    public static String makeAbba(String a, String b){

        // Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
        return a+b+b+a;

    }
    
    public static String makeTags(String tag, String word){

        // The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

        return "<"+tag+">"+word+"</"+tag+">";

    }

    public static String makeOutWord(String out, String word){
        // Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

        return out.substring(0,2)+word+out.substring(2);
    }
    

    public static String extraEnd(String str){

        // Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
        return str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2);
    }

    public static String firstTwo(String str){
        // Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
        if(str.length()<=2){
            return str;
        }
        else{
            return str.substring(0,2);
        }
    }

    public static String firstHalf(String str){

        // Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

        return str.substring(0,str.length()/2);

    }


    public static String withoutEnd(String str){

        // Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

        if (str.length()<=2){
            return "";
        }
        else{
            return str.substring(1,str.length()-1);
        }

    }


    public static String comboString(String a,String b){
        // Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
        if(a.length()>b.length()){
            return b+a+b;
        }
        return a+b+a;
    }

    public static String nonStart(String a, String b){
        // Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
        return a.substring(1)+b.substring(1);
    }

    public static String left2(String str){
        // Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
        return str.substring(2)+str.substring(0,2);
    }

    public static String right2(String str){
        // Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
        return str.substring(str.length()-2)+str.substring(0,str.length()-2);
    }

    public static String theEnd(String str, boolean front){
        // Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
        if(front==true){
            return str.charAt(0)+"";
        }
        return str.charAt(str.length()-1)+"";
    }

    public static String withoutEnd2(String str){

        // Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

        if(str.length()<=2){
            return "";
        }
        return str.substring(1,str.length()-1);
    }

    public static String middleTwo(String str){
        // Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
        return str.substring((str.length()-1)/2,((str.length()-1)/2)+2);
    }


    public static boolean endsLy(String str) {
        // Given a string, return true if it ends in "ly".
        if (str.length()<=1){
            return false;
        }
        else if(str.length()==2){
            return str.equals("ly");
        }
        return str.substring(str.length()-2).equals("ly");
    }

    public static String nTwice(String str, int n) {

        // Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
        
        return str.substring(0,n)+str.substring(str.length()-n);
        
    }


    public static String twoChar(String str, int index){
        // Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.

        if (((index+1)>=str.length())||index<0){
            return str.substring(0,2);
        }
        return str.substring(index,index+2);
    }

    public static String middleThree(String str) {

        // Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.

        if (str.length()<=3){
            return str;
        }
        else{
            int length=(str.length()+1)/2;
            return str.substring(length-2,length+1);
                              
        }
    }

    public static boolean hasBad(String str) {
        // Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or 
        if(str.length()<=2){
            return false;
        }
        else if (str.length()==3){
            if (str.equals("bad")){
                return true;
            }
            return false;
        }
        else{
            return (str.substring(0,3).equals("bad")||str.substring(1,4).equals("bad"));
        }
    }

    public static String atFirst(String str) {
        // Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
        if(str.length()==0){
            return "@@";
        }
        else if(str.length()==1){
            return str+"@";
        }
        else if(str.length()==2){
            return str;
        }
        else{
            return str.substring(0,2);
        }
    }

    public static String lastChars(String a, String b) {

        // Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

        if((a.length()==0)&&(b.length()==0)){
            return "@@";
        }
        else if(a.length()==0){
            return "@"+b.substring(b.length()-1);
        }
        else if(b.length()==0){
            return a.substring(0,1)+"@";
        }
        else{
            return a.substring(0,1)+b.substring(b.length()-1);
        }
    }

    public static String conCat(String a, String b) {

        // Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
        if((a.length()==0)||(b.length()==0)){
            return a+b;
        }
        else if(a.charAt(a.length()-1)==b.charAt(0)){
            return a+b.substring(1);
        }
        else{
            return a+b;
        }
    }

    public static String lastTwo(String str) {
        // Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
        if(str.length()<=1){
            return str;
        }
        else if(str.length()==2){
            return str.substring(1)+str.substring(0,1);

        }
        else{
            return str.substring(0,str.length()-2)+str.charAt(str.length()-1)+str.charAt(str.length()-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(lastTwo("coding"));
        // System.out.println(conCat("abc","cat"));
        // System.out.println(lastChars("last","chars"));
        // System.out.println(lastChars("hi",""));
        // System.out.println(atFirst("h"));
        // System.out.println(hasBad("xbadxx"));
        // System.out.println(middleThree("Candy"));
        // System.out.println(helloName("Jeter"));
        // System.out.println(makeAbba("Hi","Bye"));
        // System.out.println(makeTags("i","Yay"));
        // System.out.println(makeOutWord("<<>>","Yay"));
        // System.out.println(extraEnd("Hello"));
        // System.out.println(firstTwo("Hello"));
        // System.out.println(firstHalf("WooHoo"));
        // System.out.println(withoutEnd("Hello"));
        // System.out.println(comboString("Hello","hi"));
        // System.out.println(nonStart("Hello","There"));
        // System.out.println(left2("Hello"));
        // System.out.println(right2("Hello"));
        // System.out.println(theEnd("Hello",true));
        // System.out.println(theEnd("Hello",false));
        // System.out.println(withoutEnd2("Hello"));
        // System.out.println(middleTwo("string"));
        // System.out.println(endsLy("oddly"));
        // System.out.println(nTwice("Chocolate",3));
        // System.out.println(twoChar("java",0));
        // System.out.println(twoChar("java",2));
        // System.out.println(twoChar("java",3));
    }
}