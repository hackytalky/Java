package com.Loop;
import java.util.*;

public class CafeMenu {
	
	
	public static void viewMenu() {
		System.out.println();
		for(int i = 0;i<15;i++) {
			System.out.print("-");
		}
		System.out.print(" Menu ");
		for(int i = 0;i<15;i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.printf("%-18s %8s","1. Coffee","$120.00\n");
		System.out.printf("%-18s %8s","2. Latte","$150.00\n");
		System.out.printf("%-18s %8s","3. Cappucino","$160.00\n");
		System.out.printf("%-18s %8s","4. Cake","$100.00\n");
		System.out.printf("%-18s %8s","5. Sandwhich","$130.00\n");
		
		for(int i = 0;i<36;i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static double subTotal(double value,double quantity) {
		
		if(value == 1) 
			return 120.00 * quantity;
		else if(value == 2)
			return  150.00 * quantity;
		else if(value == 3)
			return 160.00 * quantity;
		else if(value == 4)
			return 100.00 * quantity;
		else
			return 130.00 * quantity;
	}
	public static double discount(double total) {
		return total / 10.0;
	}
	public static double interest(double category) {

	    int choice = (int) category;

	    if (choice == 1)
	        return 0.10;
	    else if (choice == 2)
	        return 0.15;
	    else
	        return 0.0;
	}
	
	public static double tax(double subTotal, double interest,double discount) {
		
		return (subTotal-discount) * interest;
	}
	public static double total(double subTotal, double discount,double tax) {
		return subTotal + (discount-tax);
	}
	public static double change(double amountMoney, double total ) {
		return amountMoney - total;
	}
	
	public static void showQuantity(int coffeeQuantity, int latteQuantity, int cappucinoQuantity,int cakeQuantity, int sandwhichQuantity) {
		if(coffeeQuantity > 0)
			System.out.printf("%-30s %-1s %1d\n","Coffee","x",coffeeQuantity);
		if(latteQuantity > 0)
			System.out.printf("%-30s %-1s %1d\n","Latte","x", latteQuantity);
		if(cappucinoQuantity > 0)
			System.out.printf("%-30s %-1s %1d\n","Cappucino","x",cappucinoQuantity);
		if(cakeQuantity > 0)
			System.out.printf("%-30s %-1s %1d\n","Cake","x",cakeQuantity);
		if(sandwhichQuantity > 0)
			System.out.printf("%-30s %-1s %1d\n","Sandwhich","x", sandwhichQuantity);
		
	}
	public static void showIntro() {
		System.out.println();
		for(int i = 1;i<=36;i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.printf("%25s","Cafe Blanc\n");
		System.out.printf("%28s","Ordering System\n");
		for(int i = 1;i<=36;i++) {
			System.out.print("=");
		}

		System.out.println();
		System.out.println();

		System.out.println("1. View Menu");
		System.out.println("2. Place Order");
		System.out.println("3. View Current Order");
		System.out.println("4. Checkout");
		System.out.println("5. Exit");
	}
	public static void main(String[] args ) throws InterruptedException{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int coffeeQuantity = 0,latteQuantity = 0,cappucinoQuantity = 0,cakeQuantity = 0, sandwhichQuantity = 0, selection = 0,item = 0,quantity = 0,money = 0,preference = 0;
		char again = 'Y';
		double subTotalclone  = 0,subTotal= 0, change = 0,discount1 = 0,tax1 = 0, intInterest = 0, total1 = 0, changePreference = 0;
		
		while(true) {
			
			showIntro();
			System.out.println("Enter choice: ");
			if (input.hasNextInt()) {
			    selection = input.nextInt();
			} else {
			    System.out.println("Invalid Input!");
			    input.close();
			    System.exit(0);
			}
			
			switch(selection) {
			
			
			case 1:
				viewMenu();
				break;
			case 2:
				viewMenu();
				while(again == 'Y' || again == 'y') {
					System.out.println("Enter item: ");
					item = input.nextInt();
					System.out.println("Enter quantity: ");
				    quantity = input.nextInt();
					
				    switch(item) {
				    
				    case 1:
				    	System.out.println("Coffee " + quantity + "x added!");
				    	subTotalclone+=subTotal(item,quantity);
				    	coffeeQuantity+=quantity;
				    	break;
				    case 2:
				    	System.out.println("Latte " + quantity + "x added!");
				    	subTotalclone+=subTotal(item,quantity);
				    	latteQuantity+=quantity;
				    	break;
				    case 3:
				    	System.out.println("Cappucino " + quantity + "x added!");
				    	subTotalclone+=subTotal(item,quantity);
				    	cappucinoQuantity+=quantity;
				    	break;
				    case 4:
				    	System.out.println("Cake " + quantity + "x added!");
				    	subTotalclone+=subTotal(item,quantity);
				    	cakeQuantity+=quantity;
				    	break;
				    case 5:
				    	System.out.println("Sandwhich " + quantity + "x added!");
				    	subTotalclone+=subTotal(item,quantity);
				    	sandwhichQuantity+=quantity;
				    	break;
			
				    	
				    
				    }
				    Thread.sleep(1000);
				    System.out.println("Add another item?");
			    	again = input.next().charAt(0);
			    
				
			}
						break;
						
			case 3:
				
				if(coffeeQuantity == 0 && latteQuantity == 0 && cappucinoQuantity == 0 && cakeQuantity == 0 && sandwhichQuantity == 0) {
					System.out.println("You did not order anything on the menu.");
				}else {
					for(int i = 1;i<=36;i++) {
						System.out.print("=");
					}
					System.out.println();
					System.out.printf("%25s\n"," Your Current Order ");
					for(int i = 1;i<=36;i++) {
						System.out.print("=");
					}
					System.out.println();
					System.out.println();
					showQuantity(coffeeQuantity,latteQuantity,cappucinoQuantity,cakeQuantity,sandwhichQuantity);
					System.out.println();
					
					
					System.out.println();
					System.out.println();
					
					for(int i = 1;i<=36;i++) {
						System.out.print("=");
					}
					
				}
				break;
				
				
			case 4:
			    System.out.println("This is your total amount of order:" + subTotalclone);
			    System.out.println("Discount: ");
			    System.out.println("1. Student - 10%");
			    System.out.println("2. Senior - 15%");
			    System.out.println("3.  None");

			    System.out.println("Choose: ");
			    preference = input.nextInt();

			    System.out.println("Please enter your amount");
			    money = input.nextInt();

			    for(int i = 0;i<15;i++) {
			        System.out.print("=");
			    }
			    System.out.print("Receipt");
			    for(int i = 0;i<15;i++) {
			        System.out.print("=");
			    }
			    System.out.println();

			    showQuantity(coffeeQuantity,latteQuantity,cappucinoQuantity,cakeQuantity,sandwhichQuantity);

			    System.out.println();
			    System.out.println();

			    System.out.printf("%-15s %18.2f\n","Subtotal: ", subTotalclone);

			    discount1 = discount(subTotalclone);
			    System.out.printf("%-15s %18.2f\n","Discount: ", discount1);

			    intInterest = interest(preference);
			    tax1 = tax(subTotalclone, intInterest, discount1);
			    System.out.printf("%-15s %18.2f\n","Tax: ", tax1);

			    for(int i = 0;i<36;i++) {
			        System.out.print("-");
			    }
			    System.out.println();

			    total1 = (subTotalclone - discount1) + tax1;
			    System.out.printf("%-15s %18.2f\n","Total", total1);

			    change = money - total1;

			    System.out.printf("%-15s %18d\n","Payment", money);
			    System.out.printf("%-15s %18.2f\n","Change", change);

			    System.out.println();
			    System.out.println();
			    System.out.println();

			    int order = (int)(Math.random()* 1000) + 1;
			    System.out.printf("%-15s %18d\n","Order No.", order);

			    System.out.println();
			    System.out.println();

			    for(int i = 0;i<36;i++) {
			        System.out.print("=");
			    }
			    System.out.println();
			    System.out.printf("%25s\n"," THANK YOU!! ");
			    for(int i = 0;i<36;i++) {
			        System.out.print("=");
			    }
			    System.out.println();

			    break;
			case 5:
				System.out.println("Do you still want to continue?(Y/N");
				char answer = input.next().charAt(0);
				
				if(answer == 'Y' || answer == 'y')
					continue;
				else
					System.exit(0);
				
				Thread.sleep(1000);
			
			}
			 
		}

	}

}


