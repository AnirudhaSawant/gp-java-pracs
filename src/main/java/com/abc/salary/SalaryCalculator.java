package com.abc.salary;

@Deprecated
public class SalaryCalculator {

    public static double calculate(SalariedIndividual s1) {
        int noOfDaysWork = s1.getDaysWorkedInMonth();
        int costPerDay = s1.getCommercialsPerDay();

        int totalCost = noOfDaysWork * costPerDay;
        int totalCostAfterPt = totalCost - 200;
        double tds = 0.1 * totalCostAfterPt;

        return totalCostAfterPt - tds;
    }
}
