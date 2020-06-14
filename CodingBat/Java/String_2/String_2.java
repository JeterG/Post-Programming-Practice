public class String_2 {
    public String doubleChar(String str) {
        // Given a string, return a string where for every char in the original, there
        // are two chars.
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i);
            result = result + str.charAt(i);
        }
        return result;
    }

    public int countHi(String str) {
        // Return the number of times that the string "hi" appears anywhere in the given
        // string.
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length()) {
                if ((str.charAt(i) == 'h') && (str.charAt(i + 1) == 'i')) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        // Return true if the string "cat" and "dog" appear the same number of times in
        // the given string.
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length()) {
                if ((str.charAt(i) == 'c') && (str.charAt(i + 1) == 'a') && (str.charAt(i + 2) == 't')) {
                    catCount++;
                }
                if ((str.charAt(i) == 'd') && (str.charAt(i + 1) == 'o') && (str.charAt(i + 2) == 'g')) {
                    dogCount++;
                }
            }
        }
        return catCount == dogCount;
    }

    public int countCode(String str){
        // Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 3 < str.length()) {
                if ((str.charAt(i) == 'c') && (str.charAt(i + 1) == 'o') && (str.charAt(i + 3) == 'e')) {
                    count++;
                }
            }
        }
                return count;
    }
    
    public boolean endOther(String a, String b){
        // Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

        if(a.length()==b.length()){
            return a.toLowerCase().equals(b.toLowerCase());
        }
        else if(a.length()<b.length()){
            return b.substring(b.length()-a.length()).toLowerCase().equals(a.toLowerCase());
        }
        else{
            return a.substring(a.length()-b.length()).toLowerCase().equals(b.toLowerCase());
        }


    }

    public static void main(String[] args) {
        String_2 obj = new String_2();
        // System.out.println(obj.doubleChar("The"));
        // System.out.println(obj.countHi("abc hi hi"));
        // System.out.println(obj.catDog("1cat1cadodog"));
        // System.out.println(obj.countCode("cozexxcope"));
        System.out.println(obj.endOther("abc", "abXabc"));
        // System.out.println("abXabc".length());
        // System.out.println("abc".length());
        // System.out.println("abXabc".length()-"abc".length());
        // System.out.println("abXabc".substring("abXabc".length()-"abc".length()));



    }

}