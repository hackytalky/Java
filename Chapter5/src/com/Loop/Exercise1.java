package com.Loop;

import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int score = 0;
	
		
		while(true) {
			
			System.out.println("Enter your score: ");
			
			if(!input.hasNextInt()) {
				System.out.println("Invalid Output.");
				input.close();
				return;
			}
			score = input.nextInt();
			
			if(score == -1) {
				break;
			}else if(score >= 60){
				System.out.println("You pass the exam!");
				continue;
			}else {
				System.out.println("You did not pass the exam!");
				continue;
			}
			
	
		}
		
		
	
		
		
		
		
		
		
	
		
	}

}
