package com.bridgelabz.functionalprograms;

import java.util.*;

public class ThreeNumberSum {
	public static void main(String[] args) {
		int noOfNumbers;
		int[] numbers;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("No of Numbers:");
		noOfNumbers = scanner.nextInt();
		numbers = new int[noOfNumbers];
		
		System.out.println("Please enter the numbers:");
		for(int i=0;i<noOfNumbers;i++) {
			numbers[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println("The triplets are:");
		for(int i=0;i<noOfNumbers;i++) {
			for(int j=i+1;j<noOfNumbers;j++) {
				for(int k=j+1; k<noOfNumbers;k++) {
					if(numbers[i] + numbers[j] + numbers[k] == 0) {
						System.out.println(numbers[i]+", "+numbers[j]+", "+numbers[k]);
					}
				}
			}
		}
	}
}
