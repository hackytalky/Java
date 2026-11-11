package com.Loop;

import java.util.*;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int years,interestYear;
		double monthlyPayment;
		double totalPayment = 0,monthlyRate = 0,term = 0,interest = 0,principal = 0, balance = 0,amount = 0;
		System.out.println("Loan Amount: ");
		amount = input.nextDouble();
		System.out.println("Number of Years: ");
		years = input.nextInt();
		
		System.out.println("Annual Interest Rate: ");
		interestYear = input.nextInt();
		
		
		
		monthlyRate = (interestYear/100.0) / 12;
		term = 12 * years;
		monthlyPayment = amount * monthlyRate * (Math.pow(1 + monthlyRate,term))/((Math.pow(1 + monthlyRate,term))-1);
		totalPayment = monthlyPayment * term;
		
		System.out.println("Monthly Payment: " + monthlyPayment);
		System.out.println("Total Payment: " + totalPayment);
		
		System.out.printf("%-15s %-15s %-15s %-15s%n",
		        "Payment #", "Interest", "Principal", "Balance");
		
		for(int i = 1;i<=term;i++) {
			
			
			interest = amount * monthlyRate;
			principal = monthlyPayment - interest;
			balance = amount - principal;
			
		
			
			
			System.out.printf("%-15d %-15.2f %-15.2f %-15.2f%n",
		            i, interest, principal, balance);
			amount = balance;
			
			
			
		}
	}

}
