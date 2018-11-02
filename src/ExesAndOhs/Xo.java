package ExesAndOhs;

public class Xo {
    public static boolean getXO (String str) {
        int oCount = 0;
        int xCount = 0;
        for (char c : str.toLowerCase().toCharArray()){
            if (c == 'o')
                oCount++;
            else if (c == 'x')
                xCount++;
        }
        return oCount == xCount;
    }
}
