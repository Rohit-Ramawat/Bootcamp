package com.masai;
@FunctionalInterface
public interface FunctionInterfaceExample {
	void sayHello(String name);
	
	default String defaultMethod(String name) {
		return "Name inside default method is :- " + name;
	}
	
	static String StaticMethod(String name) {
		return "Name inside static method is :- " + name;
	}
}

@FunctionalInterface
interface Intr1{
	String convertToLowerCase(String name);
}

@FunctionalInterface
interface Intr2{
	boolean containsVowel(String name);
}
