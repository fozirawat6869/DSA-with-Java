package Strings;

public class CharacterSameOrNot {

        public static boolean isAllCharactersSame(String s) {
            if (s.isEmpty()) {
                return true; // empty string is also gives true
            }

            char firstChar = s.charAt(0);
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != firstChar) {
                    return false;
                }
            }
            return true;
        }

}
