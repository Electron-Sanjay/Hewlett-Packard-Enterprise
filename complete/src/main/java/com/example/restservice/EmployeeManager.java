package com.example.restservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeManager {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeManager(){
        employees.add(new Employee("Sanjay","Gurrapu","Gurrapu10507","sgurrapu97@gmail.com","Java Developer"));
        employees.add(new Employee("puja","Kata","kata10507","hkata@gmail.com","Data Engineer"));
        employees.add(new Employee("Sai Kishore","Suroju","murthy10507","travelmuthy@salem.com","Data Engineer"));
        employees.add(new Employee("Ravi","Redmaaal","maal10507","maalu@maal.com",".NET Developer"));

    }

    public List<Employee> getEmployees(){
        return employees;
    }
}
