import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        
        if (n >= 0) {
            // Formula method
            long formulaSum = (long) n * (n + 1) / 2;
            
            // While loop method
            long loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }
            
            System.out.println("Formula sum: " + formulaSum);
            System.out.println("Loop sum: " + loopSum);
            System.out.println("Results match: " + (formulaSum == loopSum));
        } else {
            System.out.println("Not a natural number");
        }
        sc.close();
    }
}
