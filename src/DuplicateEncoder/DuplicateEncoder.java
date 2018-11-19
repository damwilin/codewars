package DuplicateEncoder;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    static String encode(String word){
        System.out.println(word);
        word = word.toLowerCase();
        Map<Character, Integer> charMap = new HashMap<>();
        for (char ch : word.toCharArray()){
            if (!charMap.containsKey(ch))
                charMap.put(ch,1);
            else
                charMap.put(ch,charMap.get(ch) +1);
        }
        StringBuilder builder = new StringBuilder();
        for (char ch : word.toCharArray())
            if (charMap.get(ch) >1)
                builder.append(")");
            else
                builder.append("(");
        return builder.toString();
    }
}
