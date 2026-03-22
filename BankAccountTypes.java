package Inheritance_Problems;

class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account (Interest Rate: " + interestRate + "%)");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Checking Account (Withdrawal Limit: $" + withdrawalLimit + ")");
    }
}

class FixedDepositAccount extends BankAccount {
    int tenureMonths;

    public FixedDepositAccount(String accountNumber, double balance, int tenureMonths) {
        super(accountNumber, balance);
        this.tenureMonths = tenureMonths;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account (Tenure: " + tenureMonths + " months)");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount("SA-111", 5000, 4.0);
        BankAccount a2 = new CheckingAccount("CA-222", 2000, 1000);
        BankAccount a3 = new FixedDepositAccount("FD-333", 10000, 12);
        
        a1.displayAccountType();
        a2.displayAccountType();
        a3.displayAccountType();
    }
}
