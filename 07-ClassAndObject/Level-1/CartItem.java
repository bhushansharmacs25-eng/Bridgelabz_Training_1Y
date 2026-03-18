public class CartItem {

    String name;
    int price;
    int qty;

    CartItem(String name, int price) {
        this.name = name;
        this.price = price;
        qty = 0;
    }

    void add(int q) {
        qty = qty + q;
        System.out.println("Item added");
    }

    void remove(int q) {
        if (qty >= q) {
            qty = qty - q;
            System.out.println("Item removed");
        } else {
            System.out.println("Not enough items");
        }
    }

    void showTotal() {
        int total = price * qty;
        System.out.println("Item: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        CartItem c = new CartItem("Bag", 500);

        c.add(3);
        c.remove(1);
        c.showTotal();
    }
}