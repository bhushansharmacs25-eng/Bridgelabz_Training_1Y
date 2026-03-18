import java.util.*;

public class Rocketfor{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter countdown: ");
 int a = sc.nextInt();
 
 for(int i = a;i>=1;i--){
	 System.out.println(i);
 }
System.out.println("Rocket Launched!!!!!!!!! ");  
sc.close();
 }
}