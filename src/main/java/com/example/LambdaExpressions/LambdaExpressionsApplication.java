package com.example.LambdaExpressions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Stream;

public class LambdaExpressionsApplication {

	public static void main(String[] args) {
//		Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10);
//		numbers.filter(number -> number % 2 == 0).forEach(System.out::println);
//
		Integer[] array = {3, 4, 5, 1};
//		Arrays.stream(array).filter(number -> number % 2 == 0).forEach(System.out::println);

//		Integer iterator = 2;
//		Stream.iterate(iterator, n -> n + 2).forEach(System.out::println);

//		List<Integer> numbers = new ArrayList<>();
//		Stream.generate(()-> Math.round(Math.random() * 10)).filter(value -> value <= 5).forEach(System.out::println);
		Optional<Integer> number = Arrays.stream(array).min(Comparator.comparing(Integer::intValue));
		System.out.println(number);
	}
}
