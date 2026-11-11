package com.Selection;

import java.util.*;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double num = Math.random();
		String result = "";
		
		
		if ((num >=0) && ( num < 1.0/3))
			result = "Scissor";
		else if ((num >= 1.0/3) && (num < 2.0/3))
			result = "Rock";
		else if ((num >= 2.0/3) && (num < 1))
			result = "Paper";
		
		System.out.println("0 - Scissor,  1 - Rock, 2 - Paper. Choose: ");
		int choose = input.nextInt();
		
		if ((result.equals("Scissor")) && (choose == 1)) 
			System.out.println("The computer is " + result + ". You are Rock. You lose!");
		else if ((result.equals("Scissor")) && (choose == 0))
			System.out.println("The computer is " + result + ". You are Scissor. Its draw!");
		else if((result.equals("Scissor")) && (choose == 2))
				System.out.println("The computer is " + result + ". You are Paper. You win!");
		else if((result.equals("Rock")) && (choose == 0))
			System.out.println("The computer is " + result + ". You are Scissor. You lose!");
		else if((result.equals("Rock")) && (choose == 1))
			System.out.println("The computer is " + result + ". You are Rock too. Its a draw!");
		else if((result.equals("Rock")) && (choose == 2))
			System.out.println("The computer is " + result + ". You are Paper. You win!");
		else if((result.equals("Paper")) && (choose == 0))
			System.out.println("The computer is " + result + ". You are Scissor. You win!");
		else if((result.equals("Paper")) && (choose == 1))
			System.out.println("The computer is " + result + ". You are Rock. You lose!");
		else
			System.out.println("The computer is " + result + ". You are Paper. Its a draw!");
		
			
		
			
	}

}
