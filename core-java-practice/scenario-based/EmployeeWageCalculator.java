import java.util.Random;

public class EmployeeWageCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Calculator");

        // UC 1: Check whether employee is present or absent using Random
        Random r = new Random();
        int isPresent = r.nextInt(2);   // 0 = Absent, 1 = Present

        if (isPresent == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }

        if (isPresent == 1) {

            // Common wage assumption used in all calculations
            int wagePerHour = 20;
            int workingHours = 0;

            // UC 2: Calculate daily employee wage for full-time employee
            // UC 3: Calculate daily employee wage for part-time employee
            // UC 4: Solve UC 2 and UC 3 using switch case statement
            int empType = r.nextInt(2); // 0 = Full Time, 1 = Part Time
             System.out.println("Enter 0 for full time and 1 for full time");
            switch (empType) {
                case 0:
                    workingHours = 8;   // full-time working hours
                    System.out.println("Employee is Full Time");
                    break;

                case 1:
                    workingHours = 8;   // part-time working hours (as per problem statement)
                    System.out.println("Employee is Part Time");
                    break;
            }

            int dailyWage = wagePerHour * workingHours;
            System.out.println("Daily Wage: " + dailyWage);

            // UC 5: Calculate wages for a month assuming 20 working days
            int workingDaysInMonth = 20;
            int monthlyWage = dailyWage * workingDaysInMonth;
            System.out.println("Monthly Wage: " + monthlyWage);

            // UC 6: Calculate wages till total working hours or days reach a limit
            int totalWorkingHours = 0;
            int totalWorkingDays = 0;
            int maxWorkingHours = 100;
            int maxWorkingDays = 20;
            int totalWage = 0;

            while (totalWorkingHours < maxWorkingHours &&
                   totalWorkingDays < maxWorkingDays) {

                totalWorkingDays++;
                totalWorkingHours += workingHours;
                totalWage += dailyWage;
            }

            System.out.println("Total Wage till condition reached: " + totalWage);

        } else {
            // Employee absent case
            System.out.println("No wage as employee is absent.");
        }
    }
}
