package ScenarioBasedProblems;

class Account {
    int accountNumber;
    double balance;
    static String bankName = "National Bank";

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double calculateInterest() {
        return 0; // Default
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.02;
    }
}

public class BankInterestCalculator {
    public static void main(String[] args) {
        System.out.println("Bank: " + Account.bankName);
        Account savings = new SavingsAccount(1001, 50000);
        Account current = new CurrentAccount(1002, 50000);

        System.out.println("Savings Interest: " + savings.calculateInterest());
        System.out.println("Current Interest: " + current.calculateInterest());
    }
}
