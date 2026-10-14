package Strings;


public class LongestWord {

    public static String findLongestWord(String str) {

        StringBuilder word = new StringBuilder();
        String longest = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                word.append(str.charAt(i));
            } else {

                if (word.length() > longest.length()) {
                    longest = word.toString();
                }

                word = new StringBuilder();
            }
        }

        if (word.length() > longest.length()) {
            longest = word.toString();
        }

        return longest;
    }
}