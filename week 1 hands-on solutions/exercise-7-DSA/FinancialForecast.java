package com.forecast;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        } 
        return calculateFutureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double presentValue = 10000.0; // Initial investment
        double annualGrowthRate = 0.10; // 10% growth rate
        int forecastYears = 5; // Number of years to predict

        double result = calculateFutureValue(presentValue, annualGrowthRate, forecastYears);

        System.out.println("Predicted value after " + forecastYears + " years: ₹" + result);
    }
}