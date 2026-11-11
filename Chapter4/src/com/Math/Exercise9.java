package com.Math;


import java.util.*;
public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a hex digit: ");
		
		String hexDigit = input.next();
		
		if (!hexDigit.matches("[0-9A-Fa-f]+")) {
			System.out.println(hexDigit + " is an invalid input.");
			input.close();
			return;
		}
		
		int decimal = Integer.parseInt(hexDigit, 16);	
		
		String convertDecimal = Integer.toBinaryString(decimal);
		
		
		System.out.println("The binary vlaue is " + convertDecimal);
		
				
		input.close();
		
	}

}
