package com.masai;

import java.util.Scanner;

public class HackerRankChallenge1 {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.print("Enter number : ");
        int N = scanner.nextInt();
        
        findWeird(N);
        scanner.close();
    }
    
    public static void findWeird(int num){
        if(num % 2 != 0){
            System.out.println("Weird");
        }else if((num % 2 == 0 )&&(num>=2 && num<=5)){
            System.out.println("Not Weird");
        }else if((num % 2 == 0 )&&(num>=6 && num<=20)){
            System.out.println("Weird");
        }else if((num % 2 == 0 )&&(num>20)){
            System.out.println("Not Weird");
        }
    }
}

//Note:-it was a HackerRank challenge problem while earning bronze badge
