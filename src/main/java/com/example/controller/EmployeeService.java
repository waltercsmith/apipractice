package com.example.controller;


import com.example.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeService {

    Employee employee;

    @GetMapping("{employeeId}")
    public Employee getEmployeeDetails(@PathVariable String employeeId) {

        return employee;
        //return new Employee("1","Gene","2222222") ;}

    }

//  This is my Post/Create HTTP method
    @PostMapping
    public String createEmployeeDetails(@RequestBody Employee employee) {

        this.employee = employee;
        return "Created Employee Details Successful";
    }

    @PutMapping
    public String updateEmployeeDetals(@RequestBody Employee employee){

        this.employee = employee;
        return "Update Employee Details Successful";
    }

    @DeleteMapping("{employeeId}")
    public String deleteEmployeeDetails(String employeeId){

        this.employee = null;
        return  "Deleted Employee Details Successful";
    }

}