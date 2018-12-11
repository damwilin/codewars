package ShortestWord;

public class Kata {
    public static int findShort(String s) {
        String[] sArray =s.split(" ");
        int minLength=sArray[0].length();
        for (int i=1; i< sArray.length; i++){
            if (sArray[i].length()<minLength)
                minLength = sArray[i].length();
        }
        return minLength;
    }
}
