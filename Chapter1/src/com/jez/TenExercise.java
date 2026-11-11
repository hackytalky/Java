package com.jez;

public class TenExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sec_in_year = 31536000;
		
		double seven_sec = sec_in_year / 7f;
		double thirteen_sec = sec_in_year / 13f;
		double forty_five_sec = sec_in_year / 45f;
		
		System.out.println(((seven_sec + thirteen_sec + forty_five_sec) * 5) + "total of population in year");
		
		
	}

}
