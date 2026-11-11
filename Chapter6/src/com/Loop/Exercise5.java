package com.Loop;

import java.util.*;

public class Exercise5 {
	
	public static int reverseNumber(int n) {
		int reverse = 0;
		
		while(n!=0) {
			int lastDigit = n%10;
			reverse = reverse * 10 + lastDigit;
			n/=10;
		}
		return reverse;
	}
	
	public static boolean isPalindrome(int n) {
		
		int x = reverseNumber(n);
		if(x == n) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number = 0;
		
		
		System.out.println("Enter a number: ");
		number = input.nextInt();
		
		int x = reverseNumber(number);
		boolean y = isPalindrome(number);
		System.out.println("Reverse number: " + x);
		
		if(y)
		 System.out.println("The integer " + number + " is a palindrome.");
		else
			System.out.println("The integer " + number + " is not a palindrome.");
		
	}

}
