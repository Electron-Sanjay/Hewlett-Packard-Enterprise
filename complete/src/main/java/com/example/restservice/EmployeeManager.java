package com.example.restservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeManager {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeManager(){
        employees.add(new Employee("Gurrapu10507","Sanjay","Gurrapu","sgurrapu97@gmail.com","Java Developer"));
        employees.add(new Employee("kata10507","puja","Kata","hkata@gmail.com","Data Engineer"));
        employees.add(new Employee("murthy10507","Sai Kishore","Suroju","travelmuthy@salem.com","Data Engineer"));
        employees.add(new Employee("maal10507","Ravi","Redmaaal","maalu@maal.com",".NET Developer"));

    }

    public List<Employee> getEmployees(){
        return employees;
    }
    public Optional<Employee> getEmployeebyID(String ID){
        return employees.stream()
                .filter(employee -> employee.getEmployee_id().equals(ID)).findFirst();
    }
}
