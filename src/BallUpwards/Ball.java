package BallUpwards;

public class Ball {

    public static int maxBall(int v0) {
        double g = 9.81;
        double v = convertToMpS(v0);
        double time = 0.1;
        double maxH=0;
        int i=1;
        while (true) {
            double currH = v * time * i - 0.5 * g * time * i * time * i;
            if (currH>maxH)
                maxH = currH;
            else
                return i -1;
            i++;
        }
    }

    private static double convertToMpS(double toConvert) {
        return toConvert * 10 / 36;
    }
}
