package Level_3;
import java.util.Scanner;
public class NumberChecker2 {
    public int countofDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public int[] arrayOfDigits(int n1) {
        int n = n1;
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        int[] a = new int[count];
        int index = count - 1;
        while (n1 != 0) {
            a[index--] = n1 % 10;
            n1 /= 10;
        }
        return a;
    }
    public double[] sumOfDigitsAndSquareOfDigits(int[] a){
        double[] res=new double[2];
        double sum=0;
        double square=0;
        double squaresum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            square=Math.pow(a[i],2);
            squaresum+=square;
        }
        res[0]=sum;
        res[1]=squaresum;
        return res;
    }
    public String checkHarshad(int[] a){
        String s="It is not an Harshad number";
        int sum=0;
        int n=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            n=(n*10)+a[i];
        }
        if(n%sum==0){
            s="It is a Harshad number";
        }
        return s;
    }
    public int[] frequency(int[] a){
        int[] f=new int[10];
        for(int i=0;i<10;i++){
            f[i]=0;
        }
        for(int j=0;j<10;j++) {
            for (int i = 0; i < a.length; i++) {
                if (j == a[i]) {
                    f[j]++;
                }
            }
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        NumberChecker2 obj = new NumberChecker2();
        int c = obj.countofDigits(num);
        System.out.println("The count of the digits of the number is : " + c);
        int[] digits = new int[c];
        digits = obj.arrayOfDigits(num);
        double[] sum = new double[2];
        sum = obj.sumOfDigitsAndSquareOfDigits(digits);
        System.out.println("Sum of the digits is : " + sum[0]);
        System.out.println("Sum of the square of digits is : " + sum[1]);
        int[] freq = new int[10];
        freq = obj.frequency(digits);
        System.out.println("The frequency of the digits is :");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(freq[i] + " ");
        }
    }
}
