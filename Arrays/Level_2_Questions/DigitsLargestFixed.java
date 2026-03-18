import java.util.Scanner;

public class DigitsLargestFixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int[] digits = new int[10];
        int index = 0;
        
        // Extract digits
        while(number > 0 && index < 10) {
            int digit = number % 10;
            digits[index++] = digit;
            number /= 10;
        }
        
        // Find largest & second largest
        int largest = 0, secondLargest = 0;
        for(int i = 0; i < index; i++) {
            if(digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if(digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest: " + secondLargest);
        sc.close();
    }
}
