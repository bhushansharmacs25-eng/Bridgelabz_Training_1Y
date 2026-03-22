package java_interfaces.DefaultMethods;

interface PaymentProcessor {
    void processPayment(double amount);
    
    // Default method added later without breaking implementers
    default void refund(double amount) {
        System.out.println("Refund of " + amount + " processed via default method.");
    }
}

class PayPal implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing " + amount + " through PayPal.");
    }
    
    // Overriding the default method
    @Override
    public void refund(double amount) {
        System.out.println("PayPal specific refund of " + amount + ".");
    }
}

class Stripe implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing " + amount + " through Stripe.");
    }
    // Uses default refund method
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        PaymentProcessor p1 = new PayPal();
        p1.processPayment(100.0);
        p1.refund(50.0);
        
        PaymentProcessor p2 = new Stripe();
        p2.processPayment(200.0);
        p2.refund(100.0);
    }
}
