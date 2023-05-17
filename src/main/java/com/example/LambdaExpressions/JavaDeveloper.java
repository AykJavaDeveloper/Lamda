package com.example.LambdaExpressions;

public class JavaDeveloper extends Employee {
    private String name;
    private double salary;

    public JavaDeveloper(String name, double salary) {
        super(name, salary);
        this.salary = salary;
        this.name = name;
    }

    @Override
    public double getSalary() {
        return salary = salary + 10_000;
    }
}
