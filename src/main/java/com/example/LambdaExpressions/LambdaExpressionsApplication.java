package com.example.LambdaExpressions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Stream;

public class LambdaExpressionsApplication {

    public static void main(String[] args) {
//		Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10);
//		numbers.filter(number -> number % 2 == 0).forEach(System.out::println);

//		Arrays.stream(array).filter(number -> number % 2 == 0).forEach(System.out::println);

//		Integer iterator = 2;
//		Stream.iterate(iterator, n -> n + 2).forEach(System.out::println);

//		List<Integer> numbers = new ArrayList<>();
//		Stream.generate(()-> Math.round(Math.random() * 10)).filter(value -> value <= 5).forEach(System.out::println);


//		Optional<Integer> number = Arrays.stream(array).min(Comparator.comparing(Integer::intValue));
//		System.out.println(number);

//        List<Employee> listEmployees = new ArrayList<>();
//        Employee employeeFirst = new Employee("Robert", 100_000);
//        listEmployees.add(new Employee("Oksana", 70_000));
//        listEmployees.add(employeeFirst);
//        listEmployees.add(new Employee("Misha", 750_000));
//        listEmployees.add(new Employee("Aik", 300_000));
//
//        listEmployees.stream()
//                .map(employee -> employee.getSalary())
//                .filter(salary -> salary >= 100_000)
//                .reduce((employeeOne, employeeTwo) -> employeeOne + employeeTwo)
//                .ifPresent(System.out::println);

//        Stream.of("d", "f").forEach(System.out::println);

        List<JavaDeveloper> listJavaDeveloper = new ArrayList<>();
//        listEmployee.add(new Manager("Lesha", 70_000));
        listJavaDeveloper.add(new JavaDeveloper("Misha", 500_000));
        listJavaDeveloper.add(new JavaDeveloper("Aik", 490_000));

        List<Manager> managerList = new ArrayList<>();
        managerList.add(new Manager("Olga", 50_000));
        managerList.add(new Manager("Ira", 65_000));

        System.out.println(Calculate.calculateEmployee(managerList));
    }
}
