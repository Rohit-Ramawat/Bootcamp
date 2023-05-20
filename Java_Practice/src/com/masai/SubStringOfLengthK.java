package com.masai;

import java.util.Scanner;

public class SubStringOfLengthK {
	
	public static void findSubString(Scanner sc) {
		
		System.out.print("Enter String : ");
		String s = sc.next();
		System.out.print("Enter required length : ");
		int k = sc.nextInt();
		
		int n = s.length();
		
		for(int i=0;i<n;i++) {
			
			String subStr = "";
			
			for(int j=i;j<n;j++) {
				
				subStr+=s.charAt(j);
				
				if(subStr.length() == k) {
					System.out.println(subStr);
				}
				
			}
			
		}	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do {
			System.out.println("*--------------------------------------*");
			System.out.println("|    Press 1 to Substrings of length k |");
			System.out.println("|    Press 0 to exit                   |");
			System.out.println("*--------------------------------------*");
			System.out.print("Enter your choice : ");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				findSubString(sc); 
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
