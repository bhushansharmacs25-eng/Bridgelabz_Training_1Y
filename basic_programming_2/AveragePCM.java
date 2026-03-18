import java.util.*;

public class AveragePCM {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Maths: ");
        int maths = sc.nextInt();

        System.out.print("Physics: ");
        int physics = sc.nextInt();

        System.out.print("Chemistry: ");
        int chemistry = sc.nextInt();

        double averagePercent = (maths + physics + chemistry) / 3.0;

        System.out.println("Average Percentage in PCM: " + averagePercent);

        sc.close();
    }
}
