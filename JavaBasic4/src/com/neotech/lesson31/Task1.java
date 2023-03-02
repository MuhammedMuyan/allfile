package com.neotech.lesson31;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Task1 {

	public static void main(String[] args) {
		
		// array of cities
	 String[] cities = {"Paris", "Moscow", "Toronto", "Milano", "Denver", "crimea"};
		
		// create a map with as the key 
	 Map<String, Integer> map = new TreeMap<>();
		
	
	 for(String city : cities) {
		 map.put(city, city.length());
	 }
		System.out.println();
		
		
		// usong iteretor
		
		
		
	Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
