package CompareStringsBySumOfChars;

public class CompareStrings {
    //https://www.codewars.com/kata/compare-strings-by-sum-of-chars/train/java

    public static boolean compare(String s1, String s2) {
        if (calculateASCII(s1) == calculateASCII(s2))
            return true;
        return false;
    }

    private static boolean isEmpty(String s){
        if (s.equals("") || s.equals("null") || s.equals("NULL") || s.equals("Nil") || s.equals("None"))
            return true;
        for (Character ch : s.toCharArray()){
            if (!Character.isLetter(ch)){
                return true;
            }
        }
        return false;
    }

    private static int calculateASCII(String s){
        if (isEmpty(s))
            return -1;
        int sum=0;
        for (Character ch : s.toUpperCase().toCharArray()){
            sum+= ch.charValue();
        }
        return sum;
    }

}