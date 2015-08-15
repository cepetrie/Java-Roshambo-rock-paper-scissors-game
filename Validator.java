/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roshamboapp;

import java.util.Scanner;

/**
 *
 * @author Christina
 */
public class Validator {
     public static String get_String(String prompt)
    {
        String s = "";
        boolean isValid = false;
        Scanner sc = new Scanner(System.in);
        
        while (!isValid)        
        { 
        // loops until user enters a non-blank line
        System.out.print(prompt);
        s = sc.nextLine();
        if (!s.equals(""))
        isValid = true;
        }
        return s;
    }

public static String getString(String prompt){

   String s = null;
   boolean isValid = false;
   while (!isValid)
   {

   s = get_String(prompt);
   if (s.compareTo("Y") == 0 || s.compareTo("y") == 0 || s.compareTo("N") == 0 || s.compareTo("n") == 0)

   isValid = true;
   else
   System.out.println("Error! Entry must be 'y' or 'n'. Try again.");

   }

   return s;

   }

}