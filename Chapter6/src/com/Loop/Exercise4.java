package com.Loop;

import java.util.*;

public class Exercise4 {
	
	public static int sumDigits(long n) {
		int sum = 0;int lastDigit = 0;
		int a = (int)n;
		while(a!=0) {
			lastDigit = a % 10;
			sum = sum + lastDigit;
			a/=10;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x = 0;
		System.out.println("Enter a number: ");
		long n = input.nextLong();
		x = sumDigits(n);
		System.out.println("The sum of all digits (" + n + ") is " + x);
		
		
		input.close();
	}

}
