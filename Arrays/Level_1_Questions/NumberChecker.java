import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        
        // Take 5 numbers input
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        // Check each number
        for(int num : numbers) {
            if(num > 0) {
                if(num % 2 == 0) {
                    System.out.println(num + " is positive even");
                } else {
                    System.out.println(num + " is positive odd");
                }
            } else if(num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }
        
        // Compare first and last
        if(numbers[0] > numbers[4]) {
            System.out.println("First(" + numbers[0] + ") > Last(" + numbers[4] + ")");
        } else if(numbers[0] < numbers[4]) {
            System.out.println("First(" + numbers[0] + ") < Last(" + numbers[4] + ")");
        } else {
            System.out.println("First(" + numbers[0] + ") = Last(" + numbers[4] + ")");
        }
        sc.close();
    }
}
