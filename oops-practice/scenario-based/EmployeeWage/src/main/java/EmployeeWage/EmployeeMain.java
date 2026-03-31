package EmployeeWage;

import java.util.*;

public class EmployeeMain {

    public static void main(String args[]){

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        Scanner sc=new Scanner(System.in);

        EmpWageBuilder builder=new EmpWageBuilder();

        System.out.println("Enter number of companies:");

        int n=sc.nextInt();

        for(int i=0;i<n;i++){

            System.out.println("Enter company name:");
            String name=sc.next();

            System.out.println("Enter wage per hour:");
            int wage=sc.nextInt();

            System.out.println("Enter max working days:");
            int days=sc.nextInt();

            System.out.println("Enter max working hours:");
            int hrs=sc.nextInt();

            builder.addCompany(name,wage,days,hrs);
        }

        builder.computeWage();

        builder.displayAll();

        System.out.println("Enter company name to get total wage:");

        String query=sc.next();

        System.out.println("Total Wage = "+builder.getTotalWage(query));
    }
}
