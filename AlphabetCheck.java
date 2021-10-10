package com.bridgelabz;

import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {
		
//		taking character input from user
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the character to get to know the vovel or consonant :");
		char character = input.next().charAt(0);
		
//		checking condition for vovel and consonant if a,e,i,o,u(A,E,I,O,U) then vovel else consonant 
		if ((character == 'a') || (character == 'e' )||( character == 'i' )||(character == 'o')||(character == 'u') 
				|| (character == 'A') || (character == 'E' )||( character == 'I' )||(character == 'O')||(character == 'U') ) {
			System.out.println(character + " "+ "  is vovel");
			}
		else {
			System.out.println(character +" "+"is consonant");
		}	
		input.close();
	}

}
