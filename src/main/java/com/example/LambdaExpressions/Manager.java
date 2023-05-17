package com.example.LambdaExpressions;

public class Manager extends Employee{
    private String name;
    private double salary;
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
