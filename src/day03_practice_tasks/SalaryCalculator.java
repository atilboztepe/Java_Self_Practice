package day03_practice_tasks;

public class SalaryCalculator {
    public static void main(String[] args) {

        double hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6;
        double federalTaxRate = 26;

        double salaryBeforeTax = (hourlyRate * weeklyHours) * 52;
        double federalTax = (salaryBeforeTax * federalTaxRate) / 100;
        double stateTax = (salaryBeforeTax * stateTaxRate) / 100;
        double totalTax = federalTax + stateTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("Federal Tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println("Net income is: $" + salaryAfterTax);
    }
}
