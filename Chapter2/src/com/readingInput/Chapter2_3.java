package com.readingInput;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Chapter2_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value for meter:  ");
		double meter = input.nextDouble();
		
		DecimalFormat df = new DecimalFormat("#.000"); 
		
		double calculatedFeet = meter * 3.2786;
		
		System.out.println(meter + " meters is " + df.format(calculatedFeet) + " feet");
		
		
	}
}
