package com.Array;

import java.util.*;
public class Exercise1 {
	
	public static double max(double[] array) {
		
		double max = array[0];
		
		for(int i = 0;i<array.length;i++) {
			if(max < array[i])
				max = array[i];
		
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
		
		double[] array = new double[10];
		int i = 0;
		for( i = 0;i<array.length;i++) {
			System.out.println("Enter a number: ");
			array[i] = input.nextDouble();
		}
		
		//String array2 = Arrays.toString(array);
		double nod = max(array);
		
		System.out.println("The greatest number is: " + nod);
		
		

	}

}
