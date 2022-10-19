package com.estudos;

import com.estudos.entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Type employee's name:");
        employee.name = sc.nextLine();
        System.out.println("Type employee's salary:");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Type employee's tax value:");
        employee.tax = sc.nextDouble();

        employee.printEmployee();

        System.out.println("Which percentage to increase salary?");
        employee.increaseSalary(sc.nextDouble());

        employee.printEmployee();
    }
}