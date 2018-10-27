package CheckThreeAndTwo;

import java.util.stream.Stream;

public class CheckThreeAndTwo {
    //https://www.codewars.com/kata/5a9e86705ee396d6be000091/train/java
    public static boolean checkThreeAndTwo(char[] chars) {
        int[] count = {0, 0, 0};
        for (Character ch : chars) {
            switch (ch) {
                case 'a':
                    count[0]++;
                    break;
                case 'b':
                    count[1]++;
                    break;
                case 'c':
                    count[2]++;
            }
        }
        for (int i : count) {
            if (!(i == 0 || i % 2 == 0 || i % 3 == 0))
                return false;
        }
        return true;
    }
}
