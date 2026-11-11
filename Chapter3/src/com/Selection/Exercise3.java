package com.Selection;

import java.text.DecimalFormat;
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a,b,c,d,e,f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		
		double determinator = (a * d) - (b * c);
		DecimalFormat df = new DecimalFormat("#0.000");
		
		double x_determinant = ((e * d) - (b * f)) / determinator;
		double y_determinant = ((a * f) - (e * c)) / determinator;
		
		if (determinator > 0)
			System.out.println("x = " + df.format(x_determinant) + "\n" + "y = " + df.format(y_determinant));
		else
			System.out.println("The equation has no solution.");
		
		
	}

}
