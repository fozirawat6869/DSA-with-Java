package Strings;


public class LongestWord {

    public static String findLongestWord(String str) {

        String word = "";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            } else {

                if (word.length() > longest.length()) {
                    longest = word;
                }

                word = "";
            }
        }

        if (word.length() > longest.length()) {
            longest = word;
        }

        return longest;
    }
}