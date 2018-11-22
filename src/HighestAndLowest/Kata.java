package HighestAndLowest;

import java.util.Arrays;

public class Kata {
    public static String HighAndLow(String numbers) {
        int[] intArrray = Arrays.stream(numbers.split(" ")).mapToInt(c -> Integer.valueOf(c)).sorted().toArray();
        return intArrray[intArrray.length-1] + " " + intArrray[0];
    }
}
