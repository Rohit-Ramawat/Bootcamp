package com.masai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamClassPractice1 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 5, 2, 8, 4, 5, 1};
		int max = Arrays.stream(numbers).max().getAsInt();
		System.out.println("Maximum element in the array: " + max);
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int value:numbers) {
			list.add(value);
		}
		System.out.println("Created List = "+ list);
		
		long count = list.stream().count();
		System.out.println("Count of elements in the List = "+count);
		
		List<Integer> mappedList = list.stream().map(i -> i*2).toList();
		System.out.println("doubled of elements in the List = "+mappedList);
		
		List<Integer> filteredList = list.stream().filter(i -> i%2 == 0).toList();
		System.out.println("filtered elements in the List = "+filteredList);
		
		List<Integer> distinctedList = list.stream().distinct().toList();
		System.out.println("Distinct elements in the List = "+distinctedList);
	}

}
//Note:- Program to find the maximum element in the array using collection and stream