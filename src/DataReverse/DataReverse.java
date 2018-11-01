package DataReverse;

import java.util.Arrays;
import java.util.Collections;


public class DataReverse {

    public static int[] dataReverse(int[] data) {
        int[][] sortedData = new int[data.length / 8][];
        int startIndex = 0;
        int endIndex = 8;
        for (int i = 0; i < data.length / 8; i++) {
            int[] currByte = Arrays.copyOfRange(data, startIndex, endIndex);
            startIndex += 8;
            endIndex += 8;
            sortedData[i] = currByte;
        }
        Collections.reverse(Arrays.asList(sortedData));
        return Arrays.stream(sortedData).flatMapToInt(Arrays::stream).toArray();
    }
}
