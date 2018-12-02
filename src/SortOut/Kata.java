package SortOut;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Kata {
    public static int[] menFromBoys(final int[] values) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int curr: values){
            if (curr%2 == 0 && !even.contains(curr)){
                even.add(curr);
            }
            else if (curr%2 != 0 && !odd.contains(curr))
                odd.add(curr);
        }
        Collections.sort(odd, Comparator.reverseOrder());
        Collections.sort(even);
        even.addAll(odd);
        return even.stream().mapToInt(i->i).toArray();
    }
}
