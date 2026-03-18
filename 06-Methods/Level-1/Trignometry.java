package Level_1;
import java.util.Scanner;
public class Trignometry {
    public double[] calculateTrignometricFunctions(double d) {
        double r = (d * Math.PI) / 180;
        double[] res = new double[3];
        res[0] = Math.sin(r);
        res[1] = Math.cos(r);
        res[2] = Math.tan(r);
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the angle in degrees");
        double angle = s.nextDouble();
        Trignometry obj = new Trignometry();
        double[] ans = new double[3];
        ans = obj.calculateTrignometricFunctions(angle);
        System.out.println("The sine of the angle is :" + ans[0]);
        System.out.println("The cosine of the angle is :" + ans[1]);
        System.out.println("The tangent of the angle is :" + ans[2]);
    }
}
