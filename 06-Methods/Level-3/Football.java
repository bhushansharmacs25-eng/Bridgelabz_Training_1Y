package Level_3;
import java.util.Scanner;
public class Football {
    public int[] height(int p){
        int[] h=new int[p];
        int max=250;
        int min=150;
        int op=max-min+1;
        for(int i=0;i<p;i++){
            h[i]=(int)(Math.random()*op)+min;
        }
        return h;
    }
    public double meanHeight(int[] a){
        double sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum/a.length;
    }
    public int shortestHeight(int[] a){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
    public int tallestHeight(int[] a){
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
        System.out.println("Enter the number of players on the team");
        int num=s.nextInt();
        Football obj=new Football();
        int[] height=new int[num];
        height=obj.height(num);
        System.out.println("THe height of each player is :");
        for(int i=0;i<num;i++){
            System.out.print(height[i]+" ");
        }
        System.out.println("\nThe mean of the heights is : "+obj.meanHeight(height));
        System.out.println("The shortest of the heights is : "+obj.shortestHeight(height));
        System.out.println("The tallest of the heights is : "+obj.tallestHeight(height));
    }
}
