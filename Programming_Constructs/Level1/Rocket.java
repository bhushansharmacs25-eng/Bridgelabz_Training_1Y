import java.util.*;

public class Rocket{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter countdown: ");
 int a = sc.nextInt();
 
  while (a>=1){
	System.out.println(+a); 
    a--;
  }
System.out.println("Rocket Launched!!!!!!!!! ");  
sc.close();
 }
}