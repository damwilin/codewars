package WhoLikesIt;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static String whoLikesIt(String... names) {
        String likes = " likes this";
        String like = " like this";
        StringBuilder answerBuilder = new StringBuilder();
        List<String> namesList = Arrays.asList(names);
        switch (namesList.size()){
            case 0:
                answerBuilder.append("no one");
                answerBuilder.append(likes);
                break;
            case 1:
                answerBuilder.append(namesList.get(0));
                answerBuilder.append(likes);
                break;
            case 2:
                answerBuilder.append(namesList.get(0));
                answerBuilder.append(" and ");
                answerBuilder.append(namesList.get(1));
                answerBuilder.append(like);
                break;
            case 3:
                answerBuilder.append(namesList.get(0));
                answerBuilder.append(", ");
                answerBuilder.append(namesList.get(1));
                answerBuilder.append(" and ");
                answerBuilder.append(namesList.get(2));
                answerBuilder.append(like);
                break;
                default:
                    answerBuilder.append(namesList.get(0));
                    answerBuilder.append(", ");
                    answerBuilder.append(namesList.get(1));
                    answerBuilder.append(" and ");
                    answerBuilder.append(namesList.size()-2 + " others");
                    answerBuilder.append(like);
        }
        return answerBuilder.toString();
    }
}
