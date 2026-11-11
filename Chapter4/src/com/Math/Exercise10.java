package com.Math;


import java.util.*;
public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter: ");
		
		char letter = input.next().charAt(0);
		
		if (String.valueOf(letter).matches("^[B-DF-HJ-NP-TV-Zb-df-hj-np-tv-z]$")) {
			System.out.println(letter + " is a consonant");
		}else if (String.valueOf(letter).matches("^[AEIOUaeiou]$")) {
			System.out.println(letter + " is a vowel");
		}else {
			System.out.println("Invalid input.");
		}
		
		
	}

}
