package lesson5;

public class LabString {

    public static String longWord(String string) {
        String[] strArray = string.split(" ");
        int lenWord = 0;
        String maxLenWord = "";
        for (String word : strArray) {
            if (word.length() > lenWord) {
                lenWord = word.length();
                maxLenWord = word;
            }
        }
        return maxLenWord;
    }

    public static boolean isPalindrome(String string) {
        return string.equalsIgnoreCase(new StringBuilder(string).reverse().toString());
    }

    public static String lab1(String string) {
        String str1 = string.toLowerCase();
        return (str1.replaceAll("бяка", "[вырезано цензурой]"));
    }
    public static int lab2(String string1, String string2) {
        int string1Len = string1.length();
        int string2Len = string2.length();
        int string3Len = string1.replaceAll(string2, "").length();
        return (string1Len - string3Len) / string2Len;
    }

    public static String lab3(String string) {
        StringBuilder strRev = new StringBuilder();
        String[] strArray = string.split(" ");
        for (String word : strArray) {
            StringBuilder revers = (new StringBuilder(word).reverse());
            strRev.append(revers)
                    .append(" ");
        }
        return String.valueOf(strRev);
    }
}
