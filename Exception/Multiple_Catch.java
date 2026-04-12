package com.Exception;

import java.util.Scanner;

public class Multiple_Catch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("Enter size of array");
            int a=s.nextInt();
            int[] arr=null;
            if(a>0){
                arr=new int[a];
                System.out.println("Enter values of array");
                for(int i=0; i<arr.length; i++){
                    arr[i]=s.nextInt();
                }
                System.out.println("Enter the array index");
                int i=s.nextInt();
                System.out.println("Array at index "+i+" is: "+arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }
        catch(NullPointerException e){
            System.out.println("Array is not initialized!");
        }
    }
}
