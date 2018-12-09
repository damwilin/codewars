package QuickSum;

import java.util.regex.Pattern;

public class QuickSum {
    public int quicksum(String packet){
        Pattern pattern = Pattern.compile("[^A-Z ]");
        if (packet.equals("") || pattern.matcher(packet).find())
            return 0;
        int sum=0;
        for (int i=0; i<packet.length();i++){
            char currChar = packet.charAt(i);
            if (Character.isUpperCase(currChar)){
                sum += (i+1)* ((int) currChar -64);
            }
        }
        return sum;
    }
}
