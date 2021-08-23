package com.bridgelabz.functionalprograms;

import java.util.*;
import java.io.*;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int noOfRows, noOfColumns;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number of Rows");
		noOfRows = scanner.nextInt();
		System.out.println("Number of Columns:");
		noOfColumns = scanner.nextInt();
		
		int[][] array = new int[noOfRows][noOfColumns];
		System.out.println("Enter contents of array:");
		
		for(int i=0;i<noOfRows;i++) {
			for(int j=0;j<noOfColumns;j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		
		System.out.println();
		printArray(array);
	}
	
	public static void printArray(int [][] array) {
		PrintWriter printWriter = new PrintWriter(System.out);
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				printWriter.append(array[i][j]+" ");
			}
			printWriter.append("\n");
		}
		
		printWriter.flush();
	}
}
