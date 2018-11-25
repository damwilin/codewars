package RuleOfDivisibilityBy7;


public class DivSeven {
    public static long[] seven(long m) {
        int stepCount=0;
        while (m>=100){
            stepCount++;
            m = step(m);
        }
        long[] answer = {m,stepCount};
        return answer;
    }

    private static int getLastDigit(long m) {
        double divided = m / 10.0;
        return (int) Math.round((divided - Math.floor(divided)) * 10);
    }

    private static long step(long m){
        long divisibled = m/10;
        long lastDigit = getLastDigit(m);
        return divisibled - (lastDigit*2);
    }
}