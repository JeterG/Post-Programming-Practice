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

    public int countCode(String str) {
        // Return the number of times that the string "code" appears anywhere in the
        // given string, except we'll accept any letter for the 'd', so "cope" and
        // "cooe" count.
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 3 < str.length()) {
                if ((str.charAt(i) == 'c') && (str.charAt(i + 1) == 'o') && (str.charAt(i + 3) == 'e')) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        // Given two strings, return true if either of the strings appears at the very
        // end of the other string, ignoring upper/lower case differences (in other
        // words, the computation should not be "case sensitive"). Note:
        // str.toLowerCase() returns the lowercase version of a string.

        if (a.length() == b.length()) {
            return a.toLowerCase().equals(b.toLowerCase());
        } else if (a.length() < b.length()) {
            return b.substring(b.length() - a.length()).toLowerCase().equals(a.toLowerCase());
        } else {
            return a.substring(a.length() - b.length()).toLowerCase().equals(b.toLowerCase());
        }
    }

    public boolean xyzThere(String str) {
        // Return true if the given string contains an appearance of "xyz" where the xyz
        // is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does
        // not.
        for (int i = 0; i < str.length(); i++) {
            if ((i + 3 < str.length()) || (str.length() == 3)) {
                if (((str.charAt(i) != '.') && (str.charAt(i + 1) == 'x') && (str.charAt(i + 2) == 'y')
                        && (str.charAt(i + 3) == 'z'))
                        || ((i == 0) && (str.charAt(i) == 'x') && (str.charAt(i + 1) == 'y')
                                && (str.charAt(i + 2) == 'z'))) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean bobThere(String str){
        // Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length()) {
                if ((str.charAt(i) == 'b') && (str.charAt(i + 2) == 'b')) {
                    return true;
                }
            }
        }
        return false;        

    }

    public String repeatEnd(String str, int n){
        // Given a string and an int n, return a string made of n repetitions of the last n characters of the string.You may assume that n is between 0 and the length of the string, inclusive.
        // String reverse = new StringBuffer(str).reverse().toString();
        String temp="";
        for(int i=0;i<n;i++){
            temp+=str.substring(str.length()-n);
        }

        return temp;
    }
    public String repeatFront(String str, int n){
        // Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters f the string and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n>=0 and n<=str.length()).
        String temp="";
        for (int i=0; i<n;i++){
            temp+=str.substring(0,n-i);
        }
        return temp;
    }

    public static String repeatSeparator(String word, String sep, int count){
        // Given two strings, word and a separator sep, return a big string made of count occurences of the word, separated by the separator string.
        String temp="";
        for(int i=0; i <count;i++){
            temp+=word;
            if(i<count-1){
                temp+=sep;
            }
        }
        return temp;
    }

    public static boolean prefixAgain(String str, int n){
        // Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhe4re else in the string? Assume that the string is not empty and that N is in the range 1..str.length()
        String prefix=str.substring(0,n);
        String temp=str.substring(n);
        return temp.contains(prefix);
    }

    public static boolean xyzMiddle(String str){
        // Given a string, does "xyz" appear in the midle of the string? To define the middle we'll say that the number of chars to the left and right of the xyz must differ by at most one. This problem is harder than it looks.
        if(str.length()<3){
            return false;
        }
        int occurences=0;
        int lastIndex=0;
        String indexes="";
        while(lastIndex!=-1){
            lastIndex=str.indexOf("xyz",lastIndex);
            if(lastIndex!=-1){
                indexes+=String.valueOf(lastIndex);
                System.out.println(indexes);
                occurences++;
                lastIndex+=3;
            }
        }
        System.out.println(occurences);

        //Can put this if condition into the while loop and do it at each time that there is an occurence and then if they are all false then return false, so only return from the while loop if its true.
        if(occurences==1){
            int firstOccurrence=str.indexOf("xyz");
            String front=str.substring(0,firstOccurrence);
            String end=str.substring(firstOccurrence+3);
            int difference=front.length()-end.length();
            return ((difference==0)|| (difference==1)||(difference==-1) );
        }
        else{//handle occurances
            return false;
        }
        // Can be more than one occurance of xyz in the string, so checking the index of the appearance if xyz is in the string can help.
        //I can reverse the string and slice the string until the first occurance of Z in the reverse direction.   
        //Have to consider if xyz occurs more than once and if it does then have to check if any of those occurences is in the middle if they are all false then its false but if even one of them is true then its true that the xyz is in the middle.
        
    }


    public static void main(String[] args) {
        String_2 obj = new String_2();
        // System.out.println(obj.doubleChar("The"));
        // System.out.println(obj.countHi("abc hi hi"));
        // System.out.println(obj.catDog("1cat1cadodog"));
        // System.out.println(obj.countCode("cozexxcope"));
        // System.out.println(obj.endOther("abc", "abXabc"));
        // System.out.println("abXabc".length());
        // System.out.println("abc".length());
        // System.out.println("abXabc".length()-"abc".length());
        // System.out.println("abXabc".substring("abXabc".length()-"abc".length()));
        // System.out.println(obj.xyzThere("abc.xyz"));
        // System.out.println(obj.repeatEnd("abc",2));
        // System.out.println(obj.repeatFront("abc",2));
        // System.out.println(obj.repeatSeparator("abc","1",2));
        // System.out.println(obj.prefixAgain("abXYabc",2));
        System.out.println(obj.xyzMiddle("xyzxyzAxyzxyzxyz"));



    }

}