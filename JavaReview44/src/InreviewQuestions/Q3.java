package InreviewQuestions;

import java.util.Arrays;

public class Q3 {
	  // Write a Java Program to print first 10 numbers of Fibonacci series.
	  // 1,1,2,3,5,8,13,21,34,55

	public static void main (String[] arg) {
		
		int num1 = 1;
		int num2 = 1;
		int next;
		
		for(int i =1; i<=10; i++) {
			System.out.print(num1 + ", ");
			next = num1 + num2;
			num1 = num2;
			num2 = next;
			
		}
		System.out.println("\n=================================");
		
		//2.way
		 int a = 1;
		 int b = 1;
		 
		for(int i = 1; i<=10; i++) {
			System.out.print(a + ", ");
			b = b+a;
			a = b-a;
			
			
		}
		System.out.println("\n=================================");
		
		
		//3.way
		
		
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 1;
		
		for (int i=2; i<arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		//System.out.println(Arrays.toString(arr));
		
		
		for (int n : arr) {
			System.out.print(n + ", ");
		}
		
		
		
		
	}


 }
