import java.util.*;

public class YoungestAndTallest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age and height: ");
        int ageA = sc.nextInt();
        int heightA = sc.nextInt();

        System.out.print("Enter Akbar's age and height: ");
        int ageB = sc.nextInt();
        int heightB = sc.nextInt();

        System.out.print("Enter Anthony's age and height: ");
        int ageC = sc.nextInt();
        int heightC = sc.nextInt();

        int youngestAge = Math.min(ageA, Math.min(ageB, ageC));
        int tallestHeight = Math.max(heightA, Math.max(heightB, heightC));

        if (youngestAge == ageA)
            System.out.println("Youngest is Amar");
        else if (youngestAge == ageB)
            System.out.println("Youngest is Akbar");
        else
            System.out.println("Youngest is Anthony");

        if (tallestHeight == heightA)
            System.out.println("Tallest is Amar");
        else if (tallestHeight == heightB)
            System.out.println("Tallest is Akbar");
        else
            System.out.println("Tallest is Anthony");

        sc.close();
    }
}
