package Level_1;
import java.util.Scanner;
public class SimpleInterest {
    public double simpleInterest(double p,double t,double r){
        double SI=(p*r*t)/100;
        return SI;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal");
        double principal=sc.nextDouble();
        System.out.println("Enter the rate");
        double rate=sc.nextDouble();
        System.out.println("Enter the time");
        double time=sc.nextDouble();
        SimpleInterest obj=new SimpleInterest();
        System.out.println("The Simple Interest is :");
        System.out.println(obj.simpleInterest(principal,time,rate));
    }
}
