package AlphabeticalSequence;

import java.util.Arrays;

public class Solution {

    public static String alphaSeq(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        Arrays.sort(chars);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            builder.append(Character.toUpperCase(ch));
            for (int j = 0; j < Character.getNumericValue(ch) - 10; j++) {
                builder.append(ch);
            }
            if (i != chars.length - 1)
                builder.append(",");
        }
        return builder.toString();
    }
}
