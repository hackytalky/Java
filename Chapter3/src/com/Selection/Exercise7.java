package com.Selection;

import java.util.*;
public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num = (int) (Math.random()*2);
		
		System.out.println("0 - Head or 1 - Tails. Choose: ");
		int choose = input.nextInt();
		
		if (num == 1 && choose == 0)
			System.out.println("Head");
		else
			System.out.println("Tails");
			

		
	}

}
