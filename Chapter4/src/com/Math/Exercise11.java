package com.Math;


import java.util.*;
public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter: ");
		char letter = input.next().charAt(0);
		
		if (String.valueOf(letter).matches("[abcABC]")) {
			System.out.println("The corresponding number is 2");
		}else if (String.valueOf(letter).matches("[defDEF]")) {
			System.out.println("The corresponding number is 3");
		}else if (String.valueOf(letter).matches("[ghiGHI]")) {
			System.out.println("The corresponding number is 4");
		}else if (String.valueOf(letter).matches("[jklJKL]")) {
			System.out.println("The corresponding number is 5");
		}else if (String.valueOf(letter).matches("[mnoMNO]")) {
			System.out.println("The corresponding number is 6");
		}else if (String.valueOf(letter).matches("[pqrsPQRS]")) {
			System.out.println("The corresponding number is 7");
		}else if (String.valueOf(letter).matches("[tuvTUV]")) {
			System.out.println("The corresponding number is 8");
		}else if (String.valueOf(letter).matches("[wxyzWXYZ]")) {
			System.out.println("The corresponding number is 9");
		}else {
			System.out.println(letter + " is an invalid output.");
		}
		
		input.close();
	}

}
