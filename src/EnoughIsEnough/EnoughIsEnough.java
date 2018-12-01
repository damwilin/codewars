package EnoughIsEnough;

import java.util.*;

public class EnoughIsEnough {


    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if (maxOccurrences ==0)
            return new int[]{};
        Map<Integer, Integer> collectionMap = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        for (int curr : elements){
            if (!isMaxRepeats(curr,maxOccurrences,collectionMap)){
                insertElementToMap(curr,collectionMap);
                answer.add(curr);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
    public static void insertElementToMap(int element, Map<Integer, Integer> collectionMap){
        if (!collectionMap.containsKey(element))
        collectionMap.put(element,1);
        else{
            int occurrences = collectionMap.get(element);
            collectionMap.put(element,occurrences +1);
        }
    }
    public static boolean isMaxRepeats(int element, int maxOccurrences, Map<Integer, Integer> collectionMap){
        if (collectionMap.containsKey(element) && collectionMap.get(element).equals(maxOccurrences))
            return true;
        else
            return false;
    }
}
