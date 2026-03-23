import java.util.Scanner;

public class ReverseDigits {
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
        
        System.out.print("Reversed: ");
        for(int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        System.out.println();
        sc.close();
    }
}
