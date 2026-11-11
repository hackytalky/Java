package com.Loop;

import java.util.*;
public class Exercise9 {
	
	public static double poundtoKilogram(double pound) {
		return 2.204 * pound;
		
	}
	
	public static double kilogramtoPound(double kilogram) {
		return 0.453 * kilogram;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int y = 20;
		double ptoK,ktoP;
		
		
		System.out.printf("%-15s %-15s %-15s %-15s %-15s\n","|Kilograms", "Pounds", "|", "Pounds","Kilogram|");
		for(int i = 1;i<74;i++) {
			System.out.print("-");
		}
		System.out.println();
		for(int i = 1;i<200;i+=2) {
			ptoK = poundtoKilogram(i);
			ktoP = kilogramtoPound(y);
			System.out.printf("%-15d %-15.1f %-15s %-15d %-15.2f\n",i,ptoK,"|",y,ktoP);
			y+=5;
			
		}
		
		
	}

}
