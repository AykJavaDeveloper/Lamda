package com.example.LambdaExpressions;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Comparable implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return 0;
    }

}
