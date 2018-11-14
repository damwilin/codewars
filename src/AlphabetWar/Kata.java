package AlphabetWar;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static String alphabetWar(String fight) {
        Map<Character, Integer> leftSideMap = new HashMap<>();
        Map<Character, Integer> rightSideMap = new HashMap<>();
        int leftResult = 0;
        int rightResult = 0;
        //Fill maps
        leftSideMap.put('w', 4);
        leftSideMap.put('p', 3);
        leftSideMap.put('b', 2);
        leftSideMap.put('s', 1);

        rightSideMap.put('m', 4);
        rightSideMap.put('q', 3);
        rightSideMap.put('d', 2);
        rightSideMap.put('z', 1);

        //Check characters
        for (char a : fight.toCharArray()) {
            if (leftSideMap.containsKey(a))
                leftResult += leftSideMap.get(a);
            else if (rightSideMap.containsKey(a))
                rightResult += rightSideMap.get(a);
        }
        if (leftResult == rightResult)
            return "Let's fight again!";
        else
            return leftResult > rightResult ? "Left side wins!" : "Right side wins!";
    }
}
