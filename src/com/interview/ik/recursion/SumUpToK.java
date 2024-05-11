package com.interview.ik.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class SumUpToK {

	public static Long calculateSum(LinkedList<Long> slate) {
		
		return slate.stream().mapToLong(x -> x.intValue()).sum();
	}
	
	public static void helper(int pos ,ArrayList<Long> arr ,LinkedList<Long> slate,Long sum ,ArrayList<ArrayList<Long>> result) {
		
		if(slate.size()> 0 && calculateSum(slate) == sum) {
			result.add(new ArrayList<Long>(slate));
			return;
		}
		if(pos == arr.size()) {
			return;
		}
		slate.add(arr.get(pos));
		helper(pos+1,arr,slate , sum, result);
		slate.removeLast();
		helper(pos+1,arr,slate , sum, result);
		
		
	}
	
	public static void main(String[] args) {
		ArrayList<Long> list = new ArrayList<Long>(Arrays.asList(3l,6l,8l,-4l,2l,5l,7l,1l));
		Long k = 0l;
		
		ArrayList<ArrayList<Long>> result = new ArrayList<ArrayList<Long>>();
		
		helper(0, list, new LinkedList<Long>(), k, result);
		
		result.forEach(x -> System.out.println(x.toString()));

	}

}
