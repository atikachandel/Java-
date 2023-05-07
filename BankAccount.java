import java.util.Scanner;
public class BankAccount {
    private int accountNumber;
    private double balance;

    public static class LessBalanceException extends Exception {
        public LessBalanceException(String message) {
            super(message);
        }
    }

    public BankAccount(int accountNumber, double initialBalance) throws LessBalanceException {
        if (initialBalance < 500) {
            throw new LessBalanceException("Minimum balance of 500 rupees is required to open an account.");
        }
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + " rupees. New balance is " + this.balance + " rupees.");
    }

    public void withdraw(double amount) throws LessBalanceException {
        if (amount > this.balance - 500) {
            throw new LessBalanceException("Withdrawal amount is not valid. Minimum balance of 500 rupees is required.");
        }
        this.balance -= amount;
        System.out.println("Withdrawn " + amount + " rupees. New balance is " + this.balance + " rupees.");
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
}
public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            Account account = new Account();
    
            System.out.println("Current balance: " + account.getBalance());
    
            System.out.print("Enter deposit amount: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);
            System.out.println("New balance: " + account.getBalance());
    
            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();
            try {
                account.withdraw(withdrawalAmount);
                System.out.println("New balance: " + account.getBalance());
            } catch (LessBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
}

