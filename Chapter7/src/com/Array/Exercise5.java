package com.Array;
import java.util.*;

public class Exercise5 {
	
	public static void displayChoices() {
		
		System.out.println();
		System.out.println();
		for(int i = 0;i<40;i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.println();
		System.out.printf("%34s","Console Grade Book Manager");
		System.out.println();
		System.out.println();
		
		for(int i = 0;i<40;i++) {
			System.out.print("=");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("[1]Add Students");
		System.out.println("[2]Display students and scores");
		System.out.println("[3]Show Statistics");
		System.out.println("[4]Show Grade Report");
		System.out.println("[5]Display Ranking");
		System.out.println("[6]Search Student's Information");
		System.out.println("[7]Exit");
		
		System.out.println();
	
		
		for(int i = 0;i<40;i++) {
			System.out.print("=");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public static void displayAll(int[] scores, String[]students, int size) {
		for(int i = 0;i<size;i++) {
			System.out.printf("%-5d %-15s %10d\n", i, students[i], scores[i]);
		}
	}
	
	public static int averageScore(int[] scores) {
		int average = 0;
		int sum = 0;
		for(int i = 0;i<scores.length;i++) {
			sum+=scores[i];
		}
		
		return average = sum/scores.length;
		
	}
	public static int maxScore(int[] scores) {
		int max = scores[0];
		
		for(int i = 0;i < scores.length;i++) {
			if(max < scores[i]) {
				max = scores[i];
			}
		}
		return max;
	}
	public static int minScore(int[] scores) {
		int min = scores[0];
		
		for(int i = 0;i < scores.length;i++) {
			if(min > scores[i]) {
				min = scores[i];
			}
		}
		return min;
	}
	public static void showGrade(String[] name, int[] score,int size,int max) {
		char grade = ' ';
		for(int i = 0;i<size;i++) {
			if(score[i]>= max-10) {
				grade = 'A';
			}else if(score[i]>= max-20) {
				grade = 'B';
			}else if(score[i]>= max-30) {
				grade = 'C';
			}else if(score[i]>= max-40) {
				grade = 'D';
			}else
				grade = 'F';
			
			System.out.printf("%-5d %-15s %10d %8c\n", i, name[i], score[i], grade);
		}
	}
	
	public static void sortGrade(int[] score, String[] student, int size,int max) {
		int temp = 0;
		String swap = "";
		boolean swapped = false;
		char grade = ' ';
		
		for(int i = 0;i<size-1;i++) {
			swapped = false;
			for(int j = 0;j<size-i-1;j++) {
				if(score[j] < score[j+1]) {
					temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
				
					
					swap = student[j];
					student[j] = student[j+1];
					student[j+1] = swap;
					
					swapped = true;
				}
				
			}
			if(swapped == false)
				break;
		}
		
		for(int i = 0;i<size;i++) {
			if(score[i]>= max-10) {
				grade = 'A';
			}else if(score[i]>= max-20) {
				grade = 'B';
			}else if(score[i]>= max-30) {
				grade = 'C';
			}else if(score[i]>= max-40) {
				grade = 'D';
			}else
				grade = 'F';
			
			System.out.printf("%-5d %-15s %10d %8c\n", i, student[i], score[i], grade);
		}
		
	}
	public static void searchStudent(String[] name, int[] score,int size, String search, int max) {
		char grade = ' ';
		String find = " ";
		int index = 0;
		int getScore = 0 ;
		boolean found = false;
		String point = " ";
		int grab = 0;
		for(int i = 0;i<size;i++) {
			if(name[i].equalsIgnoreCase(search)) {
				find = name[i];
				index = i;
				found = true;
				break;
			}
			
		}
		point = find;
		for(int i = 0;i<size;i++) {
			if(i == index) {
				getScore = score[i];
			}
		}
		
		grab = getScore;
		
		if(grab>= max-10) {
			grade = 'A';
		}else if(grab>= max-20) {
			grade = 'B';
		}else if(grab>= max-30) {
			grade = 'C';
		}else if(grab>= max-40) {
			grade = 'D';
		}else
			grade = 'F';
		
		if(found == true) {
			System.out.println("Student Name: " + point);
			System.out.println("Score : " + grab);
			System.out.println("Grade : " + grade);
		}else 
			System.out.println("Student not found!");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int selection = 0;
		int size = 0;
		int maxScore = 0, averageScore = 0,minScore = 0;
		String find = "";
		String[] students = new String[size];
		int[] scores = new int[size];
		
		
		while(true) {
			displayChoices();
			System.out.println("Choose: ");
			selection = input.nextInt();
			System.out.println();
		
			switch(selection) {
			
			case 1:
				System.out.println("How many students you want to add?");
				size = input.nextInt();
				
				students = new String[size];
				scores = new int[size];
				

				for(int i = 0;i<size;i++) {
					System.out.println("Enter student's name and score: ");
					students[i] = input.next();
					scores[i] = input.nextInt();
				}
				break;
			
			case 2:
				
				for(int i = 0;i<40;i++) {
					System.out.print("=");
				}
				System.out.println();
				System.out.println();
				System.out.printf("%28s","Display Students");
				System.out.println();
				System.out.println();
				
				for(int i = 0;i<40;i++) {
					System.out.print("=");
				}
				System.out.println();
				System.out.println();
				System.out.printf("%-5s %-15s %10s\n", "No.", "Name", "Score");
				displayAll(scores,students,size);
				
				System.out.println();
				System.out.println();
				for(int i = 0;i<40;i++) {
					System.out.print("=");
				}
				
				System.out.println();
				break;
			case 3:
				for(int i = 0;i<40;i++) {
					System.out.print("=");
				}
				System.out.println();
				System.out.println();
				System.out.printf("%28s","Class Statistics");
				System.out.println();
				System.out.println();
				
				for(int i = 0;i<40;i++) {
					System.out.print("=");
				}
				System.out.println();
				System.out.println();
				
				maxScore = maxScore(scores);
				minScore = minScore(scores);
				averageScore = averageScore(scores);
				
				System.out.println("Average Score: " + averageScore);
				System.out.println("Highest Score: " + maxScore);
				System.out.println("Lowest Score: " + minScore);
				
				
				System.out.println();
				System.out.println();
				for(int i = 0;i<40;i++) {
					System.out.print("=");
				}
				
				System.out.println();
				break;
			case 4:
				for(int i = 0;i<40;i++) {
					System.out.print("=");
				}
				System.out.println();
				System.out.println();
				System.out.printf("%28s","Grade Report");
				System.out.println();
				System.out.println();
				
				for(int i = 0;i<40;i++) {
					System.out.print("=");
				}
				
				System.out.println();
				System.out.println();
				System.out.println("Highest Score: " + maxScore);
				System.out.println();
				
				System.out.printf("%-5s %-15s %10s %8s\n", "No.", "Name", "Score", "Grade");
				showGrade(students,scores,size,maxScore);
				System.out.println();
				
				System.out.println();
				System.out.println();
				for(int i = 0;i<40;i++) {
					System.out.print("=");
				}
				
				System.out.println();
				break;
			case 5:
				for(int i = 0;i<40;i++) {
					System.out.print("=");
				}
				System.out.println();
				System.out.println();
				System.out.printf("%28s","Display Ranking");
				System.out.println();
				System.out.println();
				
				for(int i = 0;i<40;i++) {
					System.out.print("=");
				}
				
				System.out.println();
				System.out.println();
				//System.out.printf("%8s %23s\n","Name","Scores");
				System.out.printf("%-5s %-15s %10s %8s\n", "No.", "Name", "Score", "Grade");
				sortGrade(scores, students,size,maxScore);
				
				
				System.out.println();
				System.out.println();
				for(int i = 0;i<40;i++) {
					System.out.print("=");
				}
				
				System.out.println();
				break;
			case 6:
				System.out.println("Enter student name to search: ");
				find = input.next();
				
				System.out.println();
				
				for(int i = 0;i<40;i++) {
					System.out.print("=");
				}
				System.out.println();
				System.out.println();
				System.out.printf("%28s","Search Result");
				System.out.println();
				System.out.println();
				
				for(int i = 0;i<40;i++) {
					System.out.print("=");
				}
				
				System.out.println();
				System.out.println();
				
				searchStudent(students,scores,size,find,maxScore);
				
				System.out.println();
				System.out.println();
				for(int i = 0;i<40;i++) {
					System.out.print("=");
				}
				
				System.out.println();
				break;
			case 7:
				String answer = " ";
				System.out.println("Are you sure to exit?(Y/N)");
				answer = input.next();
				
				if(answer.equalsIgnoreCase("Y")) 
					System.exit(0);
				
				break;
					
				
			}
		}	

	}
}
