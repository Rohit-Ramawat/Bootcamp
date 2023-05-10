package com.masai;

import java.util.Arrays;

public class StreamClassPractice1 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 5, 2, 8, 4};
		int max = Arrays.stream(numbers).max().getAsInt();
		System.out.println("Maximum element in the array: " + max);
	}

}
