package com.Loop;

import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int score = 0,n = 0,i = 0,lowestScore = Integer.MAX_VALUE,secondLowest = Integer.MAX_VALUE;
		String name = "",lowestName = "",secondName = "";
		
		System.out.println("Enter the number of students: ");
		n = input.nextInt();
		
		for(i = 0;i<n;i++) {
			System.out.println("Enter the name of students: ");
			name = input.next();
			System.out.println("Enter the scores : ");
			score = input.nextInt();
			
			if(score < lowestScore) {
				secondLowest = lowestScore;
				secondName = lowestName;
				
				lowestScore = score;
				lowestName = name;}
			
			if(score > lowestScore && score < secondLowest) {
				secondLowest = score;
				secondName = name;}
			
		}
		
		System.out.println("The lowest score is " + lowestScore + ", " + lowestName);
		System.out.println("The second lowest score is " + secondLowest + ", " + secondName);
		
	}
}
