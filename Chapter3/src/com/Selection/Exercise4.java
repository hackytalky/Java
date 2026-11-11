package com.Selection;


import java.util.*;
import java.text.DecimalFormat;
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int d1,d2,d3,d4,d5,d6,d7,d8,d9,checksum;
		String denoted = "X";
		
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		d1 = input.nextInt();
		d2 = input.nextInt();
		d3 = input.nextInt();
		d4 = input.nextInt();
		d5 = input.nextInt();
		d6 = input.nextInt();
		d7 = input.nextInt();
		d8 = input.nextInt();
		d9 = input.nextInt();
		
		
		checksum = ((d1*1) + (d2*2) + (d3*3) + (d4*4) + (d5*5) + (d6*6) + (d7*7) + (d8*8) + (d9*9))%11;
		
		if (checksum != 10)
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + checksum);
		else
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + denoted);
	}

}
