package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNum {

	public static void main(String[] args) {
		
//		taking user input for 2 number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :" );
		int num1 = input.nextInt();
		System.out.println("Enter the number :" );
		int num2 = input.nextInt();
		
//		swapping two numbers
		int temp = num1;
			num1 = num2;
			num2 = temp;
		System.out.println(num1);	
		System.out.println(num2);
		
		input.close();
		
	}

}
