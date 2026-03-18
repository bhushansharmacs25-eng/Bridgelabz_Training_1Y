package Level_2;
import java.util.Scanner;
public class UnitConvertor2 {
    public double yardsToFeet(double y){
       return y*3;
    }
    public double feetToYards(double f){
        return f*0.333333;
    }
    public double metersToInches(double m){
        return m*39.3701;
    }
    public double inchesToMeters(double i){
        return i*0.0254;
    }
    public double inchesToCentimeter(double i){
       return i*2.54;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        UnitConvertor2 obj=new UnitConvertor2();
        System.out.println("Enter the distance in yards");
        double yards=s.nextDouble();
        System.out.println("The distance converted to feet is :"+obj.yardsToFeet(yards));
        System.out.println("Enter the distance in feet");
        double feet=s.nextDouble();
        System.out.println("The distance converted to yards is :"+obj.feetToYards(feet));
        System.out.println("Enter the distance in meters");
        double meters=s.nextDouble();
        System.out.println("The distance converted to inches is :"+obj.metersToInches(meters));
        System.out.println("Enter the distance in inches");
        double inches=s.nextDouble();
        System.out.println("The distance converted to meters is :"+obj.inchesToMeters(inches));
        System.out.println("Enter the distance in inches");
        double inches2=s.nextDouble();
        System.out.println("The distance converted to centimeters is :"+obj.inchesToCentimeter(inches2));
    }
}
