/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortlistapp;

import java.util.Scanner;

/**
 *
 * @author Christina
 */
public class Validator 
{
     public static int vScore(Scanner sc, String prompt)
    {
        int sScore =0;
        boolean isValid=false;
        
        while (isValid==false)
        {
            System.out.print(prompt);
            sScore=sc.nextInt();
            if (sScore>100||sScore<0) 
            {
                System.out.println("Error! Please enter a score that is between 0 to 100");
            }
            else
            {
                isValid=true;
            }
            
        }
        return sScore;
        
    }
    

    
    public static String firstName(Scanner sc, String prompt)
    {
        Scanner input =new Scanner(System.in);
        String  StudentName="";
        boolean isvalid=false;
       

        while (isvalid==false)
        {
          
            System.out.print(prompt);

            StudentName = input.nextLine();

            if (StudentName == null || StudentName.equals(""))
            {
                System.out.println("Error! You must enter a name.");
            }
           
            else 
              
            {
               isvalid=true;
             
            }
         
        }
        return StudentName; 
        
    }     
    
}
    

