package com.interview.ik.recursion;

import java.util.ArrayList;

public class PalindromicDecomposition {

	static boolean isPalindrome(String s) {

		int i = 0;
		int j = s.length() - 1;

		while (i <= j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}

		}

		return true;

	}
	
	
	public static void helper(String s,String slate,int i,String lastString, ArrayList<String> result){
	       
	       if(i == s.length()){
	           if(isPalindrome(lastString)){
	               result.add(slate);
	           }
	           return;
	       }
	       
	      //concat
	       slate =slate+s.charAt(i);
	       helper(s, slate, i+1, lastString+s.charAt(i), result);
	       slate = slate.substring(0, slate.length()-1);
	       if(!isPalindrome(lastString)) {
	    	   return;
	       }
	       slate =slate+"|"+s.charAt(i);
	     //  lastString= lastString+s.charAt(i);
	       helper(s, slate, i+1, s.charAt(i)+"", result);
	       slate = slate.substring(0, slate.length()-2);
	       
	   }

	public static void main(String[] args) {
		String input = "abraca";
		ArrayList<String> result = new ArrayList<String>();
		helper(input, input.charAt(0)+"", 1,input.charAt(0)+"", result);
		
		result.forEach(x -> System.out.println(x));

	}

}
