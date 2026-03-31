package EmployeeWage;

import java.util.*;
public class Company {

    private ArrayList<EmployeeMain> list;

    public Company() {
        list = new ArrayList<>();
    }

    public void addEmployee(EmployeeMain e) {
        list.add(e);
    }

    public ArrayList<EmployeeMain> getList() {
        return list;
    }
}
