package com.Selection;

import java.util.*;
import java.text.DecimalFormat;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
		
		int number1 = (int) (Math.random()*100) + 1;
		int number2 = (int) (Math.random()*100) + 1;
		int result = number1 * number2;
		
		System.out.println("Enter the answer of this two numbers multiplied: ");
		System.out.println(number1 + " * " + number2 + " = ");
		
		int answer = input.nextInt();
		
		if (answer == result)
			System.out.println("Your answer is correct! The answer is " + result);
		else
			System.out.println("Your answer is wrong!");
		
	}

}
