package com.Loop;

import java.util.*;
public class Exercise1 {
	
	
	public static void displayPentagonalNumber(int n) {
		int formula = 0;
		for(int i = 1;i<10;i++) {
			for(int k = 0;k<10;k++) {
				formula = i * (3 * i-1)/2;
				System.out.printf("%4d ",formula);
			}
			System.out.println();
		}
	}

	public static int getPentagonalNumber(int n) {
		int formula = 0;
		int i = 1;
		int count = 1;
		int getNum = 0;
		
		while(i<100) {
			
			formula = i * (3 * i-1)/2;
			
			if(count == n) {
				getNum = formula;
			}
			
			i++;
			count++; 
			
		}
		return getNum;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		int getNumber = getPentagonalNumber(n);
		System.out.println("Here it is: "+ getNumber);
		
		displayPentagonalNumber(n);
		
		
		
		
	}
	
	

}
