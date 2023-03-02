package com.neotech.lesson30;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Homework1 {

	 public static void main (String[] args) {
		 
	 
	/*
	 * Create a Set collection in which you need to add names of the countries. 
	 * In this set we want all objects to be sorted in alphabetical order. 
	 * Using 2 different ways retrieve all elements from set.
	 */
	
	
	Set<String> countries = new TreeSet<>();
	
		countries.add("Albania");
	countries.add("Turkiye");
	countries.add("Kosovo");
	countries.add("Spain");
	countries.add("Ecuador");
	countries.add("Azerbaijan");
	
	System.out.println(countries);
	
	
	for (String country : countries)
	{
		System.out.println(country);
	}
	
	System.out.println("-------------------------");
	
	
	// iteretor
	
	Iterator<String> i = countries.iterator();
	
	while(i.hasNext () ) {
		String country = i.next();
		System.out.println();
	}
	
	//indexed for loop
			for (int i1 = 0; i1 < countries.size(); i1 ++)
			{
				//countries.get(i); //In Set, we do not have an index!!!
			}
	
	
		 
	 }	
	
}
