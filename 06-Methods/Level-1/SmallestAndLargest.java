package Level_1;
import java.util.Scanner;
public class SmallestAndLargest {
    public int[] comparisionOfThreeNumbers(int a,int b,int c){
        int[] result=new int[2];
        int[] num={a,b,c};
        int max=num[0];
        int min=num[0];
        for(int i=0;i<3;i++){
            if(num[i]>max){
                max=num[i];
            }
            if(num[i]<min){
                min=num[i];
            }
        }
        result[0]=max;
        result[1]=min;
        return result;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        SmallestAndLargest obj=new SmallestAndLargest();
        System.out.println("The largest and smallest of the three numbers is :");
        int[] ans=new int[2];
        ans=obj.comparisionOfThreeNumbers(n1,n2,n3);
        System.out.println("Largest -- "+ans[0]);
        System.out.println("Smallest -- "+ans[1]);
    }
}
