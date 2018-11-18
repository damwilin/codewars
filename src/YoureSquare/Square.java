package YoureSquare;

public class Square {
    public static boolean isSquare(int n) {
        return n==0 || Math.sqrt(n)%(int)Math.sqrt(n) ==0 ? true : false;
    }
}
