package PoetAndThePendulum;

import java.util.Arrays;

public class Poet {

    public static int[] pendulum(final int[] values) {
        Arrays.sort(values);
        int[] answer = new int[values.length];
        int possition = (values.length - 1) / 2;
        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 0)
                possition -= i;
            else
                possition += i;
            answer[possition] = values[i];
        }
        return answer;
    }
}
