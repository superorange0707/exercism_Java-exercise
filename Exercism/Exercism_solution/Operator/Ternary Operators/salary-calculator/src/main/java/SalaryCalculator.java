public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        double result = (daysSkipped > 5) ? 0.85 : 1;
        return result;
    }

    public int multiplierPerProductsSold(int productsSold) {
        int result = (productsSold >= 20)? 13 : 10;
        return result;
    }

    public double bonusForProductSold(int productsSold) {
        int sum = productsSold * multiplierPerProductsSold(productsSold);
        return sum;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double basic = 1000.00 * multiplierPerDaysSkipped(daysSkipped);
        double bouns = bonusForProductSold(productsSold);
        double sum = basic+bouns;
        double result = (sum > 2000)? 2000 : sum;
        return result;
    }
}
