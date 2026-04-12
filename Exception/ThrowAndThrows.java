package com.Exception;

import java.util.Scanner;

public class ThrowAndThrows {
    public static double calculateInterest(double amt, double rate, int years)
            throws IllegalArgumentException {
            if (amt < 0 || rate < 0) {
                throw new IllegalArgumentException("Amount and rate should be positive");
            }
        return (amt*rate*years)/100;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        try{
            System.out.println("Enter Amount, Rate and Years in sequence");
            double amt=s.nextDouble();
            double rate=s.nextDouble();
            int years=s.nextInt();
            double Interest= calculateInterest(amt,rate,years);
            System.out.println("Interest is: "+Interest);
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
