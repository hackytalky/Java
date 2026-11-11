package com.Array;
import java.util.*;
public class Exercise4 {
	
	public static double indexOfLargestElement(double[] array) {
		
		double max = array[0];
		double index = 0;
		for(int i = 0;i<array.length;i++) {
			if(max < array[i])
				max = array[i];
				index = i;
		}
		
		return index;
	}
	
	public static double largestElement(double[] array) {
		
		double max = array[0];
		for(int i = 0;i<array.length;i++) {
			if(max < array[i])
				max = array[i];
				
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double[] array = new double[10];
		System.out.println("Enter numbers: ");
		for(int i = 0;i<array.length;i++) {
			array[i] = input.nextDouble();
			
		}
		
		double findIndex = indexOfLargestElement(array);
		double largestNumber = largestElement(array);
		
		System.out.println("The largest number is " + largestNumber + " in index " + findIndex);
	}

}
