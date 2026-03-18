package Level_2;
import java.util.Scanner;
public class CheckInteger  {
    public String[] isPositive(int[] a){
        String[] b=new String[5];
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                b[i]="Positive";
            }
            else{
                b[i]="Negative";
            }
        }
        return b;
    }
    public String[] isEven(int[] a){
        String[] b=new String[a.length];
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                b[i]="Even";
            }
            else{
                b[i]="Odd";
            }
        }
        return b;
    }
    public int compare(int[] a){
        int ans=0;
        if(a[0]==a[a.length-1]){
            ans=0;
        }
        else if(a[0]>a[a.length-1]){
            ans=a[0];
        }
        else if(a[0]<a[a.length-1]){
            ans=a[a.length-1];
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the five numbers");
        int[] num=new int[5];
        for(int i=0;i<5;i++){
            num[i]=s.nextInt();
        }
        CheckInteger obj=new CheckInteger();
        System.out.println("Checking whether the numbers are positive or negative :");
        String[] check=new String[5];
        check=obj.isPositive(num);
        int count=0;
        for(int i=0;i<5;i++){
            System.out.print(check[i]+" ");
            if(check[i]=="Positive"){
                count++;
            }
        }
        int[] num1=new int[count];
        int index=0;
        for(int i=0;i<5;i++){
            if(check[i]=="Positive"){
                num1[index++]=num[i];
            }
        }
        String[] check2=new String[count];
        check2=obj.isEven(num1);
        System.out.println("\nChecking whether the positive numbers are even or odd :");
        System.out.println("The positive numbers are : ");
        for(int i=0;i<count;i++){
            System.out.print(num1[i]+" ");
        }
        System.out.println("\nDisplaying even or odd :");
        for(int i=0;i<count;i++){
            System.out.print(check2[i]+" ");
        }
        System.out.println("\nComparing the First and Last Digits :");
        int answer=obj.compare(num);
        if(answer==num[0]){
            System.out.println(num[0]+" is greater than "+num[num.length-1]);
        }
        else if(answer==num[num.length-1]){
            System.out.println(num[num.length-1]+" is greater than "+num[0]);
        }
        else if(answer==0){
            System.out.println("They are equal");
        }
    }
}
