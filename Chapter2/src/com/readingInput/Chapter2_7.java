package com.readingInput;

import java.util.*;

	public class Chapter2_7 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the number of minutes: ");
			int number = input.nextInt();
			
			int sumOfHour = number/60;
			int sumOfDay = sumOfHour/24;
			int sumOfYear = sumOfDay/365;
			int remainingDay = sumOfDay%365;
			
			System.out.println(number + " minutes is approximately " + sumOfYear + " years and " + remainingDay + " days");
			
		}
}
