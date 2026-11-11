package excemption.com;

// ============================================================
// 1. CUSTOM EXCEPTION
// ============================================================
// "extends Exception" makes this a CHECKED exception.
// Checked = Java forces you to handle it (try/catch) or declare it (throws).
class InsufficientFundsException extends Exception {

    // Extra data that a normal exception doesn't have:
    // how much money was missing.
    private double shortfall;

    // Constructor: runs when you write "new InsufficientFundsException(...)"
    public InsufficientFundsException(String message, double shortfall) {
        super(message);             // sends the message UP to Exception/Throwable
                                    // (this is what getMessage() returns later)
        this.shortfall = shortfall; // save the extra data in this object
    }

    // Getter: lets the catch block read the shortfall
    public double getShortfall() {
        return shortfall;
    }
}

// ============================================================
// 2. PARENT CLASS (abstract)
// ============================================================
// "abstract" = cannot create new Account(...) directly.
// It only exists so other classes can extend it.
abstract class Account {

    // "protected" = accessible by child classes and the same package
    protected String owner;
    protected double balance;

    // Constructor: sets the starting values
    Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // NORMAL method: both children inherit it as-is.
    // Throws an UNCHECKED exception (IllegalArgumentException):
    // no "throws" needed, and try/catch is optional.
    void deposit(double amount) {
        if (amount <= 0) {
            // "throw" = actually create and raise the exception
            throw new IllegalArgumentException("Deposit must be positive.");
        }
        balance += amount;   // only runs if no exception was thrown
    }

    // ABSTRACT method: no body, only a signature.
    // Every child MUST write its own version.
    // "throws" = warns callers that this method may raise this checked exception.
    abstract void withdraw(double amount) throws InsufficientFundsException;
}

// ============================================================
// 3. CHILD CLASS 1: SavingsAccount
// ============================================================
// Rule: you can NOT withdraw more than your balance.
class SavingsAccount extends Account {

    SavingsAccount(String owner, double balance) {
        super(owner, balance);   // calls the PARENT constructor (Account)
    }

    // @Override = this replaces the parent's abstract method
    @Override
    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            // Not enough money -> throw the exception.
            // Second argument = how much is missing.
            throw new InsufficientFundsException(
                "Savings: not enough funds.", amount - balance);
        }
        balance -= amount;   // enough money -> subtract it
    }
}

// ============================================================
// 4. CHILD CLASS 2: CheckingAccount
// ============================================================
// Rule: you CAN go negative, up to an overdraft limit of 500.
class CheckingAccount extends Account {

    private double overdraftLimit = 500;

    CheckingAccount(String owner, double balance) {
        super(owner, balance);   // calls the PARENT constructor (Account)
    }

    @Override
    void withdraw(double amount) throws InsufficientFundsException {
        // Money you can use = balance + overdraft
        double available = balance + overdraftLimit;

        if (amount > available) {
            throw new InsufficientFundsException(
                "Checking: overdraft limit exceeded.", amount - available);
        }
        balance -= amount;
    }
}

// ============================================================
// 5. MAIN CLASS (where the program starts)
// ============================================================
public class exceptionhandlingwithInheritanceandPolymorphism {

    public static void main(String[] args) {

        // POLYMORPHISM: the array type is the PARENT (Account),
        // but it stores CHILD objects (Savings and Checking).
        Account[] accounts = {
            new SavingsAccount("Ana", 1000),
            new CheckingAccount("Ben", 200)
        };

        // Outer loop: repeat the withdrawals twice (Round 1, Round 2)
        for (int round = 1; round <= 2; round++) {
            System.out.println("--- Round " + round + " ---");

            // Inner loop: go through each account
            for (Account acc : accounts) {

                try {
                    // Same call for both, but Java runs the CHILD's own version.
                    // If an exception is thrown here, the lines below
                    // inside "try" are SKIPPED.
                    acc.withdraw(600);

                    // Only runs if withdraw() succeeded
                    System.out.println(acc.owner + " withdrew 600. Balance: " + acc.balance);
                }
                catch (InsufficientFundsException e) {
                    // Only runs if withdraw() threw this exception.
                    // getMessage()   -> comes from Throwable (set by super(message))
                    // getShortfall() -> our own method
                    System.out.println(acc.owner + ": " + e.getMessage()
                        + " Short by " + e.getShortfall());
                }
                finally {
                    // ALWAYS runs: success or failure
                    System.out.println("Transaction finished for " + acc.owner);
                }
            }
        }

        // Testing the UNCHECKED exception from deposit()
        try {
            accounts[0].deposit(-50);   // accounts[0] is Ana; -50 is invalid
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}