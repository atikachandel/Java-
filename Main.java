package lab9;
import java.util.Scanner;

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
