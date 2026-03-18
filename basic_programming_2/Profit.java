import java.util.*;

public class Profit{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
   System.out.print("Cost:");
    int a = sc.nextInt();
   System.out.print("Sell:");
    int b = sc.nextInt();
    int profit = b-a;
    double perc = (profit * 100.0) / a;
   System.out.println("Profit Percentage:" +perc);
 }
}