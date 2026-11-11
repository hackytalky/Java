package com.readingInput;

import java.util.*;

public class Chapter2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter u, t and a: ");
		double u = input.nextDouble();
		double t = input.nextDouble();
		double a = input.nextDouble();
		
		double d = (u * t)  + (((1/2)* a) * (t * t));
		
		System.out.println("The distance covered is "+ d);
		
	}

}
