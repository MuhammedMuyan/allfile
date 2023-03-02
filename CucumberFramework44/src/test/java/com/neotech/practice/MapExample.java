package com.neotech.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new LinkedHashMap<>();
		
		
		map.put("first", "Hakan");
		map.put("lastname", "Uysal");
		map.put("age", "27");
		
		
		
		System.out.println(map);
		
		
		String firstname = map.get("firsname");
		
		
		
		
		
		
		

	}

}
