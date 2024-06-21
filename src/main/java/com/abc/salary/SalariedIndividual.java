package com.abc.salary;

public interface SalariedIndividual {

     int getDaysWorkedInMonth();
     int getCommercialsPerDay();

     public default double calculate() {
          int noOfDaysWork = this.getDaysWorkedInMonth();
          int costPerDay = this.getCommercialsPerDay();

          int totalCost = noOfDaysWork * costPerDay;
          int totalCostAfterPt = totalCost - 200;
          double tds = 0.1 * totalCostAfterPt;

          return totalCostAfterPt - tds;
     }
}
