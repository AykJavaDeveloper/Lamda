package com.example.LambdaExpressions;

import lombok.Data;

public class SeniorJavaDeveloper extends JavaDeveloper {
    private String name;
    private double salary;

    public SeniorJavaDeveloper(String name, double salary) {
        super(name, salary);
    }

    public double getSalary() {
        return salary + 100_000;
    }
}
