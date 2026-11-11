package com.Loop;

import java.util.*;
public class Exercise2 {
	
	public static void reverse(int number) {
		int reverse = 0;
		
		while(number!=0) {
			int lastDigit = number%10;
			reverse = reverse * 10 + lastDigit;
			number/=10;
		}
		System.out.println("Reverse Number: " + reverse);;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a number: ");
		
		if(!input.hasNextInt()){
			System.out.println("Invalid Output!");
			input.close();
			return;
		}
		int number = input.nextInt();
		
		reverse(number);
		
		
		input.close();
	}

}
