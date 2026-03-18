package Level_2;
import java.util.Scanner;
public class Random {
    public int[] getRandom(int a){
        int[] rdm=new int[a];
        for(int i=0;i<a;i++) {
            rdm[i]=(int)(Math.random() * 9000) + 1000;
        }
        return rdm;
    }
    public double averageOfRandomNumber(int[] a){
        double res;
        double sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        res=sum/(a.length);
        return res;
    }
    public int minimumOfRandomNumber(int[] a){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
    public int maximumOfRandomNumber(int[] a){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of numbers you want to generate");
        int n=s.nextInt();
        Random obj=new Random();
        int[] random=new int[n];
        random=obj.getRandom(n);
        System.out.println("The random numbers are :");
        for(int i=0;i<n;i++){
            System.out.print(random[i]+" ");
        }
        System.out.println("\nThe average of numbers is : "+obj.averageOfRandomNumber(random));
        System.out.println("The minimum of the numbers is: "+obj.minimumOfRandomNumber(random));
        System.out.println("The maximum of the numbers is: "+obj.maximumOfRandomNumber(random));
    }
}
