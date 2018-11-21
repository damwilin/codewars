package GetTheMiddleCharacter;

public class Kata {
    public static String getMiddle(String word) {
        int center=word.length()/2;
        return (word.length()%2==0) ? word.substring(center-1,center+1 ) : word.substring(center,center+1);
    }
}
