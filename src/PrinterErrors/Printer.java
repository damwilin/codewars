package PrinterErrors;

public class Printer {
    public static String printerError(String s) {
        String errors = s.replaceAll("[a-m]", "");
        return String.format("%d/%d", errors.length(), s.length());
    }
}
