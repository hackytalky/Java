package com.readingInput;
import java.util.*;

public class Chapter2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the subtotal and a gratuity rate:");
		double subTotal = input.nextInt();
		double gratuityRate = input.nextInt();
		
		double gratuity = gratuityRate/subTotal;
		System.out.println("The gratuity is %" + gratuity + " and total is $" + (subTotal + gratuity));
		
		
		
	}

}
