package com.interview.test;

import java.util.stream.Collectors;

public class InterviewTest11 {

	public static void main(String[] args) {

		String input = "ravindra";

		input.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet()
				.stream().sorted((x, y) -> x.getKey().compareTo(y.getKey()))
				.forEach(x -> System.out.println("Alphabet :- " + x.getKey() + " Count:-  " + x.getValue()));

	}

}
