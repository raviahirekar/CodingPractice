package com.interview.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class A {

	public static void methodOne() {
		System.out.println("A");
	}

}

class B extends A {
	public static void methodOne() {
		System.out.println("B");
	}
}

public class InterviewTest8 {

	public static void main(String[] args) {
		A a = new B();
		//a.methodOne();
		
		String stmt = "Program trading refers to the use Of computer generated algorithms to trade a basket of stocks in large volumes and sometimes with great frequency";

		List<Character> ovels = Arrays.asList('a','e','i','o','u');

		List<String> result = Arrays.stream(stmt.split(" ")).filter( word ->ovels.contains(Character.toLowerCase(word.charAt(0)))).collect(Collectors.toList());
		
		result.forEach(e -> System.out.println(e));

	}

}
