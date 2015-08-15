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
public class RoshamboApp
{
   public static void main(String args[])
   {
        Scanner s=new Scanner(System.in);
        String choice="y";
        char player;
        Player p = null;
        String name;

        //create 2-objects of Bart and lisa
        Bart b=new Bart();
        Lisa l=new Lisa();
        System.out.println("Welcome to the game of Roshambo\n");
    
        // input name
        name = Validator.get_String("Enter your name : ");
        String playerChoice = Validator.get_String("Would you like to play Bart or Lisa?(B/L): ");

        //playing neighbour choice
        player = playerChoice.charAt(0);

        //either bart
        if(player=='b' || player == 'B') p=b;
        
        //or lisa
        else if(player=='l' || player == 'L') p=l;  

        //set exact name Bart for b|B, Lisa for l|L
        if(playerChoice.charAt(0)=='b' || playerChoice.charAt(0) == 'B') playerChoice="Bart";
        else if(playerChoice.charAt(0)=='l' || playerChoice.charAt(0) == 'L') playerChoice="Lisa";
        p.setName(playerChoice);  

      //repeating loop with character variable choice
      while(choice.compareTo("y") == 0)
      {
        System.out.print("Rock, paper or scissors?(R/P/S) : ");
        String rps = s.next();
        Player1 p1=new Player1();
        p1.setName(name);
        p1.setResponse(rps);

        //set Rock for r|R ,Paper for p|P, Scissors for s|S
        if(rps.charAt(0)=='r' || rps.charAt(0) == 'R') rps="Rock";
        else if(rps.charAt(0)=='p' || rps.charAt(0) == 'P') rps="Paper";
        else if(rps.charAt(0)=='s' || rps.charAt(0) == 'S') rps="Scissors";
        System.out.println(name+ " : " + rps);

        //main logic generate random number only ones.Each time it will give different number
        String roshambo=p.generateRoshambo().toString(); //generate opponent's roshambo
        System.out.println(p.getName()+ " : " +roshambo );

        //match generated random number to rashambo enterd by user for all cases
        if(Character.toUpperCase(rps.charAt(0)) == roshambo.charAt(0))
        System.out.println("Draw!");

        else if(rps.equals("Paper") && roshambo.equals("Rock"))
        System.out.println(p1.getName()+" Wins");

        else if(roshambo.equals("Paper") && rps.equals("Rock"))
        System.out.println(p.getName()+" Wins");

        else if(rps.equals("Paper") && roshambo.equals("Scissors"))
        System.out.println(p.getName()+" Wins!");

        else if(roshambo.equals("Paper") && rps.equals("Scissors"))
        System.out.println(p1.getName()+" Wins!");

        else if(rps.equals("Scissors") && roshambo.equals("Rock"))
        System.out.println(p.getName()+" Wins");

        else if(roshambo.equals("Scissors") && rps.equals("Rock"))
        System.out.println(p1.getName()+" Wins");

        // see if the user wants to continue
        choice = Validator.getString("Play again?(y/n): ");

        System.out.println();

   }

 }

}