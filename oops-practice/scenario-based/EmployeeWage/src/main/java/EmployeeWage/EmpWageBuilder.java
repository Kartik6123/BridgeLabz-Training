package EmployeeWage;

import java.util.*;

public class EmpWageBuilder implements IEwageBuilder {

    private ArrayList<CompanyEmpWage> companyList;

    public EmpWageBuilder(){
        companyList=new ArrayList<>();
    }

    public void addCompany(String name,int wagePerHour,int maxDays,int maxHours){

        CompanyEmpWage company=new CompanyEmpWage(name,wagePerHour,maxDays,maxHours);

        companyList.add(company);
    }

    private int computeCompanyWage(CompanyEmpWage company){

        int totalHours=0;
        int totalDays=0;
        int totalWage=0;

        while(totalDays < company.maxDays && totalHours < company.maxHours){

            int empCheck=(int)(Math.random()*3);

            int empHours=0;

            switch(empCheck){

                case 1:
                    empHours=8;
                    break;

                case 2:
                    empHours=4;
                    break;

                default:
                    empHours=0;
            }

            totalHours+=empHours;

            int dailyWage=empHours*company.wagePerHour;

            company.dailyWages.add(dailyWage);

            totalWage+=dailyWage;

            totalDays++;
        }

        return totalWage;
    }

    public void computeWage(){

        for(CompanyEmpWage company:companyList){

            int totalWage=computeCompanyWage(company);

            company.setTotalWage(totalWage);
        }
    }

    public int getTotalWage(String companyName){

        for(CompanyEmpWage company:companyList){

            if(company.companyName.equals(companyName))
                return company.getTotalWage();
        }

        return -1;
    }

    public void displayAll(){

        for(CompanyEmpWage company:companyList){

            System.out.println("Company: "+company.companyName);
            System.out.println("Daily Wages: "+company.dailyWages);
            System.out.println("Total Wage: "+company.totalWage);
            System.out.println();
        }
    }
}
