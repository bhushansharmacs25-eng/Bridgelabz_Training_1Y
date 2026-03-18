package Level_1;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public int additionOfNaturalNumbers(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        SumOfNaturalNumbers obj=new SumOfNaturalNumbers();
        System.out.println("The sum of N Natural Numbers is :");
        System.out.println(obj.additionOfNaturalNumbers(num));
    }
}
