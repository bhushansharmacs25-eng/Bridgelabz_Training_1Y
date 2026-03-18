import java.util.*;

public class PenDivision {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Total pens: ");
        int pens = sc.nextInt();

        System.out.print("Number of students: ");
        int students = sc.nextInt();

        int pensEach = pens / students;
        int remainingPens = pens % students;

        System.out.println("Each student gets: " + pensEach + " pens");
        System.out.println("Remaining pens: " + remainingPens);

        sc.close();
    }
}
