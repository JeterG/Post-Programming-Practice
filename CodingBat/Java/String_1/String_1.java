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

    public static void main(String[] args) {
        System.out.println(helloName("Jeter"));
        System.out.println(makeAbba("Hi","Bye"));
        System.out.println(makeTags("i","Yay"));
        System.out.println(makeOutWord("<<>>","Yay"));
        System.out.println(extraEnd("Hello"));
        System.out.println(firstTwo("Hello"));
        System.out.println(firstHalf("WooHoo"));
        System.out.println(withoutEnd("Hello"));
        System.out.println(comboString("Hello","hi"));
        System.out.println(nonStart("Hello","There"));
    }
}