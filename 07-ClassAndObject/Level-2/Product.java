public class Product{
	String name;
	int price;
	public static int total = 0;

    Product(String n, int p) {
        name = n;
        price = p;
        total++;
    }
    void show() {
        System.out.println("Name: " +name);
        System.out.println("Price: " +price);
    }
    static void showTotal() {
        System.out.println("Total Products: " +total);
    }

    public static void main(String[] args) {

        Product a = new Product("Pen", 10);
        Product b = new Product("Book", 40);
        a.show();
        b.show();
        Product.showTotal();
    }
}
