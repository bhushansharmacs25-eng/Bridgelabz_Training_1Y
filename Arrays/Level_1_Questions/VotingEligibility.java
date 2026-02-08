import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        
        // Take input for 10 students
        for(int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i+1) + ": ");
            ages[i] = sc.nextInt();
        }
        
        // Check voting eligibility
        for(int i = 0; i < 10; i++) {
            if(ages[i] < 0) {
                System.out.println("Invalid age for student " + (i+1));
            } else if(ages[i] >= 18) {
                System.out.println("Student " + (i+1) + " with age " + ages[i] + " can vote");
            } else {
                System.out.println("Student " + (i+1) + " with age " + ages[i] + " cannot vote");
            }
        }
        sc.close();
    }
}
