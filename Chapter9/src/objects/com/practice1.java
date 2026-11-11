
package objects.com;
import java.util.*;

//This program is for calculating the total payment of getting a loan

class Loan {
	
	private double annualInterest;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	public Loan() {
		this(2.5,1,1000);
	}
	
	public Loan(double annualInterest, int numberOfYears, double loanAmount) {
		this.annualInterest = annualInterest;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}
	
	//in setters it should be void not specific data type
	public void setAnnualInterest(double annualInterest) {
		this.annualInterest = annualInterest;
	}
	public void setNumberYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getannualInterest() {
		return annualInterest;
	}
	public int getNumberYears() {
		return numberOfYears;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterest / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1- (1/Math.pow(1+ monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment()* numberOfYears * 12;
		return totalPayment;
		
	}
	
	public java.util.Date getloanDate(){
		return loanDate;
	}
	
	
}
public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		System.out.println("Enter number of years:);");
		int numberOfYears = input.nextInt();
		System.out.println("Enter loan amount: ");
		double loanAmount = input.nextDouble();
		
		Loan loan = new Loan(annualInterestRate,numberOfYears, loanAmount);
		
		System.out.printf("The was created in %s\n The monthly payment is %.2f\n The total payment is %.2f",loan.getloanDate(), loan.getMonthlyPayment(), loan.getTotalPayment());

	}

}
