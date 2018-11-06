package EasyBalanceChecking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EasyBal {
    public static void main (String[] args){
        System.out.println(round(415.24/8,2));
    }

    public static String balance(String book) {
        double originalBalance;
        double currBalance;
        StringBuilder sb = new StringBuilder();
        //Clean
        book = book.replaceAll("[^\\w\\n\\.\\s]", "");
        List<String> bookList = Arrays.asList(book.split("\n"));
        originalBalance = round(Double.parseDouble(bookList.get(0)),2);
        currBalance = originalBalance;

        //Create list of products
        List<Product> productList = new ArrayList<>();
        for (int i = 1; i < bookList.size(); i++) {
            productList.add(new Product(bookList.get(i)));
        }
        //Create answer
        sb.append("Original Balance: ");
        sb.append(format(originalBalance) + "\\r\\n");
        for (Product currProduct : productList) {
            sb.append(currProduct.getCheckNumber() + " ");
            sb.append(currProduct.getCategory() + " ");
            sb.append(format(currProduct.getCheckAmount()) + " ");
            sb.append("Balance ");
            currBalance -= currProduct.getCheckAmount();
            sb.append(format(round(currBalance,2)) + "\\r\\n");
        }
        double totalExpense = round(originalBalance - currBalance,2);
        double averageExpense = round(totalExpense/productList.size(),2);
        sb.append("Total expense  " + format(totalExpense) + "\\r\\n");
        sb.append("Average expense  " + format(averageExpense));
        return sb.toString().replaceAll(",", ".");
    }
    private static double round(double value, int places){
        value = value * Math.pow(10,places);
        value = Math.round(value);
        value = value/ Math.pow(10,places);
        return value;
    }

    private static String format(double value){
        return String.format("%.2f", value);
    }

    private static class Product {
        private String checkNumber;
        private String category;
        private double checkAmount;

        public String getCheckNumber() {
            return checkNumber;
        }

        public String getCategory() {
            return category;
        }

        public double getCheckAmount() {
            return checkAmount;
        }

        public Product(String productInfo) {
            String[] productInfoArray = productInfo.split(" +");
            if (productInfoArray.length == 3) {
                checkNumber = productInfoArray[0];
                category = productInfoArray[1];
                checkAmount = Double.parseDouble(productInfoArray[2]);
            }

        }

    }
}
