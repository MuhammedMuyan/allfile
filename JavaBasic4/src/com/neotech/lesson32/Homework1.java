package com.neotech.lesson32;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Homework1 {

	
	public static void main(String[] args) {
		/*
		 * Create a Map that will store Employee name and salary. Write a logic to
		 * retrieve an employee who gets the highest salary. Output should be in the
		 * below format - John Smith=$100000
		 */

		Map<String, Integer> emp = new HashMap<>();
		
		emp.put("John", 75000);
		emp.put("Jack", 125000);
		emp.put("Jane", 125000);
		emp.put("Brian", 50000);
		
		
		// find the largest value in map
		Collection<Integer> salaries = emp.values();
 		
		int max = 0;
		
		// use a enchanced for loop
		for (int s: salaries) {
			if (s > max) {
				max =s;
			}
		}
		
		System.out.println("Maxium salary is: " + max);
		
		
		// 2 way
		
	 //	System.out.println(Collections.max(emp.values()));
		
		
		Iterator<Entry<String, Integer>> it = emp.entrySet().iterator();
		Entry<String, Integer> maxEntry = it.next();

		while (it.hasNext()) {
			Entry<String, Integer> entry = it.next();

			if (entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}
		}
	
		
		System.out.println("The maximum value entry is: " + maxEntry.getKey() + " =$" + maxEntry.getValue());
		// System.out.println(maxEntry);
		
		
		
		// task: print both Jack and Jane (hint: dont print an entry,
				// print another HashMap
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
