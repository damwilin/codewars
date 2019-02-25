package CamelCase;

public class Solution {
    public static String camelCase(String str) {
        if (str.isEmpty())
            return str;
        String[] strArray = str.trim().split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (String currString : strArray) {
            builder.append(firstToUpper(currString));
        }
        return builder.toString();
    }

    private static String firstToUpper(String string) {
        if (string.length() < 1)
            return string.toUpperCase();
        char first = string.charAt(0);
        return string.replaceFirst(String.valueOf(first), String.valueOf(Character.toUpperCase(first)));
    }
}