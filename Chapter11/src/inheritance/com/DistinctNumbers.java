package inheritance.com;
import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ebter integers (input ends with 0): ");
		int value;
		
		do {
			value = input.nextInt();
			
			if(!list.contains(value) && value != 0) {
				list.add(value);
			}
		}while(value!=0);
		
		//for each loop
		System.out.println("The distinct integers are: ");
		for(int number : list) {
			System.out.print(number + " ");
		}
	}

}
