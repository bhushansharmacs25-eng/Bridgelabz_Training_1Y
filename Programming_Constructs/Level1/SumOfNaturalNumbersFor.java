import java.util.*;

public class SumOfNaturalNumbersFor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {
            int sumFor = 0;

            for (int i = 1; i <= n; i++) {
                sumFor = sumFor + i;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using for loop = " + sumFor);
            System.out.println("Sum using formula = " + sumFormula);

            if (sumFor == sumFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("The computations do not match.");
            }
        }

        sc.close();
    }
}
