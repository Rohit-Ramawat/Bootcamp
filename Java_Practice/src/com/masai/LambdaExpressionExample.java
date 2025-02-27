package com.masai;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		
		FunctionInterfaceExample fi = name1 -> System.out.println("Hi my name is " + name1);
		fi.sayHello("Rohit");
		
		Intr1 i1 = name2 -> name2.toLowerCase();
		System.out.println(i1.convertToLowerCase("Ramawat"));
		
		Intr2 i2 = name3 -> {
			String vowels = "AEIOUaeiou";
			char[] charArray = name3.toCharArray();
			/*
			  for(char c :charArray) {
			   if(vowels.contains(c+"")) 
			   { 
			     return true; 
			   } 
			  }
			*/
			for(char c :charArray) {
			   if(vowels.indexOf(c) != -1 ) 
			   { 
			     return true; 
			   } 
		    }
			return false;
		};
		
		System.out.println(i2.containsVowel("ramSagar"));
		

	}

}
