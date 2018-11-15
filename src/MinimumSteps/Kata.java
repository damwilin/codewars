package MinimumSteps;

import java.util.Arrays;

public class Kata {
    public static int minimumSteps(int[] numbers, int k) {
        Arrays.sort(numbers);
        int result=0;
        int countOfSteps=0;
        for (int i=0; i< numbers.length; i++){
            result += numbers[i];
            if (result >= k){
                countOfSteps = i;
                break;
            }
        }
        return countOfSteps;
    }
}
