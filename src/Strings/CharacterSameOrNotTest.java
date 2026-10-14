package Strings;

public class CharacterSameOrNotTest {
    public static void main(String[] args) {
        check("mm", true);
        check("abc", false);

        System.out.println("All tests passed!");
    }

    private static void check(String input, boolean expected) {
        boolean actual = CharacterSameOrNot.isAllCharactersSame(input);

        if (actual != expected) {
            throw new AssertionError(
                    "For \"" + input + "\", expected " + expected + " but got " + actual
            );
        }
    }
}