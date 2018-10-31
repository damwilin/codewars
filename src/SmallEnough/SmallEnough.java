package SmallEnough;

import java.util.Arrays;

public class SmallEnough {

    public static boolean smallEnough(int[] a, int limit) {
        return  (Arrays.stream(a).max().orElse(0) <= limit) ? true : false;
    }

}
