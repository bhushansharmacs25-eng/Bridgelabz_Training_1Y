import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        
        // Count digits
        while(temp > 0) {
            count++;
            temp /= 10;
        }
        
        int[] digits = new int[count];
        temp = number;
        
        // Store digits
        for(int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        // Count frequency
        int[] frequency = new int[10];
        for(int digit : digits) {
            frequency[digit]++;
        }
        
        // Display frequency
        for(int i = 0; i < 10; i++) {
            if(frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times");
            }
        }
        sc.close();
    }
}
