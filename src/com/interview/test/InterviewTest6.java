package com.interview.test;

import java.util.Scanner;

public class InterviewTest6 {
	
	public static boolean isPalindrom(String input) {
		return helper(input,0,input.length()-1);
	}

	private static boolean helper(String input, int i, int j) {
		if(i == j) {
			return true; 
		}
		if(input.charAt(i) == input.charAt(j)) {
			return helper(input,i+1,j-1);
		}
		
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		System.out.println("Is palindrom : "+isPalindrom(input));

	}

}
