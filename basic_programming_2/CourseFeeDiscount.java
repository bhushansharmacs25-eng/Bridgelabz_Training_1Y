import java.util.*;

public class CourseFeeDiscount {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Course Fee (INR): ");
        double fee = sc.nextDouble();

        System.out.print("Discount Percentage: ");
        double discountPercent = sc.nextDouble();

        double discountAmount = (fee * discountPercent) / 100;
        double discountedPrice = fee - discountAmount;

        System.out.println("Discount Amount: INR " + discountAmount);
        System.out.println("Discounted Price: INR " + discountedPrice);

        sc.close();
    }
}
