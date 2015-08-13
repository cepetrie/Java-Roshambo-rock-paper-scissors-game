/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roshamboapp;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Christina
 */
public class RoshamboApp
{
   public static void main(String args[])
   {
       String choice='y';
       char player;
       
       Scanner s=new Scanner(System.in);
       
    
       
       System.out.println("Welcome to the game of Roshambo");
       
       Bart b=new Bart(); //create 2-objects of Bart and lisa
       Lisa l=new Lisa();
       
       Player p=null;
       
       String name;
       
       System.out.println("Enter your name : ");
       
       //input name
       name=s.next(); 
       
       System.out.println("Would you like to play Bart or Lisa?(B/L):");
       //playing neighbour choice
       player=s.next().charAt(0); 
       
       //either bart
       if(player=='b') 
            p=b;
       //or lisa
       else if(player=='l') 
            p=l;
      
       while(choice.equalsIgnoreCase("y")) //repeating loop
           
       {
           System.out.println("Rock, paper or scissors?(R/P/S)");
           String rps = s.next();
                              
           Player1 p1=new Player1();
           p1.setName(name);
           
           System.out.println(name+ ":" + rps);
           
           System.out.println(p.getName()+ ":" + p.generateRoshambo());
          
           if(rps == p.generateRoshambo())
               System.out.println("Draw!");
           else if(p1.generateRoshambo()==Roshambo.PAPER && p.generateRoshambo()==Roshambo.ROCK)
               System.out.println(p1.getName()+" Wins");
           else if(p1.generateRoshambo()==Roshambo.PAPER && p.generateRoshambo()==Roshambo.SCISSORS)
               System.out.println(p.getName()+" Wins!");
           else if(p1.generateRoshambo()==Roshambo.SCISSORS && p.generateRoshambo()==Roshambo.ROCK)
               System.out.println(p.getName()+" Wins");
           System.out.println("Play again?(y/n):");
           choice=s.next().charAt(0); //input repeat choice
       }
   }
}
