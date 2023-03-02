package com.neotech.lesson11;

public class PrintArrays {

	public static void main(String[] args) {

		int[] points = { 90, 85, 95, 75, 93, 95, 100 };

		// printing one by one
		System.out.println(points[0]);
		System.out.println(points[1]);
		System.out.println(points[2]);
		System.out.println(points[3]);
		// and same for all other indices

		int size = points.length;

		for (int i = 0; i < size; i++) {
			System.out.print(points[i] + " ");
		}

	}

}
