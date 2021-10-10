package com.bridgelabz;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		
//		taking input from user
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = input.nextInt();
		
//		checking odd even number condition
		
		if ( num % 2 ==0 ) {
		System.out.println(num +" "+ "is even number ");
		}
		else {
			System.out.println(num +" "+ "is odd number");
		}
	}




}
