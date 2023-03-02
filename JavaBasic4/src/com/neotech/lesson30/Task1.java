package com.neotech.lesson30;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * Create a map of a building. Store floor number and it is associated company
		 * name. (Example: 1=Google, 2=Apple, 3=Neotech etc..). Insert 7 entries with
		 * duplicate keys and values. 
		 * - Check how many entries you have? 
		 * - Update company on a 4th floor 
		 * - Remove company on the 7th floor 
		 * - Print your map
		 */
		
	
		Map<Integer, String> building = new LinkedHashMap<>();
		
		building.put(1, "Google");
		building.put(2, "Apple");
		building.put(3, "Neotech");
		building.put(4, "Microsoft");
		building.put(5, "Yahoo");
		building.put(6, "LinkedIn");
		building.put(7, "Dell");
		
		
		System.out.println(building);
		
		//how many entries do we have?
		System.out.println("We have " + building.size()  + " entries.");
		
		//update the company with key 4
		building.replace(4, "Indeed");
		//	building.put(4, "Indeed");
		System.out.println(building);
		
		
		//what happens if we try to do this:
		//no error, and it also does not add it as a new pair
		building.replace(8, "SUNY");
		System.out.println(building);
		
		//remove company on the 7th floor
		building.remove(7);
		System.out.println(building);//print your map
		
		System.out.println("-----------------");
		//can we insert another entry having a duplicate key?
		building.put(4, "HP");
		building.put(4, "Lenovo");
		System.out.println(building);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
