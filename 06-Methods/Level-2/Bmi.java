package Level_2;
import java.util.Scanner;
public class Bmi {
    public double[] calculate(double[] w,double[] h){
        double[] res=new double[10];
        for(int i=0;i<10;i++){
            res[i]=w[i]/(h[i]*h[i]);
        }
        return res;
    }
    public String[] status(double[] b){
        String[] s=new String[10];
        for(int i=0;i<10;i++){
            if(b[i]<=18.4){
                s[i]="Underweight";
            }
            else if(b[i]>=18.5 && b[i]<=24.9){
                s[i]="Normal";
            }
            else if(b[i]>=25.0 && b[i]<=39.9){
                s[i]="Overweight";
            }
            else if(b[i]>=40.0){
                s[i]="Obese";
            }
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] weight=new double[10];
        System.out.println("Enter the weight of 10 players in kg");
        for(int i=0;i<10;i++){
            weight[i]=sc.nextDouble();
        }
        double[] height=new double[10];
        System.out.println("Enter the height of 10 players in cm");
        for(int i=0;i<10;i++){
            height[i]=sc.nextDouble();
        }
        for(int i=0;i<10;i++){
            height[i]=height[i]/100;
        }
        Bmi obj=new Bmi();
        double[] bodymassindex=new double[10];
        bodymassindex=obj.calculate(weight,height);
        double[][] answer=new double[3][10];
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                if(i==0){
                    answer[i][j]=weight[j];
                }
                else if(i==1){
                    answer[i][j]=height[j];
                }
                else if(i==2){
                    answer[i][j]=bodymassindex[j];
                }
            }
        }
        String[] sts=new String[10];
        sts=obj.status(bodymassindex);
        System.out.println("The weight, height and bmi of 10 players is :");
        for(int i=0;i<3;i++){
            for(int j=0;j<10;j++){
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nThe status of the 10 players is :");
        for(int i=0;i<10;i++){
            System.out.print(sts[i]+" ");
        }
    }
}
