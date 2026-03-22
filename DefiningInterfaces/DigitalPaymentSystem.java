package java_interfaces.DefiningInterfaces;

interface DigitalPayment {
    void pay(double amount);
}

class UPI implements DigitalPayment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via UPI."); }
}

class CreditCard implements DigitalPayment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via Credit Card."); }
}

class Wallet implements DigitalPayment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via Wallet."); }
}

public class DigitalPaymentSystem {
    public static void main(String[] args) {
        DigitalPayment payment = new UPI();
        payment.pay(500.0);
    }
}
