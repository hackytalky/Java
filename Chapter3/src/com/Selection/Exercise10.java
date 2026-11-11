package com.Selection;

import java.util.*;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int length;
		int width;
		int result;
		
		System.out.println("Enter the width and length: ");
		length = input.nextInt();
		width = input.nextInt();
		
		if ((length != width) && (width != length)) {
			result = 2 * (length + width);
			System.out.println("The perimeter is " + result + " units.");
			}
		else
			System.out.println("The input is not valid.");
	}

}
