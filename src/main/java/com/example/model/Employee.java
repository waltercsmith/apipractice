package com.example.model;

public class Employee {

    private String employeeId;


    private String firstname;

    private String demoSsn;


    public Employee() {

    }

    public Employee(String employeeId,String firstname, String demoSsn) {
        this.employeeId = employeeId;
        this.firstname = firstname;
        this.demoSsn = demoSsn;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getDemoSsn() {
        return demoSsn;
    }

    public void setDemoSsn(String demoSsn) {
        this.demoSsn = demoSsn;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }


}
