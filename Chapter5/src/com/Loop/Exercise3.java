package com.Loop;


public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c = 0;
	
		System.out.println("Celsius     Farenheight");
		for(c = 0;c<=100;c++) {
			
			System.out.printf("%2d%21.1f\n", c, (c * (9/5.0) + 32));
			c+=1;
			
		}
			
	}

}
