package com.Array;
import java.util.*;


public class Exercise3 {
	public static int[] sortArray(int[] array) {
		int temp = 0;
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
		
		return array;
	}
	public static int[] merge(int[] array1, int[] array2) {
		int i = 0,j = 0,k = 0;
		int[] result = new int[array1.length +  array2.length];
		while(i < array1.length && j < array2.length) {
			if(array1[i] <= array2[j]) {
				result[k] = array1[i];
				i++;
			}else{
				result[k] = array2[j];
				j++;
			}
			k++;
		}
		while (i < array1.length) {
		    result[k] = array1[i];
		    i++;
		    k++;
		}
		while (j < array2.length) {
		    result[k] = array2[j];
		    j++;
		    k++;
		}
	return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int size = 0, size2 = 0;
		
		System.out.print("Enter the list1 size and content: ");
		size = input.nextInt();
		int[] array1 = new int[size];
		for(int i = 0;i<size;i++) {
			array1[i] = input.nextInt();
		}
		
		System.out.print("Enter the list2 size and content: ");
		size2 = input.nextInt();
		int[] array2 = new int[size2];
		for(int i = 0;i<size2;i++) {
			array2[i] = input.nextInt();
		}
		
	
		array1 = sortArray(array1);
		array2 = sortArray(array2);
		
		int[] merged = merge(array1,array2);
		for (int i = 0; i < merged.length; i++) {
		    System.out.print(merged[i] + " ");
		}
	}

}
