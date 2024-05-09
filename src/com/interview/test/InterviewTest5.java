package com.interview.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewTest5 {

	public static void main(String[] args) {
		String input = "Ravindra Ahirekar";

		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();

		for (int i = 0; i < input.length(); i++) {
			Character stringChar = input.charAt(i);
			Integer count = charCount.get(stringChar);
			if (count == null) {
				charCount.put(stringChar, 1);
			} else {
				charCount.put(stringChar, ++count);
			}
		}

		charCount.forEach((x, y) -> System.out.println("Charactor :" + x + " " + y));
		

		
		  List<Integer> input1 = Arrays.asList(56, 87,32,14,17,48,49,64,31,68,75,91);
		  
		  Map<Boolean, List<Integer>> result =
		  input1.stream().collect(Collectors.partitioningBy(e -> e%2 ==0 ));
		  
		  result.forEach((x,y) -> System.out.println( (x.equals(true) ? "Even Number : ":"Odd Number : ") +" value :"+y));
		 

	}

}
