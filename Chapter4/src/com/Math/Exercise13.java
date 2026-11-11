package com.Math;

import java.util.*;
public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int givenMonth = 0;
		
		
		System.out.println("Enter a year: ");
		
		if(!input.hasNextInt()) {
			System.out.println("It is not a number.");
			input.close();
			return;
		}
		
		int year = input.nextInt();
		
		
		System.out.println("Enter a month: ");
		String month = input.next();
		
		
		
		switch(month) {
		case "Jan":
			givenMonth = 1;
			break;
		case "Feb":
			givenMonth = 2;
			break;
		case "Mar":
			givenMonth = 3;
			break;
		case "Apr":
			givenMonth = 4;
			break;
		case "May":
			givenMonth = 5;
			break;
		case "Jun":
			givenMonth = 6;
			break;
		case "Jul":
			givenMonth = 7;
			break;
		case "Aug":
			givenMonth = 8;
			break;
		case "Sep":
			givenMonth = 9;
			break;
		case "Oct":
			givenMonth = 10;
			break;
		case "Nov":
			givenMonth = 11;
			break;
		case "Dec":
			givenMonth = 12;
			break;
		default:
			System.out.println(month + " is not a month.");
			input.close();
			return;
		
		}
		
		Calendar days = Calendar.getInstance();
		
		days.set(Calendar.YEAR,year);
		days.set(Calendar.MONTH,givenMonth - 1);
		days.set(Calendar.DAY_OF_MONTH, 1);
		
		int getDaysOfMonth = days.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println(month + " " + year + " has " + getDaysOfMonth + " days");
		}
		
			
	
		
		
		
	}


