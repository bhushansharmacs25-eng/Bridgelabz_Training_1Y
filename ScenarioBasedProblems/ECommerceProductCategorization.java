package ScenarioBasedProblems;

class Product {
    int productId;
    String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public boolean isMatch(String keyword) {
        return productName.toLowerCase().contains(keyword.toLowerCase());
    }
}

class ElectronicProduct extends Product {
    String brand;

    public ElectronicProduct(int productId, String productName, String brand) {
        super(productId, productName);
        this.brand = brand;
    }

    @Override
    public boolean isMatch(String keyword) {
        return super.isMatch(keyword) || brand.equalsIgnoreCase(keyword);
    }
}

public class ECommerceProductCategorization {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Running Shoes");
        Product p2 = new ElectronicProduct(2, "Smartphone Pro", "Samsung");

        System.out.println("Search 'shoes' in p1: " + p1.isMatch("shoes"));
        System.out.println("Search 'samsung' in p2: " + p2.isMatch("Samsung"));
        System.out.println("Search 'smart' in p2: " + p2.isMatch("smart"));
    }
}
