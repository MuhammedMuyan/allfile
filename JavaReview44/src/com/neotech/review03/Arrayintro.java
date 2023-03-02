package com.neotech.review03;

public class Arrayintro {

	public static void main(String[] args) {
		
	
		// 1.way
		int[] arr = new int[4];
		arr[0]= 6;
		arr[1]= 4;
		arr[2]= 9;
		arr[3]= 2;
		
		int sumArr= 0;
		
		for( int i= 0; i<arr.length; i++) {
			
			sumArr += arr[i];
		}
		
		System.out.println(sumArr);
		
		
		System.out.println("=====================================");
		
		
		
		//2.way
		int[] arr2 = {6,4,9,2};
		
		int sumArr2 = 0;
		
		for(int i=0; i<arr2.length; i++) {
			
			sumArr2 += arr2[i];
		}
		
		System.out.println(sumArr2);
		
		System.out.println("==========================================");
		
		
		
		//3.way
        int[] arr3 = {6,4,9,2};
		
		int sumArr3 = 0;
		
		for(int num : arr3) {
			
			sumArr3+=num;
		}
		
		System.out.println(sumArr3);
		
		
		System.out.println("==================================");
		
		
		
		
		//1.way
		String[] animals = {"dog", "cat", "pig"};
		
		for(int i = 0; i<animals.length; i++) {
			
			System.out.print(animals[i] + ", ");
		}
		System.out.println();
		
		System.out.println("=====================================");
		
		
		//2.way
		for(String animal : animals) {
			
			System.out.print(animal + ", ");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
