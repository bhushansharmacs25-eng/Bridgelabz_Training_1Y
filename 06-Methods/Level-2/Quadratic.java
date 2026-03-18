package Level_2;
import java.util.Scanner;
public class Quadratic {
    public double[] roots(double a, double b, double c) {
        double[] res = new double[2];
        double op1 = Math.pow(b, 2);
        double op2 = 4 * a * c;
        double op3 = op1 - op2;
        if (op3 > 0) {
            double op4 = Math.sqrt(op3);
            double op5 = -b + op4;
            double op6 = -b - op4;
            res[0] = op5 / (2 * a);
            res[1] = op6 / (2 * a);
        } else if (op3 == 0) {
            res[0] = -b / (2 * a);
            res[1] = 0;
        } else {
            res[0] = 0;
            res[1] = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values of a, b and c to find the roots of the equation");
        double x1 = s.nextDouble();
        double x2 = s.nextDouble();
        double x3 = s.nextDouble();
        Quadratic obj = new Quadratic();
        double[] answer = new double[2];
        answer = obj.roots(x1, x2, x3);
        if (answer[0] != 0 && answer[1] == 0) {
            System.out.println("The equation has only one root : " + answer[0]);
        } else if (answer[0] == 0 && answer[1] == 0) {
            System.out.println("The equation has no roots");
        } else {
            System.out.println("The equation has two roots : " + answer[0] + " , " + answer[1]);
        }
    }
}
