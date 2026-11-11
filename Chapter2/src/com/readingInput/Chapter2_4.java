package com.readingInput;

import java.text.DecimalFormat;
import java.util.*;

public class Chapter2_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number in square meters: ");
		double squareMeters = input.nextDouble();

		double calculatedPing = squareMeters * 0.3025;
		DecimalFormat df = new DecimalFormat("#.000");
		
		System.out.println(squareMeters + " square meters is " + df.format(calculatedPing) + " pings" );
		
	}
	

}
