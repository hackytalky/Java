package com.Loop;
import java.util.*;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER_OF_QUESTIONS = 10;
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		String output = " ";
		Scanner input = new Scanner(System.in);
		
		while(count < NUMBER_OF_QUESTIONS) {
			int nmb1 = (int) (Math.random() * 12) + 1;
			int nmb2 = (int) (Math.random() * 12) + 1;
			
			if (nmb1 < nmb2) {
				int temp = nmb1;
				nmb1 = nmb2;
				nmb2 = temp;
			}
			
			System.out.print("What is " + nmb1 + " - " + nmb2 + "? ");
			
			int answer = input.nextInt();
			
			if((nmb1 - nmb2) == answer) {
				System.out.println("You are correct!");
				correctCount++;
			}else 
				System.out.println("Your answer is wrong.\n" + nmb1 + " - " + nmb2 + " should be " + (nmb1 - nmb2));
			
			count++;
			
			output += "\n" + nmb1 + " - " + nmb2 + "=" + answer + ((nmb1 - nmb2 == answer)? " correct": " wrong");
			
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime/100 + "seconds\n" + output );
		
		input.close();
	}

}
