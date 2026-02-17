package EmployeeWage;

import java.util.*;

public class CompanyEmpWage {

    public String companyName;
    public int wagePerHour;
    public int maxDays;
    public int maxHours;
    public int totalWage;

    public ArrayList<Integer> dailyWages;

    public CompanyEmpWage(String companyName,int wagePerHour,int maxDays,int maxHours){

        this.companyName=companyName;
        this.wagePerHour=wagePerHour;
        this.maxDays=maxDays;
        this.maxHours=maxHours;

        dailyWages=new ArrayList<>();
        totalWage=0;
    }

     

	public void setTotalWage(int totalWage){
        this.totalWage=totalWage;
    }

    public int getTotalWage(){
        return totalWage;
    }



	 
}
