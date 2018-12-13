package ExpandedForm;

import java.util.ArrayList;
import java.util.List;

public class Kata {

    public static String expandedForm(int num) {
        List<Integer> list = new ArrayList<>();
        int i = 1;
        while (num > 0) {
            int div = (int) Math.pow(10, i);
            int curr = num % div;
            if (curr != 0) {
                list.add(curr);
                num -= curr;
            }
            i++;
        }
        StringBuilder sb= new StringBuilder();
        for (int j= list.size()-1; j>=0; j--){
            sb.append(list.get(j));
            if (j!=0)
                sb.append(" + ");
        }
        return sb.toString();
    }
}
