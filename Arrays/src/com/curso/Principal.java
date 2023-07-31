package com.curso;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);

		for (int i = 0; i < numbers.length; i++)
		System.out.print(numbers[i] + " ");

		for (int i : numbers)
			System.out.print(i + " ");
		
		System.out.println("*******************");

		String[] strings = { "10", "A","a","9", "100",  };
		Arrays.sort(strings);
		for (String string : strings)
			System.out.print(string + " ");
		
		System.out.println("*******************");

		numbers = new int[]{2,4,6,8}; 
		System.out.println(Arrays.binarySearch(numbers, 2)); 
		System.out.println(Arrays.binarySearch(numbers, 4));  
		System.out.println(Arrays.binarySearch(numbers, 1));  
		System.out.println(Arrays.binarySearch(numbers, 3)); 
		System.out.println(Arrays.binarySearch(numbers, 9)); 
		System.out.println(Arrays.binarySearch(numbers, 5));
		
		System.out.println("*******************");

		numbers = new int[] {3,2,1};
		Arrays.sort(numbers);
		System.out.println(Arrays.binarySearch(numbers, 2)); 
		System.out.println(Arrays.binarySearch(numbers, 3));

		
		

	}

}
