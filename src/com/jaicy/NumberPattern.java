package com.jaicy;

public class NumberPattern {
     public static void main(String[] args) {
    	 numberPattern(5);   //5=no of rows
     }
     
     public static void numberPattern(int n) {
    	 
    	 for(int i = 1; i <= n; i++) {

             int decrement = i - 1;

             for(int j = 1; j <= n - i; j++) {
                 System.out.print("  "); //printing spaces
             }

             for(int j = 1; j <= i; j++) {
                 System.out.print(j+" ");//printing numbers of columns
             }

             for(int j = 2; j <= i; j++) {
                 System.out.print(decrement+" ");//printing numbers of columns
                 decrement--;
             }

             System.out.println();
         }
     }
    	 
     
}
