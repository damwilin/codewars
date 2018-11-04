package FromTheLargest;

import java.util.Arrays;


public class Solution {

    public static long maxNumber(long n) {
        String nString = String.valueOf(n);
        int[] nArray = new int[nString.length()];
        for (int i=0; i< nString.length(); i++){
            nArray[i] = Character.getNumericValue(nString.charAt(i));
        }
        Arrays.sort(nArray);
        StringBuilder sb = new StringBuilder();
        for (int i=nArray.length-1; i>= 0; i--){
            sb.append(nArray[i]);
        }
        return Long.parseLong(sb.toString());
    }
}
