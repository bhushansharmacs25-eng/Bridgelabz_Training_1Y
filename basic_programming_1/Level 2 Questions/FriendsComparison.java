import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Amar's age: ");
        int age1 = sc.nextInt();
        System.out.print("Enter Amar's height: ");
        double height1 = sc.nextDouble();
        
        System.out.print("Enter Akbar's age: ");
        int age2 = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        double height2 = sc.nextDouble();
        
        System.out.print("Enter Anthony's age: ");
        int age3 = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        double height3 = sc.nextDouble();
        
        // Find youngest
        int youngestAge = Math.min(age1, Math.min(age2, age3));
        String youngest;
        if (youngestAge == age1) youngest = "Amar";
        else if (youngestAge == age2) youngest = "Akbar";
        else youngest = "Anthony";
        
        // Find tallest
        double maxHeight = Math.max(height1, Math.max(height2, height3));
        String tallest;
        if (maxHeight == height1) tallest = "Amar";
        else if (maxHeight == height2) tallest = "Akbar";
        else tallest = "Anthony";
        
        System.out.println("Youngest: " + youngest + " (age " + youngestAge + ")");
        System.out.println("Tallest: " + tallest + " (height " + maxHeight + ")");
        sc.close();
    }
}
