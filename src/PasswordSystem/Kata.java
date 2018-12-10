package PasswordSystem;

public class Kata {
    public static String helpZoom(int[] key) {
        for (int a: key)
            System.out.print(a + " ");
        for (int i=0; i<=key.length/2; i++){
            if (key[i]!=key[key.length-1-i])
                return "No";
        }
        return "Yes";
    }
}
