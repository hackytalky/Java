package com.Selection;

import java.util.*;
import java.text.DecimalFormat;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double discriminant;
		double discriminant_x;
		double discriminant_y;
		double discriminant_is_zero;
		DecimalFormat df = new DecimalFormat("#.###");
		
		System.out.println("Enter a,b,c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		discriminant = (Math.pow(b, 2) - (4 * a * c));
		discriminant_x = -b + (Math.sqrt(discriminant))/(2*a);
		discriminant_y = -b - (Math.sqrt(discriminant))/(2*a);
		
		if (discriminant > 0) {
			System.out.println("The equation has two roots " + df.format(discriminant_x) + " and " +df.format(discriminant_y));
			}
		else if (discriminant == 0) {
			discriminant_is_zero = -b / (2*a);
			System.out.println("The equation has one root " + df.format(discriminant_is_zero));
			}
		else {
			System.out.println("The equation has no roots");
		}
			
			
		
		
	}

}
