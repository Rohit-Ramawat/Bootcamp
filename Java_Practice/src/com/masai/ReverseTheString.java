package com.masai;

import java.util.Scanner;

public class ReverseTheString {
	
	public static void reverseString(String s) {
		String array[] = s.split(" ");
		
		String reverseStr="";
		
		for(int i=array.length-1;i>=0;i--) {
			reverseStr+=array[i] + " ";
		}
		
		System.out.println(reverseStr); 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string : ");
		String str = sc.nextLine();
		reverseString(str);
	}

}
