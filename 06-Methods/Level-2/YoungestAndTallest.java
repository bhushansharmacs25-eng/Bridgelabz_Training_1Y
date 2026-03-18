package Level_2;
import java.util.Scanner;
public class YoungestAndTallest {
    public int youngestOfThree(int a,int b,int c){
        int result=0;
        if(a<b && a<c){
            result=a;
        }
        else if(b<c && b<a){
            result=b;
        }
        else{
            result=c;
        }
        return result;
    }
    public double tallestOfThree(double a,double b,double c){
        double result=0;
        if(a>b && a>c){
            result=a;
        }
        else if(b>c && b>a){
            result=b;
        }
        else{
            result=c;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the ages of the three");
        int a1=s.nextInt();
        int a2=s.nextInt();
        int a3=s.nextInt();
        System.out.println("Enter the height of the three");
        double h1=s.nextDouble();
        double h2=s.nextDouble();
        double h3=s.nextDouble();
        YoungestAndTallest obj=new YoungestAndTallest();
        int ansage=obj.youngestOfThree(a1,a2,a3);
        double ansheight=obj.tallestOfThree(h1,h2,h3);
        if(ansage==a1){
            System.out.println("Amar is youngest");
        }
        else if(ansage==a2){
            System.out.println("Akbar is youngest");
        }
        else{
            System.out.println("Anthony is youngest");
        }
        if(ansheight==h1){
            System.out.println("Amar is tallest");
        }
        else if(ansheight==h2){
            System.out.println("Akbar is tallest");
        }
        else{
            System.out.println("Anthony is tallest");
        }
    }
}
