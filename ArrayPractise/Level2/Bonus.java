import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeCount = 10;
        double[] salaries = new double[employeeCount];
        double[] yearsOfService = new double[employeeCount];
        double[] bonuses = new double[employeeCount];
        double[] newSalaries = new double[employeeCount];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input loop 
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1) + ": ");

            double salary = scanner.nextDouble();
            double years = scanner.nextDouble();

            // Validate salary and years of service
            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input! Salary must be > 0 and years must be >= 0. Please enter again.");
                i--; // Decrement i to repeat this iteration
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        // Calculate bonuses and new salary
        for (int i = 0; i < employeeCount; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02; // 5% if service > 5 years else 2%
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];

            // Accumulate totals
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display the results
        System.out.println("\nEmployee-wise Bonus and New Salary:");
        for (int i = 0; i < employeeCount; i++) {
            System.out.printf("Employee %d - Old Salary: %.2f, Bonus: %.2f, New Salary: %.2f%n", 
                              (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.printf("\nTotal Bonus Payout by Zara: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary (with Bonus): %.2f%n", totalNewSalary);

        scanner.close();
    }
}
