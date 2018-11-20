package DetectPangram;

import java.util.HashMap;
import java.util.Map;

public class PangramChecker {

    private static final String ALPHABET = "abcdefghijklmnopgrstuvwxyz";
    private Map<Character, Boolean> usedLettersMap;

    private void setupUsedLetterMap() {
        usedLettersMap = new HashMap<>();
        for (Character ch : ALPHABET.toCharArray()){
            usedLettersMap.put(ch, false);
        }
    }
    public boolean check(String sentence){
        setupUsedLetterMap();
        insertToUsedLetterMap(sentence);
        return checkIfMapContainsFalse();
    }

    private void insertToUsedLetterMap(String sentence){
        for (char ch : sentence.toLowerCase().replaceAll("[^a-z]","").toCharArray()){
            usedLettersMap.put(ch,true);
        }
    }

    private boolean checkIfMapContainsFalse(){
        return usedLettersMap.containsValue(false) ? false : true;
    }
}
