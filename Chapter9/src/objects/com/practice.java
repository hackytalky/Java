package objects.com;
import java.util.*;

class Calculator {
	private int num1;
	private int num2;

	Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() { return num1; }
	public int getNum2() { return num2; }
	public void setNum1(int num1) { this.num1 = num1; }
	public void setNum2(int num2) { this.num2 = num2; }

	public int add()        { return num1 + num2; }
	public int subtract()   { return num1 - num2; }
	public int multiply()   { return num1 * num2; }
	public double divide()  { return (double) num1 / num2; }
}

public class practice {

	static Scanner input = new Scanner(System.in);

	// Keeps asking until the user types a valid whole number
	static int readInt(String prompt) {
		while (true) {
			System.out.print(prompt);
			if (input.hasNextInt()) {
				return input.nextInt();
			}
			System.out.println("Please enter a whole number.");
			input.next();   // throw away the bad input
		}
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator(0, 0);   // created once
		int choice;

		do {
			System.out.println("\nCalculator");
			System.out.println("1.Add");
			System.out.println("2.Subtract");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			choice = readInt("Enter your choice: ");

			if (choice == 5) {
				System.out.println("Goodbye!");
				continue;
			}
			if (choice < 1 || choice > 4) {
				System.out.println("Invalid choice.");
				continue;
			}

			// User input goes into the object through the setters
			calc.setNum1(readInt("Value 1: "));
			calc.setNum2(readInt("Value 2: "));

			switch (choice) {
			case 1:
				System.out.println(calc.getNum1() + " + " + calc.getNum2() + " = " + calc.add());
				break;
			case 2:
				System.out.println(calc.getNum1() + " - " + calc.getNum2() + " = " + calc.subtract());
				break;
			case 3:
				System.out.println(calc.getNum1() + " * " + calc.getNum2() + " = " + calc.multiply());
				break;
			case 4:
				if (calc.getNum2() == 0) {
					System.out.println("Cannot divide by zero.");
				} else {
					System.out.println(calc.getNum1() + " / " + calc.getNum2() + " = " + calc.divide());
				}
				break;
			}
		} while (choice != 5);

		input.close();
	}
}