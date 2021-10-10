package com.bridgelabz;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {

//		taking year as input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Year : " );
		int year = input.nextInt();

//		checking condition for leap year
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year +" "+ " is leap Year ");
		}
		else 
		{
			System.out.println(year +" "+ "is not leap year");
		}
		
		input.close();
			
	}
}

