package Level_2;
import java.util.Scanner;
public class Age {
    public boolean checkAge(int a){
        boolean result=false;
        if(a>=18){
            result=true;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        boolean[] res=new boolean[10];
        int[] a=new int[10];
        Age obj=new Age();
        System.out.println("Enter the age of 10 students");
        for(int i=0;i<10;i++){
            int age=s.nextInt();
            a[i]=age;
            boolean ans=obj.checkAge(age);
            res[i]=ans;
        }
        System.out.println("The ages and result of 10 students(true=can vote, false =cant vote");
        for(int i=0;i<10;i++){
            System.out.println("Result of the student of age "+a[i]+" :"+res[i]);
        }
    }
}
