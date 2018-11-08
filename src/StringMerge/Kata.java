package StringMerge;

public class Kata {
    public static String stringMerge(String s1, String s2, char letter) {
        return s1.substring(0,s1.indexOf(letter)).concat(s2.substring(s2.indexOf(letter)));
    }
}
