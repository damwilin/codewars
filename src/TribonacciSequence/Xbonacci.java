package TribonacciSequence;

import java.util.Arrays;

public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        if (n==0)
            return new double[]{};
        if (n<=3){
            return Arrays.copyOfRange(s,0,n);
        }
        double[] answer = new double[n];
        for (int i=0; i<s.length; i++){
            answer[i] = s[i];
        }
        for (int i=3; i<n; i++){
            answer[i] = answer[i-1] + answer[i-2] + answer[i-3];
        }
        return answer;
    }
}
