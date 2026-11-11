package com.Math;

import java.util.*;


public class Exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string of characters: ");
		
		String collections = input.next();
		
		if (!collections.matches("[a-zA-Z]+")) {
			System.out.println("Invalid input.");
			input.close();
			return;
		}
		
		int lenghtOfCharacters = collections.length();
		
		char lastCharac = collections.charAt(lenghtOfCharacters - 1);
		
		System.out.println("The length of " + collections + " " + lenghtOfCharacters + " and the last characters is " + lastCharac);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();
		
	}

}
