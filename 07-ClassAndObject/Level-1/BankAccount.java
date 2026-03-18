import java.util.Scanner;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private int balance;

    public BankAccount(String accountHolder, int accountNumber, int balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetail() {
        Scanner sc = new Scanner(System.in);

        System.out.println("---ATM---");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw money");

        System.out.println("Choose an option:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your balance is: " + balance);
                break;

            case 2:
                System.out.println("Enter amount to deposit:");
                int deposit = sc.nextInt();
                balance += deposit;
                System.out.println("Amount " + deposit + " deposited successfully");
                break;

            case 3:
                System.out.println("Enter amount to withdraw:");
                int withdraw = sc.nextInt();
                if (balance >= withdraw) {
                    balance -= withdraw;
                    System.out.println("Amount " + withdraw + " withdrawn successfully");
                } else {
                    System.out.println("Insufficient balance");
                }
                break;

            default:
                System.out.println("Invalid option");
        }
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Khushi", 1234, 50000);
        b1.displayDetail();
    }
}