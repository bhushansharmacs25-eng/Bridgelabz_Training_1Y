package com.gla.Level_1;
import java.util.Scanner;
public class Characters {
     public char[] userDefinedMethod(String str)
     {
         char arr[]=new char[str.length()];
         for(int i=0;i<str.length();i++)
         {
             arr[i]=str.charAt(i);
         }
         return arr;
     }
     public boolean compareArrays(char[] arr1,char[] arr2)
     {
         if(arr1.length!=arr2.length)
         {
             return false;
         }
         for(int i=0;i<arr1.length;i++)
         {
             if(arr1[i]!=arr2[i]){
                 return false;
             }
         }
         return true;
     }
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the string");
         String s=sc.next();
         Characters obj=new Characters();
         char[] s1=obj.userDefinedMethod(s);
         char[] s2=s.toCharArray();
         boolean result=obj.compareArrays(s1,s2);
         System.out.println("Characters using user defined method");
         for(int i=0;i<s.length();i++)
         {
             System.out.print(s1[i]+" ");
         }
         System.out.println("\nCharacters using in built method");
         for(int i=0;i<s.length();i++)
         {
             System.out.print(s2[i]+" ");
         }
         System.out.println("\nDoes the two methods give the result (true=Yes, false=No)");
         System.out.println(result);
     }
}
