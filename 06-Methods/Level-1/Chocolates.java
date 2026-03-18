package Level_1;
import java.util.Scanner;
public class Chocolates {
    public int[] distributionOfChocolates(int a, int b) {
        int[] result = new int[2];
        result[0] = a / b;
        result[1] = a % b;
        return result;
    }

    public static void main(String[] agrs) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers of chocolates");
        int chocolates = s.nextInt();
        System.out.println("Enter the numbers of children");
        int children = s.nextInt();
        Chocolates obj = new Chocolates();
        int ans[] = new int[2];
        ans = obj.distributionOfChocolates(chocolates, children);
        System.out.println("Each child will get " + ans[0] + " chocolates");
        System.out.println("Remaining chocolates -- " + ans[1]);
    }
}
