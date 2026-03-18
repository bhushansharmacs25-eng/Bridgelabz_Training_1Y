package Level_1;
import java.util.Scanner;
public class WindChill {
    public double calculateWindChill(double t, double ws) {
        double a = 0.6215 * t;
        double b = (0.4275 * t) - 35.75;
        double c = Math.pow(ws, 0.16);
        double d = b * c;
        double result = 35.74 + a + d;
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the temperature");
        double temp = s.nextDouble();
        System.out.println("Enter the wind speed");
        double windspeed = s.nextDouble();
        WindChill obj = new WindChill();
        System.out.println("The Wind Chill Temperature is :");
        System.out.println(obj.calculateWindChill(temp, windspeed));
    }
}
