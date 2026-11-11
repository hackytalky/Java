package com.Math;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
		
		double centerVertex,S, areaPentagon;
		
		System.out.println("Enter the length from the center to a vertex: ");
		
		centerVertex = input.nextDouble();
		
		S = (2 * centerVertex) * Math.sin(Math.PI / 5);
		areaPentagon = (5 * Math.pow(S, 2)) / (4 * Math.tan(Math.PI / 5));
		
		System.out.printf("The area of pentagon is %4.2f\n", areaPentagon);
		
		
	}

}
