package FlattenAndSortAnArray;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static int[] flattenAndSort(int[][] array) {
        List<Integer> flatten = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                flatten.add(array[i][j]);
            }
        }
        //bubble sort
        for (int i = 0; i < flatten.size(); i++) {
            for (int j = 0; j < flatten.size() - 1 - i; j++) {
                if (flatten.get(j) > flatten.get(j + 1)) {
                    int temp = flatten.remove(j);
                    flatten.add(j, flatten.get(j));
                    flatten.remove(j + 1);
                    flatten.add(j + 1, temp);
                }
            }
        }
        return flatten.stream().mapToInt(i -> i).toArray();
    }
}
