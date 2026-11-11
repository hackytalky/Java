package com.Loop;

import java.util.*;
public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double interestRate = 5.000, ammortizedLoan = 0, totalPayment = 0,monthlyRate = 0;
		int i = 0,term = 0;
		System.out.println("Loan amount: ");
		int amount = input.nextInt();
		
		System.out.println("Number of Years:  ");
		int years = input.nextInt();
		
		System.out.printf("%-15s %-15s %-15s%n",
		        "Interest Rate", "Monthly Payment", "Total Payment");
		
		for(i = 0;i<=20;i++) {
			
			monthlyRate = (interestRate/100) / 12;
			term = 12 * years;
			ammortizedLoan = amount * monthlyRate * (Math.pow(1 + monthlyRate,term))/((Math.pow(1 + monthlyRate,term))-1);
			totalPayment = ammortizedLoan * term;
			 System.out.printf("%-15.3f %-17.2f %-17.2f%n",
			            interestRate, ammortizedLoan, totalPayment);
			
			interestRate = interestRate + 0.25;
		}
		
		
	}	

}
