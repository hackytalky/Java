package com.Loop;
import java.util.*;
public class Exercise7 {
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		
		
		double formula = investmentAmount * Math.pow((1 + (monthlyInterestRate/1200.0)),years * 12);
		return formula;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
		double x = 0;
		
		System.out.println("The amount invested: ");
		int investmentValue = input.nextInt();
		System.out.println("Annual Interest Rate: ");
		int yearInterest = input.nextInt();
		
		System.out.printf("%-15s %-15s\n","Years","Future Value");
		
		for( int i = 1;i<=30;i++) {
			x = futureInvestmentValue(investmentValue,yearInterest,i);
			System.out.printf("%-9d %13.2f\n",i,x);
		}
		
	}

}
