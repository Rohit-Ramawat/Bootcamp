package com.masai;

import java.util.Scanner;

public class FindUserInputType {
	
	public static boolean isNumeric(String str) {
		
		return str.matches("-?\\d+(\\.\\d+)?");    //it will return true if string is numeric else false
				
	}
	
	public static boolean isBoolean(String str) {
		
		return str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false");
				
	}
	
	public static void checkInputType(Scanner sc) {
		
		System.out.print("Enter input : ");
		String userInput = sc.next();
		
		if(isNumeric(userInput)) {
			System.out.println("Given input is a number i.e. "+userInput);
		}else if(isBoolean(userInput)){
			System.out.println("Provided input is a boolean value i.e. "+userInput);
		}else {
			System.out.println("Provide input is a string i.e. "+userInput);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do {
			System.out.println("*--------------------------------------*");
			System.out.println("|         Press 1 to check input type  |");
			System.out.println("|         Press 0 to exit              |");
			System.out.println("*--------------------------------------*");
			System.out.print("Enter your choice : ");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				checkInputType(sc);
				break;
			case 0:
				System.out.println("Exited from program");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
		}while(choice != 0);
		
	}

}
