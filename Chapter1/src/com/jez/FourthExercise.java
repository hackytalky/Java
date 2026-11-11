package com.jez;

public class FourthExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer b = 1;
		
		Integer a = b++;
		
		System.out.println("a a^2 a^3 a^4");
		System.out.println(a + " " + (int) Math.pow(a, 2) + " " + (int) Math.pow(a, 3) + " " + (int) Math.pow(a, 4));
		a = b;
		System.out.println(a + " " + (int) Math.pow(a, 2) + " " + (int) Math.pow(a, 3) + " " + (int) Math.pow(a, 4));
		a = b+1;
		System.out.println(a + " " + (int) Math.pow(a, 2) + " " + (int) Math.pow(a, 3) + " " + (int) Math.pow(a, 4));
		a = b+2;
		System.out.println(a + " " + (int) Math.pow(a, 2) + " " + (int) Math.pow(a, 3) + " " + (int) Math.pow(a, 4));
	}

}
