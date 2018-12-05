package DecodeTheMorseCode;

import java.util.*;

public class MorseCodeDecoder {

    public static String decode(String morseCode) {
        morseCode = morseCode.trim();
        Map<String, String> morseAlphabet = initMorseAlphabet();
        List<String> lettersList = createListOfLetters(morseCode);
        return decodeList(lettersList, morseAlphabet);
    }

    private static String decodeList(List<String> lettersList, Map<String, String> morseAlphabet) {
        StringBuilder builder = new StringBuilder();
        for (String letter : lettersList){
            if (letter.equals(" "))
                builder.append(" ");
            else if (morseAlphabet.containsKey(letter))
                builder.append(morseAlphabet.get(letter));
        }
        return builder.toString();
    }

    private static Map<String, String> initMorseAlphabet() {
        Map<String, String> morseAlphabet = new HashMap<>();
        morseAlphabet.put(".-", "A");
        morseAlphabet.put("-...", "B");
        morseAlphabet.put("-.-.", "C");
        morseAlphabet.put("-..", "D");
        morseAlphabet.put(".", "E");
        morseAlphabet.put("..-.", "F");
        morseAlphabet.put("--.", "G");
        morseAlphabet.put("....", "H");
        morseAlphabet.put("..", "I");
        morseAlphabet.put(".---", "J");
        morseAlphabet.put("-.-", "K");
        morseAlphabet.put(".-..", "L");
        morseAlphabet.put("--", "M");
        morseAlphabet.put("-.", "N");
        morseAlphabet.put("---", "O");
        morseAlphabet.put(".--.", "P");
        morseAlphabet.put("--.-", "Q");
        morseAlphabet.put(".-.", "R");
        morseAlphabet.put("...", "S");
        morseAlphabet.put("-", "T");
        morseAlphabet.put("..-", "U");
        morseAlphabet.put("...-", "V");
        morseAlphabet.put(".--", "W");
        morseAlphabet.put("-..-", "X");
        morseAlphabet.put("-.--", "Y");
        morseAlphabet.put("--..", "Z");
        morseAlphabet.put("...---...", "SOS");
        morseAlphabet.put(".-.-.-", ".");
        morseAlphabet.put("--..--", ",");
        morseAlphabet.put("..--..", "?");
        morseAlphabet.put("-.-.--", "!");
        return morseAlphabet;
    }
    private static List<String> createListOfLetters(String morseCode){
        List<String> lettersList = new ArrayList<>();
        boolean isFinish = false;
        int startIndex = 0;
        while (!isFinish) {
            String letter;
            int spaceIndex = morseCode.indexOf(' ');
            if (spaceIndex == -1) {
                letter = morseCode;
                isFinish = true;
            } else if (spaceIndex == 0 && morseCode.charAt(1) == ' ') {
                letter = " ";
                spaceIndex = spaceIndex + 1;
            } else {
                letter = morseCode.substring(startIndex, spaceIndex);
            }
            morseCode = morseCode.substring(spaceIndex+1);
            lettersList.add(letter);
        }
        return lettersList;
    }
}
