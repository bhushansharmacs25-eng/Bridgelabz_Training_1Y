package Level_2;
import java.util.Scanner;
public class FactrorsFactorSumFactorSquareSumFactorProduct {
    public int[] factorsOfNumber(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        int[] ans=new int[count];
        int index=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans[index++]=i;
            }
        }
        return ans;
    }
    public int sumOfFacors(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public int sumOfSquareOfFactors(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=Math.pow(a[i],2);
        }
        return sum;
    }
    public int productOfFactors(int[] a){
        int product=1;
        for(int i=0;i<a.length;i++){
            product*=a[i];
        }
        return product;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        FactrorsFactorSumFactorSquareSumFactorProduct obj=new FactrorsFactorSumFactorSquareSumFactorProduct();
        int[] res=obj.factorsOfNumber(num);
        System.out.print("The Factors of the Number is :");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println("\nThe sum of the factors is :"+obj.sumOfFacors(res));
        System.out.println("The sum of the squares of factors is :"+obj.sumOfSquareOfFactors(res));
        System.out.println("The product of the factors is :"+obj.productOfFactors(res));
    }
}

