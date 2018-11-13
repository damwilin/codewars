package OnesAndZeros;

import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int binarySize = binary.size();
        int sum=0;
        for (int i=0; i< binarySize; i++){
            if (binary.get(i) ==1){
                int power = binarySize-1-i;
                sum+=(int)Math.pow(2, power);
            }
        }
        return sum;
    }
}
