package com.interview.test;

import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class InterviewTest7 {

	public static void main(String[] args) {
		String input = "Java Articles are Awesome";
		
		HashSet<Character> chars = new HashSet<Character>();
		Optional<Character> result = input.chars().mapToObj(e -> (char)e)
		.filter(e -> !chars.add(e)).findFirst();
		System.out.println("first char "+result.get());
		

	}

}
