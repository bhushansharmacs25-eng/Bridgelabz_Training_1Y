import java.util.*;

public class greatest{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);

 int a = sc.nextInt();
 int b = sc.nextInt();
 int c = sc.nextInt();
  if(a>b && a>c){
    System.out.println("Greatest number is :" +a);
   }
 else if (b>a && b>c)
{
    System.out.println("Greatest number is :" +b);
  }
  else {
	  System.out.println("Greatest number is :" +c);
  }   
sc.close();
 }
}