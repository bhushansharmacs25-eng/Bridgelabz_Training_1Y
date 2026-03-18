import java.util.*;

public class sumnatural{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter natural number: ");
 int a = sc.nextInt();
 int b = a*(a+1)/2;
  if(a>0){
    System.out.println(+b);
   }
  else {
    System.out.println("Not a natural number");
	}
sc.close();
 }
}