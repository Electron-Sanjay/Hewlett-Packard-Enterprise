package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeManager employeeManager;

    @GetMapping("/Employees")
    public List<Employee> employees(){
        return employeeManager.getEmployees();
    }

    @GetMapping("/Employees/{ID}")
    public Optional<Employee>getEmployeeById(@PathVariable("ID") String ID){

        return employeeManager.getEmployeebyID(ID);

    }
}
