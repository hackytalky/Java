package com.Selection;

import java.util.*;
import java.text.DecimalFormat;
public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double farenheight;
		double mphSpeed;
		double result;
		DecimalFormat df = new DecimalFormat("#.###");
		
		System.out.println("Enter a value of farenheight: ");
		farenheight = input.nextDouble();
		mphSpeed = input.nextDouble();
		
		if (((farenheight < 0) || (farenheight <= 41)) && mphSpeed >= 2) {
			result =  (35.74 + (0.6215 * farenheight)) - (35.75 * (mphSpeed * (Math.pow(farenheight, 0.16)))) + (0.4275 * (mphSpeed * Math.pow(farenheight, 0.16)));
			System.out.println("The result is " + df.format(result));}
		else
			System.out.println("The input is not valid");
		
		};
		
		
		
	};

