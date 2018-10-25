package AlternateCase;

import java.lang.reflect.Array;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlternateCase {
    //http://www.codewars.com/kata/57a62154cf1fa5b25200031e/train/java


    static String alternateCase(final String string) {
        char stringArray[] = string.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            if (Character.isLowerCase(stringArray[i]))
                stringArray[i] = Character.toUpperCase(stringArray[i]);
            else stringArray[i] = Character.toLowerCase(stringArray[i]);
        }
        return new String(stringArray);
    }
}
