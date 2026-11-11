package com.readingInput;

import java.util.Scanner;

public class Chapter2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		int sumDigits = (number/1000) + ((number/100)%10) + ((number/10)%10) + (number % 10);
		
		System.out.println("The sum of digits is " + sumDigits);
		
	}

}
