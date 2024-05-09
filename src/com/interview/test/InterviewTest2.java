package com.interview.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InterviewTest2 {
	
	public static void main(String[] args) {
		
		String input = "rAvindra";
		
		HashSet<Character> ovelCharactor = new HashSet<Character>();
		ovelCharactor.add('a');
		ovelCharactor.add('e');
		ovelCharactor.add('i');
		ovelCharactor.add('o');
		ovelCharactor.add('u');
		Map<Integer, Character> map = new HashMap<Integer, Character>();
		
		
		 IntStream.rangeClosed(0, input.length()-1).forEach( i -> {
			 
		 if(ovelCharactor.contains(Character.toLowerCase(input.charAt(i)))) {
			 map.put(i, input.charAt(i));
		 }
	});
		 
		 map.forEach((key,value) -> System.out.println("Pos :"+ key + " Char : "+ value));
	}

}
