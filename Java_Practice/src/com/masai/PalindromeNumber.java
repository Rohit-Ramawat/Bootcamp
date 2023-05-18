package com.masai;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static boolean isPalindrome(int x) {
        String s = x+"";

        char arr[] = s.toCharArray();
        int n = arr.length;
        if( n%2 != 0 ){
            for(int i=0;i<(n-1)/2;i++){
                if(arr[i]!=arr[n-i-1]){
                    return false;
                }
            }
        }else{
            for(int i=0;i<n/2;i++){
                if(arr[i]!=arr[n-i-1]){
                    return false;
                }
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		
		System.out.println("Enter number is palindrome = "+ isPalindrome(number));
	}

}
