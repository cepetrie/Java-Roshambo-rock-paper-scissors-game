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
  
     public static String getString(String prompt)
        {
           String s = "";
        boolean isValid = false;

        while (!isValid) // loops until user enters a non-blank line
        {
        System.out.print(prompt);
        s = sc.nextLine();
        if (!s.equals(""))
        isValid = true;
        }
        return s;
        }   
    
    public static String getString(Scanner sc, String prompt, String y, String n)
    {
        String s = null;
        boolean isValid = false;
        while (!isValid)
        {
            s = getString(sc,prompt);
            if (s.equalsIgnoreCase("y") ||s.equalsIgnoreCase("n"))
                isValid = true;
            else
                System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
        }
        return s;
    }  
 }
