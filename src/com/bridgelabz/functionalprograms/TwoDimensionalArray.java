package com.bridgelabz.functionalprograms;

import java.util.*;
import java.io.*;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int noOfRows, noOfColumns, choice;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Number of Rows");
		noOfRows = scanner.nextInt();
		System.out.println("Number of Columns:");
		noOfColumns = scanner.nextInt();
		System.out.println("Enter 1. Integer\n2. Double\n3. Boolean");
		choice = scanner.nextInt();

		switch (choice) {
		case 1:
			int[][] intArray = readIntArray(scanner, noOfRows, noOfColumns);
			printArray(intArray);
			break;
		case 2:
			double doubleArray[][] = readDoubleArray(scanner, noOfRows, noOfColumns);
			printArray(doubleArray);
			break;
		case 3:
			boolean booleanArray[][] = readBooleanArray(scanner, noOfRows, noOfColumns);
			printArray(booleanArray);
			break;
		}

		
		scanner.close();

		System.out.println();
	}

	public static int[][] readIntArray(Scanner scanner,int noOfRows,int noOfColumns) {
		int[][] intArray = new int[noOfRows][noOfColumns];
		System.out.println("Enter contents of array:");

		for (int i = 0; i < noOfRows; i++) {
			for (int j = 0; j < noOfColumns; j++) {
				intArray[i][j] = scanner.nextInt();
			}
		}
		
		return intArray;
	}
	
	public static double[][] readDoubleArray(Scanner scanner,int noOfRows,int noOfColumns) {
		double[][] doubleArray = new double[noOfRows][noOfColumns];
		System.out.println("Enter contents of array:");

		for (int i = 0; i < noOfRows; i++) {
			for (int j = 0; j < noOfColumns; j++) {
				doubleArray[i][j] = scanner.nextDouble();
			}
		}
		
		return doubleArray;
	}
	
	public static boolean[][] readBooleanArray(Scanner scanner,int noOfRows,int noOfColumns) {
		boolean[][] booleanArray = new boolean[noOfRows][noOfColumns];
		System.out.println("Enter contents of array:(T for true and F for false");

		for (int i = 0; i < noOfRows; i++) {
			for (int j = 0; j < noOfColumns; j++) {
				booleanArray[i][j] = scanner.next().equalsIgnoreCase("T") ? true : false;
			}
		}
		
		return booleanArray;
	}

	public static void printArray(int[][] array) {
		PrintWriter printWriter = new PrintWriter(System.out);

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				printWriter.append(array[i][j] + " ");
			}
			printWriter.append("\n");
		}

		printWriter.flush();
	}
	
	public static void printArray(double[][] array) {
		PrintWriter printWriter = new PrintWriter(System.out);

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				printWriter.append(array[i][j] + " ");
			}
			printWriter.append("\n");
		}

		printWriter.flush();
	}
	
	public static void printArray(boolean[][] array) {
		PrintWriter printWriter = new PrintWriter(System.out);

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				printWriter.append(array[i][j] + " ");
			}
			printWriter.append("\n");
		}

		printWriter.flush();
	}
}
