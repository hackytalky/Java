package library.com;
import java.util.*;

class Accounts {
	private int accountNumber;
	private double balance;
	
	
	Accounts(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getWithdraw(double amount) {
		return balance-=amount;
	}
	public double getDeposit(double amount) {
		return balance+=amount;
	}
	public void display() {
		System.out.printf("%-10d %12.2f%n",accountNumber, balance);
	}
	
	
	
	
	
	

	
	
};

public class librarySystem {
	static Accounts[] acc = new Accounts[2];
	static int count = 0;

	
	public static void displayMenu() {
		System.out.println();
		System.out.println("Simple Banking System");
		System.out.println("[1] Add accounts");
		System.out.println("[2] Deposit");
		System.out.println("[3] Withdraw");
		System.out.println("[4] Display Account");
		System.out.println("[5] Exit");
		System.out.println("Enter your choice: ");
	}
	
	public static int find(int number) {
		for(int i = 0;i<acc.length;i++) {
			if(acc[i].getAccountNumber() == number) {
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
	
		int found;
		
		while (true){
			displayMenu();
			int choice = input.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Account Id: ");
				int id = input.nextInt();
				System.out.println("Enter initial deposit: ");
				double deposit = input.nextDouble();
				
				if(count == acc.length) {
					acc = Arrays.copyOf(acc, acc.length * 2);
                    System.out.println("(array grew to " + acc.length + " slots)");
				}
				
				acc[count] = new Accounts(id, deposit);
				count++;
				
				System.out.println("Accounts Saved!");
				break;
			case 2:
			    System.out.println("Enter id: ");
			    int accId = input.nextInt();
			    found = find(accId);

			    if(found == -1) {
			        System.out.println("Not found");
			        break;
			    }

			    System.out.println("How much money you want to deposit?");
			    double amount = input.nextDouble();
			    acc[found].getDeposit(amount);
			    System.out.println("Success!");
			    break;
			    
			
			case 3:
				System.out.println("Enter id: ");
				int accId2 = input.nextInt();
			    found = find(accId2);

			    if(found == -1) {
			        System.out.println("Not found");
			        break;
			    }
			    
			    System.out.println("How much money you want to withdraw?");
			    double withdraw = input.nextDouble();
			    acc[found].getWithdraw(withdraw);
			    System.out.println("Withdrawal Successfull!\n You have PHP"+ acc[found].getBalance() + " pesos total in your account!");
			    break;
			
			case 4:
				
				if(count == 0) {
					System.out.println("No accounts!");
					break;
				}
				System.out.printf("%-12s %10s%n","Account ID", "Balance");
				for(int i = 0;i<count;i++) {
					
					acc[i].display();
				}
				break;
			case 5:
				System.out.println("System closed!\n");
				input.close();
				return;
			}
			
		}
		
		
	}

}
