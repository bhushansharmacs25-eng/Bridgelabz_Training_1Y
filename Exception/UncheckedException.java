package com.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("Enter two numbers");
            int a=s.nextInt();
            int b=s.nextInt();
            int r=a/b;
            System.out.println("Division is: "+r);
        }catch (ArithmeticException e){
            System.out.println(e+ " Number can't be divide by zero");
        }
        catch (InputMismatchException e){
            System.out.println(e+" Please enter numeric value");
        }

    }
}
