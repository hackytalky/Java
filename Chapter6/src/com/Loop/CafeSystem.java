package com.Loop;

import java.util.*;
public class CafeSystem {

	public static void sortedNumbers (double n1,double n2, double n3) {
		double greatest,center, first;
		
		if(n1 >= n2 && n1 >= n3) {
			greatest = n1;
			
			if(n2>=n3) {
				center = n2;
				first = n3;
			}else {
				center = n3;
				first = n2;
			}
		}else if(n2 >= n1 && n2>=n3){
			greatest = n2;
			
			if(n1>=n3) {
				center = n1;
				first = n3;
			}else {
				center = n3;
				first = n1;
			}
		}else {
			greatest = n3;
			
			if(n1>=n2) {
				center = n1;
				first = n2;
			}else {
				center = n2;
				first = n1;
			}
		}
		
		System.out.println("Sorted Numbers: " + (int)greatest + " "+ (int)center + " " + (int)first);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first num: ");
		double num1 = input.nextDouble();
		System.out.println("Enter second num: ");
		double num2 = input.nextDouble();
		System.out.println("Enter third num: ");
		double num3 = input.nextDouble();
		
		sortedNumbers(num1,num2,num3);
		
		input.close();
	}

}
