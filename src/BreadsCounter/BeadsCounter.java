package BreadsCounter;

public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
        if (nBlue<=1)
            return 0;
        return (nBlue-1)*2;
    }
}
