package com.Array;
import java.util.*;

public class Exercise2 {
	
	public static void bubbleSort(int[] array, String[] name) {
		int temp = 0;
		String swap = "";
		boolean swapped = false;
		for(int i = 0;i<array.length-1;i++) {
			swapped = false;
			for(int j = 0;j<array.length-i-1;j++) {
				if(array[j] >  array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapped = true;
					
				
				}
			}
			
			if(swapped == false)
				break;
		}
		
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double[] array = new double[10];
		
		for(int i = 0;i<array.length;i++) {
			System.out.print("Enter a number: ");
			array[i] = input.nextDouble();
		}
		
		bubbleSort(array);
	}

}
