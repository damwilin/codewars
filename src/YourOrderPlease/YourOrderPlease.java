package YourOrderPlease;

public class YourOrderPlease {
    public static String order(String words) {
        if (words.isEmpty())
            return words;
        String[] wordsArray = words.split(" ");
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= wordsArray.length; i++) {
            for (String currWord : wordsArray) {
                if (currWord.contains(String.valueOf(i)))
                    answer.append(currWord + " ");
            }
        }
        return answer.toString().trim();
    }

}
