package MultiplesOf3and5;


import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int number) {
        int[] multiplesOf3 = findMultiplesOf(3,number);
        int[] multiplesOf5 = findMultiplesOf(5, number);
        int [] combined = combineArrays(multiplesOf3, multiplesOf5);
        return sumArray(combined);
    }

    private int[] findMultiplesOf(int multipleOf, int range){
        int countOfElements = (range-1)/multipleOf;
        int[] answer = new int[countOfElements];
        for (int i=0; i<countOfElements; i++){
            answer[i]= multipleOf * (i+1);
        }
        return answer;
    }

    private int sumArray(int[] arrayToSum){
        return Arrays.stream(arrayToSum).sum();
    }

    private int[] combineArrays(int [] first, int[] second){
        int[] combined = IntStream.concat(Arrays.stream(first), Arrays.stream(second)).distinct().toArray();
        return combined;
    }
}
