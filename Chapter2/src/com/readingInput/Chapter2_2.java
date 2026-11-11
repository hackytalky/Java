package com.readingInput;

import java.util.*;
import java.text.DecimalFormat;

public class Chapter2_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter length of the sides and height of the equilateral triangle: ");
		double length = input.nextDouble();
		
		DecimalFormat df = new DecimalFormat("#.00"); 
		
		double area = Math.sqrt(3)*((length * length)/4.0) ;
		System.out.println("The area is " + df.format(area));
		
		double volume = area * length;
		System.out.println("The volume of the Triangular prism is " + df.format(volume));
		
		
	}
}
