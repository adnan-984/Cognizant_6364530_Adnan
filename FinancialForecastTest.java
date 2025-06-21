// FinancialForecastTest.java

class FinancialForecast {
    public static double forecastProfit(double[] pastProfits) {
        double total = 0;
        for (double profit : pastProfits) {
            total += profit;
        }
        return total / pastProfits.length;
    }
}

public class FinancialForecastTest {
    public static void main(String[] args) {
        double[] pastProfits = {12000.50, 15000.75, 13000.00, 16000.25, 14000.60};

        double forecast = FinancialForecast.forecastProfit(pastProfits);
        System.out.printf("Forecasted average monthly profit: %.2f\n", forecast);
    }
}
