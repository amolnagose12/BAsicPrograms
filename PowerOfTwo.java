package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {

//		Taking number input from user
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number:  ");
		double num = input.nextInt();
		
//		calculating power of 2
			int i=1;
			while(num<31) {
				num += i;
				System.out.println(Math.pow(2, i));
				i++;
			}
//				
		input.close();
		}
			
	}

