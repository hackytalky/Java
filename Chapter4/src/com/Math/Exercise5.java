package com.Math;


import java.util.*;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double radius,p1,p2,p3,p4,p5,pentagon,angle,p1x,p1y,p2x,p2y;
		
		System.out.println("Enter the radius of the bounding circle of a pentagon: ");
		
		if(!input.hasNextDouble()) {
			System.out.println("Invalid Output");
			input.close();
			return;}
		
		
		radius = input.nextDouble();
		angle  = 90;
		p1 = Math.toRadians(angle - 72);
		p2 = Math.toRadians(p1 - 72);
		p3 = Math.toRadians(p2 - 72);
		p4 = Math.toRadians(p3 - 72);
		p5 = Math.toRadians(p4 - 72);
		
		//Point 1
		p1x = radius * Math.cos(p1);
		p1y = radius * Math.sin(p1);
		
		//Point 2
		p2x = radius * Math.cos(p2);
		p2y = radius * Math.sin(p2);
		
		//Point 3
		double p3x = radius * Math.cos(p3);
		double p3y = radius * Math.sin(p3);
		
		//Point 4
		double p4x = radius * Math.cos(p4);
		double p4y = radius * Math.sin(p4);
		
		//Point 5
		double p5x = radius * Math.cos(p5);
		double p5y = radius * Math.sin(p5);
	
		System.out.println("The coordinates of five points on the pentagon are \n"
				+ "(" + p1x + ", " + p1y + "),\n"
				+ "(" + p2x + ", " + p2y + "),\n"
				+ "(" + p3x + ", " + p3y + "),\n"
				+ "(" + p4x + ", " + p4y + "),\n"
				+ "(" + p5x + ", " + p5y + "),\n"
				);
		
		
		
		
		
		
		
		
		
			
	}

}
