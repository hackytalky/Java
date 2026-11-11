package com.Math;


import java.util.*;


public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double radius,areaOfStar;
		
		System.out.println("Enter the radius of the circle inscribing the star: ");
		radius = input.nextDouble();
		
		areaOfStar = 10 * (Math.tan(Math.PI/10)/ (3 - Math.tan(Math.PI/10) * Math.tan(Math.PI/10))) * Math.pow(radius, 2);
		
		System.out.println("The area of the star is " +  areaOfStar);
		
		input.close();
	}

}
