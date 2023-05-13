package com.masai;


import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeAWish {
	
	
	
	
	
	public Map<Character, Integer> find(String s,Map<Character, Integer> m) {
		for(int i=0;i<s.length();i++) {
			m.computeIfPresent(s.charAt(i),(key, val) -> val+1);	
		}
		
		return m;
	}
	
	

	public static void main(String[] args) {
	    
		MakeAWish m1 = new MakeAWish();
		
		Map<Character,Integer> map = new HashMap<>();
		map.put('w', 0);
		map.put('i', 0);
		map.put('s', 0);
		map.put('h', 0);
		
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=0;i<tc;i++) {
			int n=sc.nextInt();
			String str=sc.next();
			System.out.println("Given string is:-"+str);
			
			Map<Character, Integer> map2=m1.find(str,map);
			System.out.println("New Map is:- "+map2);
			
			Collection<Integer> c=map2.values();
			
			System.out.println(Collections.min(c)); 
			
		}
		sc.close();
	}	
}
