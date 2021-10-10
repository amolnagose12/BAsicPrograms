package com.bridgelabz;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		
//		taking dividend and deviser to get remainder and quotient
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the divident :");
		int dividend = input.nextInt();
		System.out.println("Enter the diviser :");
		int diviser = input.nextInt();
		
		int rem = dividend % diviser;
		int quotient = dividend / diviser;
		
//		printing remainder and Quotient
		 System.out.println("Remainder: "+ rem);
		 System.out.println("Quotient: "+ quotient);
		 input.close();
	}
}