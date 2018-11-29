package AreTheyTheSame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        //validate inputs
        if (a == null || b == null || (a.length == 0 && b.length!=0))
            return false;
        List<Integer> aList = powList(parseToList(a));
        List<Integer>bList = parseToList(b);
        Collections.sort(aList);
        Collections.sort(bList);
        for (int i=0;i<aList.size();i++){
            if (!aList.get(i).equals(bList.get(i))){
                return false;
            }
        }
        return true;
    }
    private static List<Integer> parseToList(int[] toParse){
        List<Integer> list = new ArrayList<>();
        for (int a : toParse)
            list.add(a);
        return list;
    }
    private static List<Integer> powList(List<Integer>a){
        List<Integer> answer = new ArrayList<>();
        for (int curr: a){
            answer.add((int)Math.pow(curr,2));
        }
        return answer;
    }
}

