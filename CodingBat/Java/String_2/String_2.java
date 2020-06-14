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

    public static void main(String[] args) {
        String_2 obj = new String_2();
        System.out.println(obj.doubleChar("The"));
        System.out.println(obj.countHi("abc hi hi"));
        System.out.println(obj.catDog("1cat1cadodog"));

    }

}