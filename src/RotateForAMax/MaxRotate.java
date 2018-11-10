package RotateForAMax;

import java.util.Arrays;

public class MaxRotate {

    public static long maxRot(long n) {
        String nString = Long.toString(n);
        int rotArraySize = nString.length();
        String toRotate = nString;
        String notToRotate;
        long[] rotArray = new long[rotArraySize];
        for (int i = 0; i < rotArraySize; i++) {
            rotArray[i] = Long.parseLong(nString);
            notToRotate = nString.substring(0, i);
            toRotate = nString.substring(i);
            nString = notToRotate + rotateLeft(toRotate);
        }
        Arrays.sort(rotArray);
        return rotArray[rotArraySize - 1];
    }

    private static String rotateLeft(String toRotate) {
        char firstChar = toRotate.charAt(0);
        int toRotateLength = toRotate.length();
        toRotate = toRotate.substring(1, toRotateLength);
        return toRotate + firstChar;
    }
}
