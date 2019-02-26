package ReverseWords;

public class Kata {
    public static String reverseWords(final String original) {
        StringBuilder answer = new StringBuilder();
        StringBuilder singleWord = new StringBuilder();
        for (int i = 0; i < original.length(); i++) {
            char currChar = original.charAt(i);
            if (!Character.isSpaceChar(currChar)) {
                singleWord.append(currChar);
                if (i == original.length()-1){
                    answer.append(singleWord.reverse().toString());
                }
            } else {
                if (singleWord.length() != 0) {
                    answer.append(singleWord.reverse().toString());
                    singleWord = new StringBuilder();
                }
                answer.append(currChar);
            }
        }
        return answer.toString();
    }
}
