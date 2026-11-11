package com.readingInput;
import java.text.DecimalFormat;
import java.util.*;


public class Chapter2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter miles: ");
		double miles = input.nextDouble();
		
		double convertedMilesToKm = miles * 1.6;
		DecimalFormat df = new DecimalFormat("#.0");
		
		
		System.out.println(miles + " miles is " + df.format(convertedMilesToKm) + " kilometers");
	}

}
