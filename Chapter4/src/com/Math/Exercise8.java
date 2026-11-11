package com.Math;

import java.util.*;
public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter binary digits (0000 to 1111): ");
		
		String digits = input.next();
		
		char ch1 = digits.charAt(0);
		char ch2 = digits.charAt(1);
		char ch3 = digits.charAt(2);
		char ch4 = digits.charAt(3);
		
		
		int p1 = (ch1 - '0')* 8;
		int p2 = (ch2 - '0')* 4;
		int p3 = (ch3 - '0')* 2;
		int p4 = (ch4 - '0')* 1;
		
		System.out.println("The decimal value is " + (p1 + p2 + p3 + p4));
	
		
		
		
	}

}
