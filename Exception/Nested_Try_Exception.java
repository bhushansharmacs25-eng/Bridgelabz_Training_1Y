package com.Exception;

import java.util.Scanner;

public class Nested_Try_Exception {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            int[] arr=new int[5];
            System.out.println("Enter the value of Arrays of index 5");
            for(int i=0; i<5; i++){
                arr[i]=s.nextInt();
            }
            System.out.println("Enter the index value");
            int i=s.nextInt();
            System.out.println("Enter divisor");
            int a=s.nextInt();
            try{
                System.out.println("Value at index " +i+ " is: "+arr[i]);
                int r=arr[i]/a;
                System.out.println("Result: "+r);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index invalid");
            }
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
