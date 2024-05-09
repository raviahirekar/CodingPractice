package com.interview.test;

import java.util.HashMap;

public class InterviewTest10 {

	public static void main(String[] args) {

		String input = "aabbaaaacccccbbbcc";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		int charactorCount = 1;
		Character previousCharactor = null;
		for (int i = 0; i < input.length(); i++) {
			Character currentCharactor = input.charAt(i);
			if (previousCharactor != null && !previousCharactor.equals(currentCharactor)) {
				int previousCount = map.getOrDefault(previousCharactor, 0);
				if (previousCount < charactorCount) {
					map.put(previousCharactor, charactorCount);
					charactorCount++;
				}
				charactorCount=1;
			} else {
				charactorCount++;

			}
			previousCharactor = currentCharactor;

		}

		map.forEach((x, y) -> System.out.println("Charactor count :- " + x + " Count :- " + y));

	}

}
