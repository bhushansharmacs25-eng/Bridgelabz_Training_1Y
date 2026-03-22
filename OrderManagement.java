package Inheritance_Problems;

class Order {
    String orderId;
    String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped (Tracking: " + trackingNumber + ")";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered on " + deliveryDate + " (Tracking: " + trackingNumber + ")";
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        Order o1 = new Order("ORD-001", "2023-10-01");
        Order o2 = new ShippedOrder("ORD-002", "2023-10-02", "TRK-12345");
        Order o3 = new DeliveredOrder("ORD-003", "2023-10-03", "TRK-67890", "2023-10-05");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
