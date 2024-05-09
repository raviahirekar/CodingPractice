package com.interview.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class InterviewTest3 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("a",2);
		map.put("b",3);
		map.put("c",4);
		map.put("d",1);
		
		map.entrySet().stream()
			.sorted(Collections.reverseOrder((x,y)-> x.getValue().compareTo(y.getValue())))
			.forEach(x -> System.out.println("Key : " +x.getKey() +" value :"+x.getValue()));

	}

}
