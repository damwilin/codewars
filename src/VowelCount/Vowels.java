package VowelCount;

import java.util.HashSet;

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        HashSet<Character> vowelsSet = new HashSet<>();
        vowelsSet.add('a');
        vowelsSet.add('e');
        vowelsSet.add('i');
        vowelsSet.add('o');
        vowelsSet.add('u');
        for (char c: str.toCharArray()){
            if (vowelsSet.contains(c))
                vowelsCount++;
        }
        return vowelsCount;
    }
}
