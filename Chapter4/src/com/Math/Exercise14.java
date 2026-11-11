package com.Math;


import java.util.*;
public class Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two characters: ");
		
		String majorStatus = input.next().trim();
		
		if (majorStatus.equals(majorStatus.toLowerCase())) {
			System.out.println("Invalid input. It should be uppercase letter for formality.");
			input.close();
			return;
		}
		
		char major = majorStatus.charAt(0);
		char status = majorStatus.charAt(1);
		
		
		if (major == 'I') {
			if (status == '1')
				System.out.println("Information Management Freshman");
			else if (status == '2')
				System.out.println("Information Management Sophomore");
			else if (status == '3')
				System.out.println("Information Management Junior");
			else
				System.out.println("Information Management Senior");
		}else if (major == 'C') {
			if (status == '1')
				System.out.println("Computer Science Freshman");
			else if (status == '2')
				System.out.println("Computer Science Sophomore");
			else if (status == '3')
				System.out.println("Computer Science Junior");
			else
				System.out.println("Computer Science Senior");
		}else{
			if (status == '1')
				System.out.println("Accounting Freshman");
			else if (status == '2')
				System.out.println("Accounting Sophomore");
			else if (status == '3')
				System.out.println("Accounting Junior");
			else
				System.out.println("Accounting Senior");
		}
		
		input.close();
		
		
		
	}

}
