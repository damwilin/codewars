package TotalAmountOfPoints;

import java.util.stream.Stream;

public class TotalPoints {
    public static int points(String[] games) {
        return Stream.of(games).map(s -> parseToIntArray(s))
                .mapToInt(i -> calculatePoints(i))
                .sum();
    }

    private static int calculatePoints(int[] points) {
        int x = points[0];
        int y = points[1];
        if (x > y) {
            return 3;
        } else if (x < y)
            return 0;
        else if (x == y)
            return 1;
        return 0;
    }

    private static int[] parseToIntArray(String currGame) {
        return Stream.of(currGame.split(":"))
                .mapToInt(s -> Integer.parseInt(s))
                .toArray();
    }

}
