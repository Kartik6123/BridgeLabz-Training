import java.util.*;
class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;

        double[] salary = new double[n];
        double[] years = new double[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];
         // Arrays to store salary, years of service, bonus, and new salary
        double totBonus = 0;
        double totOld = 0;
        double totNew = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter salary of employee " + (i + 1));
            salary[i] = sc.nextDouble();

            System.out.println("Enter years of service of employee " + (i + 1));
            years[i] = sc.nextDouble();

            if (salary[i] <= 0 || years[i] < 0) {
                // Invalid input
                System.out.println("Invalid input, enter again");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            // Calculate bonus based on years of service
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
 
            newSalary[i] = salary[i] + bonus[i];
            totBonus += bonus[i];
            totOld += salary[i];
            totNew += newSalary[i];
            //Accumulate totals
        }
        System.out.println("Total Bonus Payout = " + totBonus);
        System.out.println("Total Old Salary = " + totOld);
        System.out.println("Total New Salary = " + totNew);
    }
}
  
