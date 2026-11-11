package com.Math;


import java.util.*;
public class Exercise16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter an IMEI number:");
		
			
		String number = input.next();
		
		if (!number.matches("[0-9-]+")) {
			System.out.println("Invalid input.");
			input.close();
			return;
		}
		
		number = number.replace("-","");
		
		int length = number.length();
		
		if (length == 15)
			System.out.println(number + " is a valid IMEI number");
		else
			System.out.println(number + " is not a valid IMEI number");
			
			
		input.close();
	}

}
;