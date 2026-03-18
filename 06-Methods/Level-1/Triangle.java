package Level_1;
import java.util.Scanner;
public class Triangle {
    public double perimeterOfTriangle(double s1,double s2,double s3,double distance){
        double p=s1+s2+s3;
        double r=distance/p;
        return r;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the three sides");
        double side1=s.nextDouble();
        double side2=s.nextDouble();
        double side3=s.nextDouble();
        System.out.println("Enter the distance you want to run");
        double dis=s.nextDouble();
        Triangle obj=new Triangle();
        System.out.println("The number of rounds you need to run is :");
        System.out.println(obj.perimeterOfTriangle(side1,side2,side3,dis));
    }
}