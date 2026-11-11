package com.Loop;

public class Exercise3 {
	
	public static double mileToKilometer(double miles) {
		return miles * 0.621371;
	}
	
	public static double kilometerToMile(double kilometer) {
		return kilometer * 1.60934;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double miles = 0,kilometers = 0;
		int a = 20;
		
		System.out.printf("%-15s %-15s %-15s %-15s %-15s\n","Miles","Kilometers"," | ","Kilometers","Miles");
	
		
		for(int i = 1;i<=10;i++) {
			
			miles = kilometerToMile(i);
			kilometers = mileToKilometer(a);
		
			System.out.printf("%-15d %-16.3f %-14s %-15d %-15.3f\n",i,miles,"|",a,kilometers);
			a+=5;
			
		
		}
		
		
		
	}

}
