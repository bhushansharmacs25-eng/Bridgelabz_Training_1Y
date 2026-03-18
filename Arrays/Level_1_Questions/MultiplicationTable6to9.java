import java.util.Scanner;

public class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int[] result = new int[4];
        
        // Calculate table from 6 to 9
        for(int i = 6; i <= 9; i++) {
            int pos = i - 6;
            result[pos] = number * i;
            System.out.println(number + " * " + i + " = " + result[pos]);
        }
        sc.close();
    }
}
