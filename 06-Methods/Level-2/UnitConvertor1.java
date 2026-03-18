package Level_2;
import java.util.Scanner;
public class UnitConvertor1 {
    public double kmToMiles(double d){
        double result=d*0.621371;
        return result;
    }
    public double milesToKm(double m){
        double result=m*1.60934;
        return result;
    }
    public double metersToFeet(double m){
        double result=m*3.28084;
        return result;
    }
    public double feetToMeters(double f){
        double result=f*0.3048;
        return result;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        UnitConvertor1 obj=new UnitConvertor1();
        System.out.println("Enter the distance in km");
        double km=s.nextDouble();
        System.out.println("The distance converted to miles is :"+obj.kmToMiles(km));
        System.out.println("Enter the distance in miles");
        double miles=s.nextDouble();
        System.out.println("The distance converted to km is :"+obj.milesToKm(miles));
        System.out.println("Enter the distance in meters");
        double meters=s.nextDouble();
        System.out.println("The distance converted to feet is :"+obj.metersToFeet(meters));
        System.out.println("Enter the distance in feet");
        double feet=s.nextDouble();
        System.out.println("The distance converted to meters is :"+obj.feetToMeters(feet));
    }
}
