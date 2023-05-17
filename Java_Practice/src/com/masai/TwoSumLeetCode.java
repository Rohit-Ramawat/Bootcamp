package com.masai;

import java.util.Scanner;

public class TwoSumLeetCode {
	
	public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = new int[2];
        for(int i=0;i<n-1;i++){
            
            for(int j=i+1;j<n;j++){
                
                if(nums[i]+nums[j]==target){

                    ans[0] = i;        
                    ans[1] = j;
                    break;

                }
                
            }
        }

        return ans;
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of testcases you want : ");
		int tc = sc.nextInt();							//<---test cases
		
		for(int i=0;i<tc;i++) {
			System.out.print("enter target sum value : ");
			int k = sc.nextInt();
			
			System.out.print("enter array length : ");
			int n = sc.nextInt();                		//<---array length
			
			int arr[] = new int[n];                     //<---array declaration
			
			for(int j=0;j<n;j++) {
				System.out.print("enter array value : ");
				arr[j] = sc.nextInt();
				
			}
			
			int ansIndexes[] = twoSum(arr,k);        //input result array of indexes
			
			for(int j=0;j<ansIndexes.length;j++) {
				
				System.out.print(ansIndexes[j]+" ");
				
			}
			
		}

	}

}
//Problem Statement--->

//Given an array of integers nums and an integer target, 
//return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, 
//and you may not use the same element twice.
//
//You can return the answer in any order.