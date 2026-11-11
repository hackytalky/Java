package com.Selection;


import java.util.*;
public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double x,y, point_distance, number_squared;
		
		System.out.println("Enter a point with two coordinates: ");
		x = input.nextDouble();
		y = input.nextDouble();
		
		point_distance = Math.pow((x - 0),2) + Math.pow((y - 0), 2);
		number_squared = Math.sqrt(point_distance);
		
		if (number_squared <= 10)
			System.out.println("Point ("+ x + ", " + y +  ")" +" is in the circle.");
		else
			System.out.println("Point ("+ x + ", " + y +  ")" +" is not in the circle.");
		
	}

}
