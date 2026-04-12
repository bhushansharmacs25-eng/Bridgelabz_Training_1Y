package com.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class finally_Block_Execution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("Enter two numbers");
            int a=s.nextInt();
            int b=s.nextInt();
            double r=a/b;
            System.out.println("Division is: "+r);
        }catch (ArithmeticException e){
            System.out.println(e+ " Number can't be divide by zero");
        }
        finally {
            System.out.println("Operation completed");
        }

    }
}
