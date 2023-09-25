package com.Java;

import java.util.Scanner;

public class GetInputFromUser {

    public static void main(String[] args) {
        int a;
        long b;
        float c;
        double d;
        boolean e;

        Scanner sc = new Scanner(System.in);
      //*******************************************************************//
        // for Integer Value
        System.out.println("Pass any Integer Value here:");
        a = sc.nextInt();
        System.out.println("Your Number is: " + a);
      //*******************************************************************//
        // for Long Value
        System.out.println("Pass any long value here:");
        String longInput = sc.next();
        // Remove the "L" suffix if present
        if (longInput.endsWith("L") || longInput.endsWith("l")) {
            longInput = longInput.substring(0, longInput.length() - 1);
        }
        // Parse the string to a long
        b = Long.parseLong(longInput);
        System.out.println("Your long Value is: " + b+"L");
        
        //*******************************************************************//
        //for float value . 
        System.out.println("Pass any float value here:");
        String floatInput = sc.next();
        // Remove the "f" or "F" suffix if present
        if (floatInput.endsWith("F") || floatInput.endsWith("f")) {
            floatInput = floatInput.substring(0, floatInput.length() - 1);
        }
        // Parse the string to a float
        c = Float.parseFloat(floatInput);
        System.out.println("Your float Value is: " + c+"f"); 
        
      //*******************************************************************//
        // for double value;
        System.out.println("Pass any double value :");
        d = sc.nextDouble(); 
        System.out.println("Your Double Value is : "+ d);  
        
      //*******************************************************************//
        // for boolean value .
        System.out.println("Pass any boolean (true / false ) :");
        e = sc.nextBoolean();
        System.out.println("You are Opted in boolean :"+e);
        
        System.out.println("Thank You so Much");
    }
}

