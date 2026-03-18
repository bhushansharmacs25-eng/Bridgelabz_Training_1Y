package Level_1;
import java.util.Scanner;
public class CheckInteger {
    public int checkInt(int n){
        int result=0;
        if(n>0){
            result=1;
        }
        else if(n<0){
            result=-1;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int num=s.nextInt();
        CheckInteger obj=new CheckInteger();
        System.out.println("The number is :");
        System.out.println("(1=Positive,-1=Negative,0=Zero)");
        System.out.println(obj.checkInt(num));
    }
}
