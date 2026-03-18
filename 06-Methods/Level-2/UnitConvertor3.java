package Level_2;
import java.util.Scanner;
public class UnitConvertor3 {
    public double fahrenheitToCelsius(double f){
        double a=(f-32)*5;
        return a/9;
    }
    public double celsiusToFahrenheit(double c){
        double a=(c*9)/5;
        return a+32;
    }
    public double poundsToKg(double p){
        return p*0.453592;
    }
    public double kgToPounds(double k){
        return k*2.20462;
    }
    public double gallonsToLiters(double g){
        return g*3.78541;
    }
    public double litersToGallons(double l){
        return l*0.264172;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        UnitConvertor3 obj=new UnitConvertor3();
        System.out.println("Enter the temperature in fahrenheit");
        double f=s.nextDouble();
        System.out.println("The temp converted to celsius is :"+obj.fahrenheitToCelsius(f));
        System.out.println("Enter the temperature in celsius");
        double c=s.nextDouble();
        System.out.println("The temp converted to fahrenheit is :"+obj.kgToPounds(c));
        System.out.println("Enter the weight in pounds");
        double p=s.nextDouble();
        System.out.println("The weight converted to kg is :"+obj.poundsToKg(p));
        System.out.println("Enter the weight in kg");
        double k=s.nextDouble();
        System.out.println("The weight converted to pounds is :"+obj.kgToPounds(k));
        System.out.println("Enter the volume in gallons");
        double g=s.nextDouble();
        System.out.println("The volume converted to liters is :"+obj.gallonsToLiters(g));
        System.out.println("Enter the volume in liters");
        double l=s.nextDouble();
        System.out.println("The volume converted to gallons is :"+obj.litersToGallons(l));
    }
}

