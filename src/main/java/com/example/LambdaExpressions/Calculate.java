package com.example.LambdaExpressions;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
public class Calculate {
    public static List calculateEmployee(List<? extends Employee> listEmployee) {
        return listEmployee;
    }
}
