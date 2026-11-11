package com.Selection;


import java.util.*;

public class Exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int month, day, year;
		int dayOfWeek;
		
		System.out.println("Enter year: (e.g., 2026): ");
		year = input.nextInt();
		System.out.println("Enter month: 1−12: ");
		month = input.nextInt();
		System.out.println("Enter the day of the month: ");
		day = input.nextInt();
		
		
		dayOfWeek = ((day + (26 * (month+1)/10) + (year%100) + ((year%100)/4) + ((year/100)/4) + (5 * (year/100))) % 7); 

		
		switch(dayOfWeek) {
		
		case 0:
			System.out.println("Day of the week is Saturday");
			break;
		case 1:
			System.out.println("Day of the week is Sunday");
			break;
		case 2:
			System.out.println("Day of the week is Monday");
			break;
		case 3:
			System.out.println("Day of the week is Tuesday");
			break;
		case 4:
			System.out.println("Day of the week is Wednesday");
			break;
		case 5:
			System.out.println("Day of the week is Thursday");
			break;
		case 6:
			System.out.println("Day of the week is Friday");
			break;
			
		}
		input.close();
	}

}
