import java.util.*;

public class SpringSeason{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter your month: ");
 String a = sc.next().toLowerCase();
 System.out.print("Enter your day: ");
 int b = sc.nextInt();
  if((a.equals("march") && b >= 20) ||
     (a.equals("april")) ||
	 (a.equals("may")) ||
	 (a.equals("june") && b <=20))
	 {
    System.out.println(" its a spring season");
   }
  else {
    System.out.println("Not a spring season");
	}
sc.close();
 }
}