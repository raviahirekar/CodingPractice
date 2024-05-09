package com.interview.test;

import java.util.LinkedHashMap;

public class InterviewTest9 {

	public static void main(String[] args) {
		
		String name = "ravindra";
		
		LinkedHashMap<Character, Integer> charactoCount = new LinkedHashMap<Character, Integer>();
		
		for(int i =0 ; i < name.length();i++) {
			Character alphabet = name.charAt(i);
			Integer count = charactoCount.getOrDefault(alphabet, 0);
			charactoCount.put(alphabet, ++count);
			
		}
		
		for (Character alphabet : charactoCount.keySet()) {
			Integer count = charactoCount.get(alphabet);
			if(count == 1) {
				System.out.println(" result :- "+alphabet);
				break;
			}
			
			
		}

	}

}
