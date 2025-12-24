public class BonusZara {
    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        double[][] updatedData = calculateBonus(employeeData);
        display(employeeData, updatedData);
    }
    static int[][] generateEmployeeData() {

        int[][] data = new int[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000; // salary
            data[i][1] = (int) (Math.random() * 10) + 1;       // years of service
        }
        return data;
    }

    static double[][] calculateBonus(int[][] data) {
        // salary, years of service
        double[][] result = new double[10][2];
        for (int i = 0; i < 10; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            // Determine bonus rate based on years of service
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            // Store new salary and bonus in result array
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }
    // Method to display the results
    static void display(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");
        for (int i = 0; i < 10; i++) {
            int oldSalary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
          System.out.println((i + 1) + " " + oldSalary + " " + years + " " + bonus + " " + newSalary);
        }
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
