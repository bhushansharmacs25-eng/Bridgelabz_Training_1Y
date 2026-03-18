package Level_2;
import java.util.Scanner;
public class LeapYear {
    public boolean checkLeapYear(int y){
        boolean result=false;
        if((y%4==0 && y%100!=0)||(y%400==0)){
            result=true;
        }
        return result;
    }
    public static void main(String[] asrgs){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=s.nextInt();
        LeapYear obj=new LeapYear();
        boolean res=obj.checkLeapYear(year);
        if(res==true){
            System.out.println("It is a Leap Year");
        }
        else{
            System.out.println("It is not a Leap Year");
        }
    }
}
