/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortlistapp;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Christina
 */
public class SortListApp {/**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
       
        System.out.println("Welcome to the Student Scores Application."+"\n");
        //instantiate Scanner Object
        Scanner sc = new Scanner(System.in);   
        
        System.out.print("Enter number of students to enter: ");
        
        //input stream takes in an integer value       
        int numberofStudent = sc.nextInt();
        
        //create an array to store student name and Score
        Student[] s = new Student[numberofStudent]; 
       
        //code that prints an array of students name and score to the console       
        int y=0;
        for( int i=1; i<=numberofStudent; i++)
        {            
            System.out.println("");
            String StudentFirstName = Validator.firstName(sc , "Student " + i + " First name: "); 
            String studentLastName = Validator.firstName(sc , "Student " + i + " Last  name: ");
            int studentScore= Validator.vScore(sc,"Student " + i + " score : ");
            
            //stores student information in an array
            s[y] = new Student(StudentFirstName, studentLastName , studentScore);
            
            // increament the array index
            y=y+1;    
        }
        
   
        System.out.println("");
        
        Arrays.sort(s,0,numberofStudent); 
        for(Student i: s)
        
        System.out.println(i.getlastName()+", "+i.getfirstName()+": "+i.getScore()); 
        
        
      }   
   
    
}