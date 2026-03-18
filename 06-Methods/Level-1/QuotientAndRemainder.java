package Level_1;
import java.util.Scanner;
public class QuotientAndRemainder {
    public int[] twoNumber(int a,int b){
        int[] result=new int[2];
        result[0]=a/b;
        result[1]=a%b;
        return result;
    }
    public static void main(String[] agrs){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two numbers for operation");
        int n1=s.nextInt();
        int n2=s.nextInt();
        QuotientAndRemainder obj=new QuotientAndRemainder();
        int ans[]=new int[2];
        ans=obj.twoNumber(n1,n2);
        System.out.println("The Quotient and Remainder of between the two numbers is :");
        System.out.println("Quotient -- "+ans[0]);
        System.out.println("Remainder -- "+ans[1]);
    }
}
