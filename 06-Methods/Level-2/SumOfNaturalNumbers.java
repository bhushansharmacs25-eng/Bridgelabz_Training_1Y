package Level_2;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public int sumByLoop(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public int sumByFormula(int n){
        int sum=(n*(n+1))/2;
        return sum;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbner");
        int num=s.nextInt();
        SumOfNaturalNumbers obj=new SumOfNaturalNumbers();
        int res1=obj.sumByLoop(num);
        int res2=obj.sumByFormula(num);
        System.out.println("The sum by using loop is :"+res1);
        System.out.println("The sum by using formula is :"+res2);
        System.out.println("The sum is same using both the methods");
    }
}
