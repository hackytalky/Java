package com.readingInput;

import java.util.Scanner;

public class Chapter2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of water in kilograms: ");
		double amountofWater = input.nextDouble();
		
		System.out.println("Enter the final temperature: ");
		double finalTemp = input.nextDouble();
		
		System.out.println("Enter the initial temperature: ");
		double initialTemp = input.nextDouble();
		
		double Q = amountofWater * (finalTemp - initialTemp) * 4184;
		System.out.println("The energy needed is " + Math.abs(Q));
		
	}

}
