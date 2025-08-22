class BankAccount {
    // private fields → direct access nahi ho sakta
    private String accountNumber;
    private double balance;

    // constructor
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // getter for balance
    public double getBalance() {
        return balance;
    }

    // deposit method (controlled access)
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // withdraw method (controlled access)
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }
}

public class TestEncapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC12345", 5000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(1500);
        account.withdraw(2000);
        account.withdraw(10000); // invalid withdrawal

        System.out.println("Final Balance: " + account.getBalance());
    }
}
