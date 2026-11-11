package com.Math;


import java.util.*;


public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double x1,y1,x2,y2,distanceBetweenPoint;
		
		System.out.println("Enter point 1 (latitude and longitude) in degrees:");
		String point1 = input.nextLine();
		
		
		String[] cuttingPart = point1.trim().split("\\s+");;
		
		if (cuttingPart.length != 2) {
			System.out.println("Invalid input.");
			input.close();
			return;
		}
		
		x1 = Double.parseDouble(cuttingPart[0]);
		y1 = Double.parseDouble(cuttingPart[1]);
		
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		
		System.out.println("Enter point 2 (latitude and longitude) in degrees:");
		String point2 = input.nextLine();
		
		String[] cuttingPart2 = point1.trim().split("\\s+");;
		
		if (cuttingPart2.length != 2) {
			System.out.println("Invalid input.");
			input.close();
			return;
		}
		
		x2 = Double.parseDouble(cuttingPart2[0]);
		y2 = Double.parseDouble(cuttingPart2[1]);
		
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		
		distanceBetweenPoint = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));
		
		System.out.println("The distance between the two point is " + distanceBetweenPoint + " km");
		
		
		
			
		
		
		input.close();
		
	}
	
}
