package com.Selection;


import java.util.*;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//CostOfShipping
		
		double weight, placeholder = 0,result;
		
		System.out.println("Enter the weight of the package: ");
		weight = input.nextDouble();
		
		if ((weight >= 0) && (weight <= 2))
			placeholder = 2.5;
		else if ((weight >= 2) && (weight <= 4))
			placeholder = 4.5;
		else if ((weight >= 4) && (weight <= 10))
			placeholder = 7.5;
		else if ((weight >= 0) && (weight <= 20))
			placeholder = 10.5;
		else
			System.out.println("This package cannot be shippped.");
		
		
		result = placeholder;
		
		if (result != 0)
			System.out.println("The cost of shipping is " + result);
			
		
		
	}

}
