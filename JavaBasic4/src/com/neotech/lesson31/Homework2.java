package com.neotech.lesson31;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Homework2 {

	public static void main(String[] args) {
		
		
		
		Map <String, String> countries = new TreeMap<> ();
		
		countries.put("France", "Paris");
		countries.put("Kosova", "Prishtina");
		countries.put("Turkiye", "Ankara");
		countries.put("Albania", "Tirana");
		countries.put("Italy", "Rome");
		
		System.out.println(countries);
		System.out.println();
		System.out.println(countries.containsKey("Albania"));
		
		System.out.println("Does the map contain Prishtina");
		System.out.println(countries.containsValue("Prishtina"));
	
	
		
		Set<String> keys = countries.keySet();
		
		System.out.println(keys);
		
		for (String country : keys) {
			System.out.println(country + " ");
		}
		System.out.println();
		
		
		
		
		
	//	Iterator<> it = 
		
		
		
		
		
		
		
		
	
	
	}

}
