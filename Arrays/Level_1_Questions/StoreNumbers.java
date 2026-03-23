import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        
        // Infinite loop until 0/negative or array full
        while(true) {
            System.out.print("Enter number (0/negative to stop): ");
            double num = sc.nextDouble();
            
            if(num <= 0 || index >= 10) {
                break;
            }
            
            numbers[index] = num;
            index++;
        }
        
        // Display numbers and sum
        System.out.println("\nNumbers entered:");
        for(int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        System.out.println("Total sum: " + total);
        sc.close();
    }
}
