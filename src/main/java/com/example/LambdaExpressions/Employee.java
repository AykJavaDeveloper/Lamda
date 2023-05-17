package com.example.LambdaExpressions;

import lombok.Data;

@Data
public abstract class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract double getSalary();
}
