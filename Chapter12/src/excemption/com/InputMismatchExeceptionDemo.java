package excemption.com;
import java.util.*;
public class InputMismatchExeceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		boolean continueInput = true;
		
		do {
			try {
				System.out.println("Enter an integer: ");
				int number = input.nextInt();
				
				System.out.println("The number entered is " + number);
				
				continueInput = false;
			}catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is requried");
				input.nextLine();//discard input
			}
		
		}while (continueInput);
	}

}
