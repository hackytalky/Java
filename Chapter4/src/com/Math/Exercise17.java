package com.Math;

import java.util.*;

public class Exercise17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter string s1:");
		String st1 = input.nextLine();
		
		System.out.println("Enter string s2:");
		String st2 = input.nextLine();
		
		if (st1.contains(st2)) {
			if(st1.indexOf(st2) == 0) {
				System.out.println(st2 + "  is a prefix of " + st1);
			}else 
				System.out.println(st2 + "  is not a prefix of " + st1);
		}else 
			System.out.println(st2 + "  is not a prefix of " + st1);
		
		
		
	}

}
