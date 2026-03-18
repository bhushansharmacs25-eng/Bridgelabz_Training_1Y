public class BankAccount {

    public int accNo;
    protected String name;
    private int bal;

    void setBalance(int b) {
        bal = b;
    }

    int getBalance() {
        return bal;
    }

    public static void main(String[] args) {

        SavingsAccount a = new SavingsAccount();

        a.accNo = 1001;
        a.name = "Ravi";
        a.setBalance(5000);

        a.show();
    }
}

class SavingsAccount extends BankAccount {

    void show() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + getBalance());
    }
}
