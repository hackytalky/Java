package excemption.com;
import java.util.*;

public class exceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
		try {
			System.out.println("Enter a number: ");
			int a = input.nextInt();
			System.out.println("Enter a number: ");
			int b = input.nextInt();
			
			int result = multiplyNumber(a,b);
			System.out.println("Results: " + result);
			
			
			
		}
		catch(ArithmeticException  e) {
			System.out.println("Cannot divide by zero!");
		}
		
		System.out.println("It ends here!");
	}
	
	public static int multiplyNumber(int a, int b) {
		return a / b;
	}
	

}
