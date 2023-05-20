package com.masai;

import java.util.Scanner;

public class RemoveDuplicateCharacterFromString {
	
	
	public static void removeDuplicateCharactersOfString(String str) {
		
		String res = "";
		
		
		for(int i=0;i<str.length();i++) {
			
			if(!res.contains(str.charAt(i)+"")) {
				res+=str.charAt(i);
			}
			
		}
		
		System.out.println(res);
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do {
			System.out.println("*-------------------------------------------------------*");
			System.out.println("|    Press 1 to remove duplicate character from string  |");
			System.out.println("|    Press 0 to exit                                    |");
			System.out.println("*-------------------------------------------------------*");
			System.out.print("Enter your choice : ");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("Enter string : ");
				sc.nextLine();
				String str = sc.nextLine();
				
				removeDuplicateCharactersOfString(str); 
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
