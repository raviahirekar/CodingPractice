package com.interview.ik.recursion;

import java.util.ArrayList;

public class WellFormParanthesis {
	
	public static void helper(int left,int right,int n ,String slate,ArrayList<String> result) {
		
		if(right == n) {
			result.add(slate);
		} else {
            if (left > right) {
                slate = slate +')';
                helper(left, right+1, n,slate,
                                  result);
                slate = slate.substring(0, slate.length()-1);
            }
            if (left < n) {
            	slate = slate +'(';
            	 helper(left+1 , right, n,slate,
                         result);
            	 slate = slate.substring(0, slate.length()-1);
            }
        }
		
	}

	public static void main(String[] args) {
		
		int n=3;
		ArrayList<String> list = new ArrayList<String>();
		helper(0, 0, n, "", list);
		list.forEach(x -> System.out.println(x));

	}

}
