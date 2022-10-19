package com.estudos.entities;

public class Employee {
    public String name;
    public Double grossSalary;
    public Double tax;

    public void printEmployee() {
        System.out.println("Employee data:");
        System.out.println("name: " + this.name + " salary: $" + netSalary());
    }

    public Double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(Double percentage) {
        this.grossSalary += grossSalary * (percentage / 100);
    }
}
