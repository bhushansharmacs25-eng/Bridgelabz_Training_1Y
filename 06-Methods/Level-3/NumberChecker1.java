package Level_3;
import java.util.Scanner;
public class NumberChecker1 {
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

    public String duckNumber(int[] a) {
        String s = "It is Not a Duck Number";
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                s = "It is a Duck Number";
            }
        }
        return s;
    }

    public String armstrongNumber(int[] a) {
        String s = "It is Not an Armstrong Number";
        int count = a.length;
        double op = 1;
        double sum = 0;
        double num = 0;
        for (int i = 0; i < count; i++) {
            op = Math.pow(a[i], count);
            sum += op;
            num = (num * 10) + a[i];
        }
        if (num == sum) {
            s = "It is an Armstrong Number";
        }
        return s;
    }

    public int[] largestAndSecondLargest(int[] a) {
        int[] l = new int[2];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        l[0] = max;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                a[i] = 0;
            }
        }
        max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        l[1] = max;
        return l;
    }

    public int[] smallestAndSecondSmallest(int[] a) {
        int[] s = new int[2];
        int min = a[0] ;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        s[0] = min;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == min) {
                a[i] = 10;
            }
        }
        min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        s[1] = min;
        return s;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        NumberChecker1 obj = new NumberChecker1();
        int c = obj.countofDigits(num);
        System.out.println("The number of digits in the number is : " + c);
        int[] digits = new int[c];
        digits=obj.arrayOfDigits(num);
        System.out.println("Check whether it is a duck number or not :");
        System.out.println(obj.duckNumber(digits));
        System.out.println("Check whether it is an armstrong number or not :");
        System.out.println(obj.armstrongNumber(digits));
        System.out.println("The largest and second largest number in the array :");
        int[] large = new int[2];
        large = obj.largestAndSecondLargest(digits);
        System.out.println("Largest--" + large[0]);
        System.out.println("Second Largest--" + large[1]);
        System.out.println("The smallest and second smallest number in the array :");
        int[] small = new int[2];
        small = obj.smallestAndSecondSmallest(digits);
        System.out.println("Smallest--" + small[0]);
        System.out.println("Second Smallest--" + small[1]);
    }
}
