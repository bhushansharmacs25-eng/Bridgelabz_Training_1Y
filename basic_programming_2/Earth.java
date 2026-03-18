import java.util.*;
public class Earth{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
System.out.print("Radius :");
 double radius = sc.nextInt();
 double pi = 3.14;
 double volumekm = (4.0/3.0)*pi*radius*radius*radius;
System.out.println("Volume in KM:" +volumekm);
 double radiusM = radius*1.6;
 double volumem = (4.0/3.0)*pi*radiusM*radiusM*radiusM;
System.out.println("Volume in Miles:" +volumem);

}
}

