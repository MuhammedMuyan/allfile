package com.neotech.lesson09;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// How can we print Good Evening 5 times

		/*
		 * System.out.println("Good Evening"); System.out.println("Good Evening");
		 * System.out.println("Good Evening"); System.out.println("Good Evening");
		 * System.out.println("Good Evening");
		 */

		System.out.println("=================================");

		// 2nd - using while
		// what do we need when use a While?
		// - we are responsible for where, when we start
		// - we are responsible when we stop

		int count = 1;
		while (count <= 5) // 5], 6[
		{
			System.out.println("Good Evening");

			count++;// count = count + 1 or count += 1
		}

		// 3rd - using do while
		int num = 1;
		do {
			System.out.println("Good Evening");

			num++;
		} while (num <= 5);

		// difference ??

		int n1 = 10;
		while (n1 <= 5) {
			System.out.println("Good Night!");
			n1++;
		}

		int n2 = 10;
		do {
			System.out.println("Good Night!");

			n2++;
		} while (n2 <= 5);

	}

}
