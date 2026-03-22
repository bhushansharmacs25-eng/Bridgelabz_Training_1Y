package ScenarioBasedProblems;

class Order {
    int orderId;
    double baseAmount;
    static double deliveryCharge = 40.0;

    public Order(int orderId, double baseAmount) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }

    public double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}

class RegularOrder extends Order {
    public RegularOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }
    // No discount, inherits base calculation
}

class PremiumOrder extends Order {
    public PremiumOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    @Override
    public double calculateBill() {
        double discountedAmount = baseAmount * 0.8; // 20% discount
        return discountedAmount + deliveryCharge;
    }
}

public class OnlineFoodDeliveryApp {
    public static void main(String[] args) {
        Order regOrder = new RegularOrder(1, 200);
        Order premOrder = new PremiumOrder(2, 200);

        System.out.println("Regular Order Total: " + regOrder.calculateBill());
        System.out.println("Premium Order Total: " + premOrder.calculateBill());
    }
}
