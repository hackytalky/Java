package com.Loop;

import java.util.*;

public class Exercise6 {
	public static void displayPattern(int n) {
	
		int  i = 0,j = 0,x = 0;
	
		for( i=1;i<n;i++) {
			for(j = 2 * (n-i);j>=1;j--) {
				
				System.out.print(" ");
			}	
			for(x = 1;x<=i;x++) {
				System.out.print(x + " " );
				
			}
			
			System.out.println();
		}
		for (x = n; x >= 1; x--) {
	        System.out.print(x + " ");
	    }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		displayPattern(num);
	}

}
