package com.readingInput;

import java.util.*;

public class Chapter2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the time zone offset to GMT: ");
		int timeZone = input.nextInt();
		
		long totalMilliseconds = System.currentTimeMillis();
		 
		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;
		
		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
	
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
	
		// Obtain the total hours
	    long totalHours = (totalMinutes / 60);
		
		// Compute the current hour
		long currentHour = (totalHours % 24) + timeZone;
		
		// Display results
		System.out.println("The current time is " + currentHour + ":"+ currentMinute + ":" + currentSecond + " GMT");
	}

}
