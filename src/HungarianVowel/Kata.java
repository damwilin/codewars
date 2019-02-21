package HungarianVowel;

public class Kata {
    public static String dative(String word) {
        char[] frontVowels = {'e', 'é', 'i', 'í', 'ö', 'ő', 'ü', 'ű'};
        char[] backVowels = {'a', 'á', 'o', 'ó', 'u', 'ú'};
        for (int i = word.length() - 1; i >= 0; i--) {
            if (isVowel(word.charAt(i), frontVowels))
                return word += "nek";
            if (isVowel(word.charAt(i), backVowels))
                return word += "nak";
        }
        return word;
    }

    private static boolean isVowel(char ch, char[] vowels) {
        for (char v : vowels) {
            if (ch == v)
                return true;
        }
        return false;
    }
}
