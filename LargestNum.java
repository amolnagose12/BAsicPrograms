package com.bridgelabz;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// taking number input from user to check maximum no
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number1: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter the number2: ");
		int num2 = input.nextInt();
		
		System.out.println("Enter the number3: ");
		int num3 = input.nextInt();
		
//		taking num1 as largest no 
		int max = num1;
		if(num2 > max) {
			max = num2;
		}
		if(num3> max) {
			max = num3;
		}
		System.out.println("largest number is: "+ max);
		input.close();
	} 

}
