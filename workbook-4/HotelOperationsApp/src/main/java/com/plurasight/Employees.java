package com.plurasight;

public class Employees {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employees(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
        return hoursWorked;
    }

    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOverTimeHours() * payRate * 1.5);
        //return hoursWorked * payRate;
    }

    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        }else {
            return setHoursWorked(40);
        }

    }

    public double getOverTimeHours(){
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }else {
            return 0;
        }
    }
}
