package com.Loop;

import java.util.*;
public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num = 0,factors = 2;
		
		System.out.println("Enter the number: ");
		num = input.nextInt();
		
		while(num != 1) {
			if(num % factors == 0) {
				System.out.print(factors + " ");
				num = num/factors;
			}
			else {
				factors++;
			}
			
			
			
		
			
		}
	}

}
