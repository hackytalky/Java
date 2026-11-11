package objects.com;

import java.util.Scanner;

class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void addStudent(String student) {
		if (numberOfStudents < students.length) {
			students[numberOfStudents] = student;
			numberOfStudents++;
		} else {
			System.out.println("Course is full. Cannot add " + student);
		}
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
}

public class courseSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Course c1 = new Course("DSA");
		Course c2 = new Course("English");

		System.out.println("How many students for " + c2.getCourseName() + "?");
		int studentsNum = input.nextInt();
		input.nextLine(); // clears the leftover Enter key

		for (int j = 0; j < studentsNum; j++) {
			System.out.println("Enter student name:");
			String add = input.nextLine();
			c2.addStudent(add);
		}

		System.out.println("Number of students in " + c2.getCourseName() + ": " + c2.getNumberOfStudents());

		String[] students = c2.getStudents();
		for (int i = 0; i < c2.getNumberOfStudents(); i++) {
			System.out.print(students[i]);
			if (i < c2.getNumberOfStudents() - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();

		input.close();
	}
}