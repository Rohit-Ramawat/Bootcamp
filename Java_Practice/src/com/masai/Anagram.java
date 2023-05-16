package com.masai;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public static boolean findAnagram(Scanner sc) {
		System.out.print("Enter 1st String : ");
		sc.nextLine();                                         //To change the line while taking input
		String str1 = sc.nextLine();
	
		System.out.print("Enter 2nd String : ");
		String str2 = sc.nextLine();
		
		//removing all white spaces from both strings
		String s1 = str1.replaceAll("\\s", "").toLowerCase();
		String s2 = str2.replaceAll("\\s", "").toLowerCase();
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		//creating char arrays from the above new strings
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		
		Arrays.sort(arr1);            //<------sorting arrays
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);   //<-----checking equality of arrays using Arrays.equals(arr1,arr2)

	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do {
			System.out.println("*--------------------------------------*");
			System.out.println("|    Press 1 to check Anagram strings  |");
			System.out.println("|    Press 0 to exit                   |");
			System.out.println("*--------------------------------------*");
			System.out.print("Enter your choice : ");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println(findAnagram(sc)); 
				break;
			case 0:
				System.out.println("Exited from program");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
		}while(choice != 0);
		
		sc.close();
	}

}
