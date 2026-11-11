package objects.com;

import java.util.Date;
import java.util.Scanner;

public class example {

    static final int MAX_ACCOUNTS = 100;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[MAX_ACCOUNTS];
        int accountCount = 0;
        int choice;

        do {
            printMenu();
            choice = input.nextInt();
            input.nextLine();   // consume leftover newline

            switch (choice) {
                case 1:
                    if (accountCount == accounts.length) {
                        System.out.println("Bank is full, cannot create more accounts.");
                    } else {
                        Account created = createAccount(input, accounts, accountCount);
                        if (created != null) {
                            accounts[accountCount] = created;
                            accountCount++;
                            System.out.println("Account created successfully.");
                        }
                    }
                    break;
                case 2:
                    deposit(input, accounts, accountCount);
                    break;
                case 3:
                    withdraw(input, accounts, accountCount);
                    break;
                case 4:
                    displayAll(accounts, accountCount);
                    break;
                case 5:
                    search(input, accounts, accountCount);
                    break;
                case 6:
                    System.out.println("Thank you for using the banking system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1-6.");
            }
        } while (choice != 6);

        input.close();
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("===== MINI BANKING SYSTEM =====");
        System.out.println("1. Create new account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Display all accounts");
        System.out.println("5. Search account by ID");
        System.out.println("6. Quit");
        System.out.print("Enter your choice: ");
    }

    // returns the index of the account with this id, or -1 if not found
    public static int findIndex(Account[] accounts, int count, int id) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    // returns a new Account, or null if the id is already taken
    public static Account createAccount(Scanner input, Account[] accounts, int count) {
        System.out.print("Enter owner name: ");
        String name = input.nextLine();

        System.out.print("Enter account ID: ");
        int id = input.nextInt();

        if (findIndex(accounts, count, id) != -1) {
            input.nextLine();
            System.out.println("An account with that ID already exists.");
            return null;
        }

        System.out.print("Enter initial balance: ");
        double balance = input.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = input.nextDouble();
        input.nextLine();   // consume leftover newline

        Account acc = new Account(id, name, balance);
        acc.setAnnualInterestRate(rate);
        return acc;
    }

    public static void deposit(Scanner input, Account[] accounts, int count) {
        System.out.print("Enter account ID: ");
        int id = input.nextInt();
        int index = findIndex(accounts, count, id);

        if (index == -1) {
            input.nextLine();
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter amount to deposit: ");
        double amount = input.nextDouble();
        input.nextLine();

        if (accounts[index].deposit(amount)) {
            System.out.printf("Deposited $%.2f. New balance: $%.2f%n",
                    amount, accounts[index].getBalance());
        } else {
            System.out.println("Invalid amount. Deposit must be greater than 0.");
        }
    }

    public static void withdraw(Scanner input, Account[] accounts, int count) {
        System.out.print("Enter account ID: ");
        int id = input.nextInt();
        int index = findIndex(accounts, count, id);

        if (index == -1) {
            input.nextLine();
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter amount to withdraw: ");
        double amount = input.nextDouble();
        input.nextLine();

        if (accounts[index].withdraw(amount)) {
            System.out.printf("Withdrew $%.2f. New balance: $%.2f%n",
                    amount, accounts[index].getBalance());
        } else {
            System.out.println("Withdrawal failed. Amount must be greater than 0 and not more than the balance.");
        }
    }

    public static void displayAll(Account[] accounts, int count) {
        if (count == 0) {
            System.out.println("No accounts yet.");
            return;
        }

        System.out.println();
        System.out.printf("%-8s %-20s %-12s %-12s %s%n",
                "ID", "Owner", "Balance", "Interest/mo", "Date Created");
        System.out.println("-------------------------------------------------------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-8d %-20s $%-11.2f $%-11.2f %s%n",
                    accounts[i].getId(),
                    accounts[i].getOwnerName(),
                    accounts[i].getBalance(),
                    accounts[i].getMonthlyInterest(),
                    accounts[i].getDateCreated());
        }
    }

    public static void search(Scanner input, Account[] accounts, int count) {
        System.out.print("Enter account ID to search: ");
        int id = input.nextInt();
        input.nextLine();
        int index = findIndex(accounts, count, id);

        if (index == -1) {
            System.out.println("No account with ID " + id + " found.");
            return;
        }

        Account a = accounts[index];
        System.out.println();
        System.out.println("=== Account Details ===");
        System.out.println("ID:                  " + a.getId());
        System.out.println("Owner:               " + a.getOwnerName());
        System.out.printf("Balance:             $%.2f%n", a.getBalance());
        System.out.printf("Annual interest:     %.2f%%%n", a.getAnnualInterestRate());
        System.out.printf("Monthly interest:    $%.2f%n", a.getMonthlyInterest());
        System.out.println("Date created:        " + a.getDateCreated());
    }
}

// Account is NOT public, so it can live in the same file as example
class Account {
    private int id;
    private String ownerName;
    private double balance;
    private double annualInterestRate;   // stored as a percentage, e.g. 4.5
    private Date dateCreated;

    // no-arg constructor: default account
    public Account() {
        id = 0;
        ownerName = "Unknown";
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    // constructor with id, owner name and initial balance
    public Account(int id, String ownerName, double balance) {
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
        this.annualInterestRate = 0;
        dateCreated = new Date();
    }

    // getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public double getAnnualInterestRate() { return annualInterestRate; }
    public void setAnnualInterestRate(double rate) { this.annualInterestRate = rate; }

    public Date getDateCreated() { return dateCreated; }

    // interest calculations
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    // deposit: returns true if successful
    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    // withdraw: returns true if successful
    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
}