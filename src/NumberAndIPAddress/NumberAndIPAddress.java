package NumberAndIPAddress;

public class NumberAndIPAddress {

    public static String numberAndIPaddress(String s) {
        if (isDecimal(s)) {
            String binaryString = convertToBinaryString(s, 32);
            String[] splittedBinaryString = splitTo8bit(binaryString);
            StringBuilder decimalStringBuilder = new StringBuilder();
            for (int i = 0; i < splittedBinaryString.length; i++) {
                decimalStringBuilder.append(convertToDecimalNumber(splittedBinaryString[i]));
                if (i != splittedBinaryString.length - 1)
                    decimalStringBuilder.append(".");
            }
            return decimalStringBuilder.toString();
        } else {
            StringBuilder binaryStringBuilder = new StringBuilder();
            for (String c : convertToStringArray(s)) {
                binaryStringBuilder.append(convertToBinaryString(c, 8));
            }
            return convertToDecimalNumber(binaryStringBuilder.toString());

        }
    }

    private static String[] splitTo8bit(String toSplit) {
        String[] splitted = new String[4];
        int startIndex = 0;
        int endIndex = 8;
        for (int i = 0; i < splitted.length; i++) {
            splitted[i] = toSplit.substring(startIndex, endIndex);
            startIndex += 8;
            endIndex += 8;
        }
        return splitted;
    }

    private static boolean isDecimal(String s) {
        return s.contains(".") ? false : true;
    }

    private static String[] convertToStringArray(String s) {
        String[] stringArray = s.split("[.]");
        return stringArray;
    }

    private static String convertToBinaryString(String toConvertString, int bitSize) {
        long toConvert = Long.parseLong(toConvertString);
        StringBuilder binaryStringBuilder = new StringBuilder();
        for (int i = bitSize - 1; i >= 0; i--) {
            long currPow = (long) Math.pow(2, i);
            if (toConvert >= currPow) {
                binaryStringBuilder.append("1");
                toConvert = (toConvert % currPow);
            } else
                binaryStringBuilder.append("0");
        }
        return binaryStringBuilder.toString();
    }

    private static String convertToDecimalNumber(String binaryString) {
        long decimalNumber = 0;
        int currPosition = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            long currPow = (long) Math.pow(2, i);
            if (binaryString.toCharArray()[currPosition] == '1') {
                decimalNumber += currPow;
            }
            currPosition++;
        }
        return String.valueOf(decimalNumber);
    }
}
