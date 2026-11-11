package com.Selection;

import java.util.*;
public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a,b,c,d,e,f,temp;
		
		System.out.println("Enter a three-digit integer: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		
		d = c;
		e = b;
		f = a;
				
		if ((d == a) && (e == b) && (f == c))
			System.out.println(a+""+ b +""+ c + " is a palindrome");
		else
			System.out.println(a+""+ b +""+ c + " is not a palindrome");
		
		

	}

}
