package com.jez;
import java.text.DecimalFormat;

public class TwelveExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 3.4f;
		float b = 50.2f;
		float c = 2.1f;
		float d = 0.55f;
		float e = 44.5f;
		float f = 5.9f;
		float determinator = (a * d) - (b * c);
		DecimalFormat df = new DecimalFormat("#0.000");
		
		float x_determinant = ((e * d) - (b * f)) / determinator;
		float y_determinant = ((a * f) - (e * c)) / determinator;
		
		System.out.println("x = " + df.format(x_determinant) + "\n" + "y = " + df.format(y_determinant));
	}

}
