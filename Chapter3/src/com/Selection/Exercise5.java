package com.Selection;

import java.util.*;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Month (1-12): ");
		int month = input.nextInt();
		
		
		System.out.println("Year: ");
		int year = input.nextInt();
		
		Calendar days = Calendar.getInstance();
		
		days.set(Calendar.YEAR,year);
		days.set(Calendar.MONTH,month - 1);
		days.set(Calendar.DAY_OF_MONTH, 1);
		
		int getDaysOfMonth = days.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("The month has " + getDaysOfMonth + " days");
		
	}

}
