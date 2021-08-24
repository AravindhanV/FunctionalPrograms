package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Quadratic {
public static void main(String[] args) {
	int a,b,c;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a, b and c");
	a = scanner.nextInt();
	b = scanner.nextInt();
	c = scanner.nextInt();
	
	int delta = (int)Math.pow(b, 2) - (4*a*c);
	double root1 = (-b + Math.sqrt(delta))/(2*a);
	double root2 = (-b - Math.sqrt(delta))/(2*a);
	
	System.out.println("The roots are "+root1+" and "+root2);
}
}
