package BuyingACar;

public class BuyCar {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int accountValue = 0;
        double oldCarPrice = startPriceOld;
        double newCarPrice = startPriceNew;
        int monthsCount = 0;
        while ((accountValue + oldCarPrice) < newCarPrice) {
            oldCarPrice -= oldCarPrice * (percentLossByMonth * 0.01);
            newCarPrice -= newCarPrice * (percentLossByMonth * 0.01);
            accountValue += savingperMonth;
            if (monthsCount % 2 == 0)
                percentLossByMonth += 0.5;
            monthsCount++;
        }
        int[] answer = {monthsCount, (int) Math.round((accountValue + oldCarPrice - newCarPrice))};
        return answer;
    }
}
