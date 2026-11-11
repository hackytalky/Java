package com.Math;

import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double n,s,area;
		
		System.out.println("Enter the number of sides:");
		
		if (!input.hasNextDouble()) {
		    System.out.println("Invalid input.");
		    input.close();
		    return;
		}
		
		n = input.nextDouble();
		
		System.out.println("Enter the side:");
		s = input.nextDouble();
		
		
			
		
		area = n * Math.pow(s,2)/ (4 * Math.tan(Math.PI/n));
		
		System.out.println("The area of the polygon " + area);
		
		input.close();
	}

}
